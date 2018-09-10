package solution

import test.helper.UnitSpec

class Answer14Spec extends UnitSpec {
  describe("Answer14") {
    it("should be corret") {
      val ans1 = Answer14.solve(List("apple", "apps", "ape"))
      ans1 shouldBe "ap"

      val ans2 = Answer14.solve(List("hawaii", "happy"))
      ans2 shouldBe "ha"

      val ans3 = Answer14.solve(List("dog", "dogs", "doge"))
      ans3 shouldBe "dog"
    }
  }
}
