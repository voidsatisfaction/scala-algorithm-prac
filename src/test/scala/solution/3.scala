package solution

import test.helper.UnitSpec

class AnswerSpec extends UnitSpec {
  describe("Answer3") {
    it("should be correct") {
      Answer3.parensisPairs(1).sorted shouldBe List("()").sorted
      Answer3.parensisPairs(2).sorted shouldBe List("(())", "()()").sorted
      Answer3.parensisPairs(3).sorted shouldBe List("((()))", "(()())", "()(())", "(())()", "()()()").sorted
    }
  }
}