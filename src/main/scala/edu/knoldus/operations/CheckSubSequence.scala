package edu.knoldus.operations

class CheckSubSequence[T] {

  def hasSubSequence(listToBeChecked: List[T], sequence: List[T]): Boolean = {
    if (sequence.length == 1 && listToBeChecked.contains(sequence(0))) {
      true
    } else if (listToBeChecked.isEmpty || sequence.isEmpty) {
      throw new RuntimeException
    } else {
      subSequenceHelper(listToBeChecked, sequence)
    }
  }

  private def subSequenceHelper(listToCheck: List[T], sequenceToCheck: List[T]): Boolean = {

    listToCheck match {
      case head :: Nil =>
        sequenceToCheck match {
          case head2 :: Nil => if (head == head2) true else false
          case head2 :: tail => false
        }
      case head :: tail =>
        sequenceToCheck match {
          case head2 :: Nil =>
            if (head == head2) true else false
          case head2 :: tail2 =>
            if (head2 == head) {
              subSequenceHelper(tail, tail2)
            } else {
              subSequenceHelper(tail, sequenceToCheck)
            }
        }
    }
  }

}
