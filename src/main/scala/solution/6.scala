package solution

object Answer6 {
  def solve(input: List[List[Int]]): List[List[Int]] = {
    getSegments(sortBySegFrom(input), List())
  }

  private def sortBySegFrom(input: List[List[Int]]): List[List[Int]] =
    input.sortWith(_.head < _.head)

  private def getSegments(input: List[List[Int]], acc: List[List[Int]]): List[List[Int]] = input match {
    case Nil => acc
    case seg :: inputTail => {
      if (acc.isEmpty) getSegments(inputTail, seg :: acc)
      else {
        val beforeSeg: List[Int] = acc.last
        val beforeFrom: Int = beforeSeg.head
        val beforeTo: Int = beforeSeg.last

        val currFrom: Int = seg.head
        val currTo: Int = seg.last
        if (currFrom <= beforeTo && currTo > beforeTo) getSegments(inputTail, acc.init ::: List(List(beforeFrom, currTo)))
        else if (currFrom <= beforeTo) getSegments(inputTail, acc)
        else getSegments(inputTail, acc ::: List(seg))
      }
    }
  }
}