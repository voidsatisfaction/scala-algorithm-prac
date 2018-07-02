package solution

import test.helper.UnitSpec

class Answer8Spec extends UnitSpec {
  describe("Answer8") {
    it("should be correct") {
      val Right(ans1) = Answer8.solve(List(10, 5, 4, 3, -1))
      ans1 shouldBe 5

      val Left(ans2) = Answer8.solve(List(3, 3, 3))
      ans2 shouldBe "Does not exist"
    }
  }
}