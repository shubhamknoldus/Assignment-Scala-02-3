package edu.knoldus.operations

class ConcatenateList[T] {

  def concate(firstList: List[T], secondList: List[T]): List[T] = {
    if (firstList.length >= secondList.length) {
      secondList.foldLeft(firstList)((remain, elemnt) => elemnt :: remain)
    } else {
      firstList.foldLeft(secondList)((remain, element) => element :: remain)
    }
  }

}
