package solution

object Answer9 {
  def solve(nums: Array[Int]): Array[Int] = {
    def moveZero(zeroFound: Boolean, leftZeroIndex: Int, index: Int): Unit = {
      if (index == nums.length) return
      else if (!zeroFound && nums(index) != 0) moveZero(false, leftZeroIndex+1, index+1)
      else if (!zeroFound) moveZero(true, leftZeroIndex, index+1)
      else if (zeroFound && nums(index) == 0) moveZero(true, leftZeroIndex, index+1)
      else {
        swap(leftZeroIndex, index)
        moveZero(true, leftZeroIndex+1, index+1)
      }
    }

    def swap(i: Int, j: Int): Unit = {
      val temp = nums(i)
      nums(i) = nums(j)
      nums(j) = temp
    }

    moveZero(false, 0, 0)
    nums
  }
}