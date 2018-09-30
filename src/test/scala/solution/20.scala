package solution

import test.helper.UnitSpec

class Answer20Spec extends UnitSpec {
  describe("Answer20") {
    it("should be correct") {
      val l1 = List(1, 2, 4, 0, 3)
      val l2 = List(1, 4, 5, 0, 3, 2)
      val l3 = List(1, 2, 2, 0)

      val ans1 = Answer20.solve(l1)
      ans1 shouldBe true

      val ans2 = Answer20.solve(l2)
      ans2 shouldBe false

      val ans3 = Answer20.solve(l3)
      ans3 shouldBe false
    }
  }
}
