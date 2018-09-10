package solution

import test.helper.UnitSpec

class Answer13Spec extends UnitSpec {
  describe("Problem 13") {
    it("should be correct") {
      val ans1 = Answer13.solve(List(-1, 3, -1, 5, 4), 2)
      ans1 shouldBe 4

      val ans2 = Answer13.solve(List(2, 4, -2, -3, 8), 1)
      ans2 shouldBe 8

      val ans3 = Answer13.solve(List(-5, -3, 1), 3)
      ans3 shouldBe -5

      val ans4 = Answer13.solve(List(2, 1), 2)
      ans4 shouldBe 1

      val ans5 = Answer13.solve(List(1, 1, 1, 1, 1), 2)
      ans5 shouldBe 1

      val ans6 = Answer13.solve(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 1000), 3)
      ans6 shouldBe 8

      val ans7 = Answer13.solve(List(338, 304, 619, 95, 343, 496, 489, 116, 98, 127), 3)
      ans7 shouldBe 489

      val ans8 = Answer13.solve(List(931, 240, 986, 894, 826, 640, 965, 833, 136, 138), 3)
      ans8 shouldBe 931

      val ans9 = Answer13.solve(List(940, 955, 364, 188, 133, 254, 501, 122, 768, 408), 3)
      ans9 shouldBe 768
    }
  }
}
