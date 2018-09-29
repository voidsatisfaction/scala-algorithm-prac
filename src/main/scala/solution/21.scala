object Answer21 {
  def solve(list: List[Int]): List[Int] = {
    mergeSort(list)
    quickSort(list)
  }

  def mergeSort(list: List[Int]): List[Int] = {
    def merge(list1: List[Int], list2: List[Int]): List[Int] = {
      if (list1.isEmpty) list2
      else if (list2.isEmpty) list1
      else {
        val head1 = list1.head
        val head2 = list2.head
        if (head1 < head2) head1 :: merge(list1.tail, list2)
        else head2 :: merge(list1, list2.tail)
      }
    }

    if (list.length <= 1) list
    else {
      val mid = (list.length - 1) / 2
      val list1 = list.take(mid+1)
      val list2 = list.drop(mid+1)
      val sorted1 = mergeSort(list1)
      val sorted2 = mergeSort(list2)
      merge(sorted1, sorted2)
    }
  }

  def quickSort(list: List[Int]): List[Int] = {
    if (list.length <= 1) list
    else if (list.length == 2 && list.head < list.tail.head) list
    else if (list.length == 2) list.reverse
    else {
      val (sorted, pibotIndex) = sort(list, 0, 1, list.length-1)
      val front = sorted.take(pibotIndex)
      val back = sorted.drop(pibotIndex+1)
      quickSort(front) ::: (sorted(pibotIndex) :: quickSort(back))
    }
  }

  def sort(list: List[Int], pibotIndex: Int, a: Int, b: Int): (List[Int], Int) = {
    if (a == b) {
      if (list(a) >= list(pibotIndex)) (swap(list, pibotIndex, a-1), a-1)
      else (swap(list, pibotIndex, a), a)
    }
    else {
      if (list(a) >= list(pibotIndex)) sort(swap(list, a, b), pibotIndex, a, b-1)
      else sort(list, pibotIndex, a+1, b)
    }
  }

  private def swap(list: List[Int], a: Int, b: Int): List[Int] = list.updated(a, list(b)).updated(b, list(a))
}
