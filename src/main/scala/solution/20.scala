package solution

object Answer20 {
  def solve(input: List[Int]): Boolean = {
    def loop(index: Int, num: Int): Int = {
      if (num == 0) index
      else loop(input(index), num-1)
    }

    loop(0, input.length) == 0
  }
}
