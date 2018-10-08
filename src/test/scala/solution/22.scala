package solution

import test.helper.UnitSpec

class Answer22Spec extends UnitSpec {
  describe("Answer22") {
    it("should be correct") {
      val ans1 = Answer22.solve(List(1, 2, 3, 4, 5), 2)
      val ans2 = Answer22.solve(List(0, 1, 2, 3, 4), 1)

      ans1 shouldBe List(3, 4, 5, 1, 2)
      ans2 shouldBe List(1, 2, 3, 4, 0)
    }
  }
}
