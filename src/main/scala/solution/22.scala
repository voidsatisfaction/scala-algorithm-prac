package solution

object Answer22 {
  def solve(input: List[Int], k: Int): List[Int] = {
    val l = input.length
    val p = k % l

    val front = input.take(p).customReverse
    val back = input.drop(p).customReverse

    (front ::: back).customReverse
  }

  implicit class ListExtends[A](list: List[A]) {
    def customReverse(): List[A] = {
      def loop(these: List[A], result: List[A]): List[A] = {
        these match {
          case Nil => result
          case head :: tail => loop(tail, head :: result)
        }
      }

      loop(list, Nil)
    }
  }
}
