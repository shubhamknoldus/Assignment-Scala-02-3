package edu.knoldus.operations

class SplitList[T] {

  def splitList(listToSplit: List[T], f: T => Boolean): (List[T], List[T]) = {
    val resultantList = for(element <- listToSplit if f(element)) yield element
    val remainingList = for(element <- listToSplit if(!f(element))) yield element
    (resultantList, remainingList)
  }

}
