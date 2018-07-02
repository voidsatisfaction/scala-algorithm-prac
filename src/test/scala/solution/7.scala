package solution

import test.helper.UnitSpec

class Answer7Spec extends UnitSpec {
  describe("Answer7") {
    describe("solve") {
      it("should be correct") {
        Answer7.solve("abc 123 apple") shouldBe "cba 321 elppa"
      }
    }

    // describe("solveHard") {
    //   it("should be correct") {
    //     Answer7.solveHard("abc 123 apple") shouldBe "cba 321 elppa"
    //   }
    // }
  }
}