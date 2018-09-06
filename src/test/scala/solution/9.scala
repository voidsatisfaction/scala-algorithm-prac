package solution

import test.helper.UnitSpec

class Answer9Spec extends UnitSpec {
  describe("Answer9") {
    it("should be correct") {
      val ans1 = Answer9.solve(Array(0, 5, 0, 3, -1))
      ans1 shouldBe Array(5, 3, -1, 0, 0)

      val ans2 = Answer9.solve(Array(3, 0, 3))
      ans2 shouldBe Array(3, 3, 0)
    }
  }
}
