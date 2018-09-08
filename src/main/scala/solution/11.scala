package solution

object Answer11 {
  def solve(str1: String, str2: String): Boolean = {
    def canEncryptRec(strList1: List[Char], strList2: List[Char], func: Map[Char, Char]): Boolean = {
      if (strList1.length == 0 && strList2.length == 0) true
      else if (strList1.length == 0) false
      else if (strList2.length == 0) false
      else {
        val c1: Char = strList1.head
        val c2: Char = strList2.head
        func.get(c1) match {
          case None => canEncryptRec(strList1.tail, strList2.tail, func + (c1 -> c2))
          case Some(v) => {
            if (v != c2) false
            else canEncryptRec(strList1.tail, strList2.tail, func)
          }
        }
      }
    }
    canEncryptRec(
      str1.split("").toList.map(_.charAt(0)),
      str2.split("").toList.map(_.charAt(0)),
      Map[Char, Char]()
    )
  }
}
