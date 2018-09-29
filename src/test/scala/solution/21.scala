import test.helper.UnitSpec

class Answer21Spec extends UnitSpec {
  describe("Answer21") {
    it("should be correct") {
      val l1 = List(3, 2, 1, 5, 6, 2, 3, 2, 4)
      val l2 = List(1)
      val l3 = List()
      val l4 = List(3, 2)

      val res1 = Answer21.solve(l1)
      val res2 = Answer21.solve(l2)
      val res3 = Answer21.solve(l3)
      val res4 = Answer21.solve(l4)

      res1 shouldBe List(1, 2, 2, 2, 3, 3, 4, 5, 6)
      res2 shouldBe List(1)
      res3 shouldBe List()
      res4 shouldBe List(2, 3)
    }
  }
}
