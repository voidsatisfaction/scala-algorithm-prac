package solution

object Answer13 {
  def solve(input: List[Int], num: Int): Int = {
    quickSelect(input, num)
  }

  def quickSelect(input: List[Int], num: Int): Int = {
    if (input.length == 0) -1
    else if (input.length < num) -1
    else if (input.length == 1 && num == 1) input.head
    else if (input.length == 1) -1
    else {
      val l = input.length
      val pibotIndex = 0
      val a = 1
      val b = l-1

      val (sorted, afterPibotIndex) = sort(input, pibotIndex, a, b)
      if (l - afterPibotIndex == num) sorted(afterPibotIndex)
      else if (l - afterPibotIndex < num) quickSelect(
        sorted.take(afterPibotIndex),
        num - (l - afterPibotIndex)
      )
      else quickSelect(
        sorted.drop(afterPibotIndex+1),
        num
      )
    }
  }

  def sort(list: List[Int], pibotIndex: Int, a: Int, b: Int): (List[Int], Int) = {
    if (a == b) {
      if (list(a) > list(pibotIndex)) (swap(list, pibotIndex, a-1), a-1)
      else (swap(list, 0, a), a)
    }
    else {
      if (list(a) > list(pibotIndex)) sort(swap(list, a, b), pibotIndex, a, b-1)
      else sort(list, pibotIndex, a+1, b)
    }
  }

  private def swap(list: List[Int], a: Int, b: Int): List[Int] = list.updated(a, list(b)).updated(b, list(a))
}
