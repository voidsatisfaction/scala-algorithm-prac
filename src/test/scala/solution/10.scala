package solution

import test.helper.UnitSpec

class Answer10Spec extends UnitSpec {
  describe("problem10") {
    it("should be correct") {
      val ans1 = Answer10.solve("aabcbcbc")
      ans1 shouldBe "abc"

      val ans2 = Answer10.solve("aaaaaaaa")
      ans2 shouldBe "a"

      val ans3 = Answer10.solve("abbbcedd")
      ans3 shouldBe "bced"
    }
  }
}
