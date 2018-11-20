package solution

import test.helper.UnitSpec

class Answer29Spec extends UnitSpec {
  private def meetCondition(input: String): Boolean = {
    if (input.size == 0) false
    else if (input.size == 1) true
    else if (input(1) == input(0)) false
    else meetCondition(input.drop(1))
  }

  describe("Answer29") {
    it("sould be correct") {
      val input1 = "aaabbc"
      val input2 = "aaac"

      val ans1 = Answer29.solve(input1)
      meetCondition(ans1) shouldBe true

      val ans2 = Answer29.solve(input2)
      ans2 shouldBe ""
    }
  }
}
