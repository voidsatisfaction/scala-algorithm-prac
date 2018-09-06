package solution

object Answer10 {
  def solve(input: String): String = {
    def getLongestUniqueSeq(inputList: List[String], longestUniqueSeq: List[String], set: Set[String]): String = {
      inputList match {
        case Nil => longestUniqueSeq.mkString("")
        case s :: rest => {
          if (set contains s) longestUniqueSeq.mkString("")
          else getLongestUniqueSeq(rest, longestUniqueSeq ::: List(s), set + s)
        }
      }
    }

    def solveRec(inputList: List[String], longestUniqueSeqString: String): String = {
      inputList match {
        case Nil => longestUniqueSeqString
        case s :: rest => {
          val candidate = getLongestUniqueSeq(inputList, List(), Set())
          if (candidate.length > longestUniqueSeqString.length) solveRec(rest, candidate)
          else solveRec(rest, longestUniqueSeqString)
        }
      }
    }

    val inputList = input.split("").toList
    solveRec(inputList, "")
  }
}
