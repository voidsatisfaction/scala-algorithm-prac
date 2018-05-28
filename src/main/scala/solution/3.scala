package solution

import scala.collection.mutable.ListBuffer

object Answer3 {
  def parensisPairs(n: Int): ListBuffer[String] = {
    val answer: ListBuffer[String] = ListBuffer()

    def parensisPairsHelper(open: Int, close: Int, state: String): Unit = {
      if (open == 0 && close == 0) answer += state
      else if (open == 0) parensisPairsHelper(open, close-1, state + ")")
      else if (open == close) parensisPairsHelper(open-1, close, state + "(")
      else {
        parensisPairsHelper(open-1, close, state + "(")
        parensisPairsHelper(open, close-1, state + ")")
      }
    }

    parensisPairsHelper(n, n, "")
    answer
  }
}