package solution

import test.helper.UnitSpec

class Answer13Spec extends UnitSpec {
  describe("Problem 13") {
    it("should be correct") {
      val ans1 = Answer13.solve(List(-1, 3, -1, 5, 4), 2)
      println(ans1)
      ans1 shouldBe 4

      val ans2 = Answer13.solve(List(2, 4, -2, -3, 8), 1)
      ans2 shouldBe 8

      val ans3 = Answer13.solve(List(-5, -3, 1), 3)
      ans3 shouldBe -5

      val ans4 = Answer13.solve(List(2, 1), 2)
      ans4 shouldBe 1

      val ans5 = Answer13.solve(List(1, 1, 1, 1, 1), 2)
      ans5 shouldBe 1
    }
  }
}
