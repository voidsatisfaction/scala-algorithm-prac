package solution

object Answer14 {
  def solve(strs: List[String]): String = {
    getLongestCommonPrefixRec(strs, 0, "", strs.getLeastWordLength)
  }

  def getLongestCommonPrefixRec(strs: List[String], i: Int, prefix: String, leastWordLength: Int): String = {
    if (i == leastWordLength) prefix
    else if (!checkStrHasSameCharacter(strs, i, strs.head(i))) prefix
    else getLongestCommonPrefixRec(strs, i+1, prefix + strs.head(i), leastWordLength)
  }

  private def checkStrHasSameCharacter(strs: List[String], i: Int, c: Char): Boolean =
    strs.foldLeft(true){ (acc: Boolean, str: String) => acc && (str(i) == c) }

  implicit class ListExtend(strs: List[String]) {
    def getLeastWordLength(): Int =
      strs.map(_.length).reduceLeft(_ min _)
  }
}
