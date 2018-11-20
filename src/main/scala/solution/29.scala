package solution

import collection.mutable.PriorityQueue

object Answer29 {
  case class CharNum(val value: Int, val char: Char)

  object CharNum {
    def order(cn: CharNum): Int = cn.value
  }

  def solve(input: String): String = {
    val extractedCharNums: List[CharNum] = extractCharNums(input)

    val priorityQueue: PriorityQueue[CharNum] =
      PriorityQueue()(Ordering.by(CharNum.order))

    extractedCharNums.foreach { charNum =>
      priorityQueue += charNum
    }

    getAnswer(priorityQueue, "")
  }

  private def extractCharNums(input: String): List[CharNum] = {
    def loop(input: List[Char], map: Map[Char, Int]): Map[Char, Int] =
      input match {
        case Nil => map
        case s :: tail => {
          if (map contains s) loop(tail, (map + (s -> (map(s) + 1))))
          else loop(tail, (map + (s -> 1)))
        }
      }

    val results: Map[Char, Int] = loop(input.toList, Map[Char, Int]())

    results.keys.toList.map{ e =>
      CharNum(results(e), e)
    }
  }

  private def getAnswer(
    priorityQueue: PriorityQueue[CharNum],
    answer: String
  ): String = {
    if (priorityQueue.isEmpty) answer
    else if (answer != "" && priorityQueue.head.char == answer.last) {
      val headCharNum = priorityQueue.dequeue
      if (priorityQueue.isEmpty) ""
      else {
        val nextHeadCharNum = priorityQueue.dequeue
        if (nextHeadCharNum.value > 1) {
          val newNextHeadCharNum = CharNum(nextHeadCharNum.value - 1, nextHeadCharNum.char)
          priorityQueue.enqueue(newNextHeadCharNum)
        }
        priorityQueue.enqueue(headCharNum)
        getAnswer(priorityQueue, answer ++ nextHeadCharNum.char.toString)
      }
    }
    else {
      val headCharNum = priorityQueue.dequeue
      if (headCharNum.value > 1) {
        val newCharNum = CharNum(headCharNum.value - 1, headCharNum.char)
        priorityQueue.enqueue(newCharNum)
      }
      getAnswer(priorityQueue, answer ++ headCharNum.char.toString)
    }
  }
}
