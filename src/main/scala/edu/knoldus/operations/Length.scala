package edu.knoldus.operations

class Length[T] {

  def length[T](inputList: List[T]): Int = {
    inputList.foldRight(0)((_, element) => {
      element + 1
    })
  }

}
