package solution

import test.helper.UnitSpec

class Answer11Spec extends UnitSpec {
  describe("Answer11") {
    it("should be correct") {
      val ans1 = Answer11.solve("EGG", "FOO")
      ans1 shouldBe true

      val ans2 = Answer11.solve("ABBCD", "APPLE")
      ans2 shouldBe true

      val ans3 = Answer11.solve("AAB", "FOO")
      ans3 shouldBe false
    }
  }
}
