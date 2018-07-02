package solution

import test.helper.UnitSpec

class Answer6Spec extends UnitSpec {
  describe("Answer6") {
    it("should be correct") {
      Answer6.solve(List(List(2,4), List(1,5), List(7,9))) shouldBe List(List(1,5), List(7,9))
      Answer6.solve(List(List(3,6), List(1,3), List(2,4))) shouldBe List(List(1,6))
      Answer6.solve(List(List(1,1))) shouldBe List(List(1,1))
    }
  }
}