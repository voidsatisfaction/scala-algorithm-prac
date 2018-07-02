package solution

object Answer8 {
  def solve(nums: List[Int]): Either[String, Int] = {
    getSecondMaxmimum(nums, None, None).toRight("Does not exist")
  }

  def getSecondMaxmimum(nums: List[Int], max: Option[Int], secondMax: Option[Int]): Option[Int] = nums match {
    case Nil => secondMax
    case num :: numsTail => {
      max match {
        case None => getSecondMaxmimum(numsTail, Some(num), secondMax)
        case Some(maxNum) => {
          if (num > maxNum) getSecondMaxmimum(numsTail, Some(num), max)
          else if (num == maxNum) getSecondMaxmimum(numsTail, Some(num), secondMax)
          else secondMax match {
            case None => getSecondMaxmimum(numsTail, max, Some(num))
            case Some(secondMaxNum) => {
              if (num > secondMaxNum) getSecondMaxmimum(numsTail, max, Some(num))
              else getSecondMaxmimum(numsTail, max, secondMax)
            }
          }
        }
      }
    }
  }
}