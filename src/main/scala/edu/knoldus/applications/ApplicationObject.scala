package edu.knoldus.applications

import edu.knoldus.operations.{CheckSubSequence, ConcatenateList, Length, SplitList}
import org.apache.log4j.Logger

object ApplicationObject extends App {

  val logger = Logger.getLogger(this.getClass)

  val ONE = 1
  val TWO = 2
  val THREE = 3
  val FOUR = 4
  val FIVE = 5
  val SIX = 6
  val SEVEN = 7
  val EIGHT = 8
  val NINE = 9
  val TEN = 10

  val numberList = List(ONE, TEN, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN)
  val nameList = List("shubham", "verma", "randhir", "kumar", "ayush", "prashar", "abhishek", "mahesh")
  val subValid = List(TWO, THREE, FOUR, FIVE)
  val subInvalid = List(SIX, SEVEN, NINE)
  val subValidString = List("randhir")
  val subValidString2 = List("ayush", "prashar")
  val subInvalidString2 = List("kumar", "prashar")
  val subInvalidString = List("verma", "prashar")
  val checkSubSequenceObjInt = new CheckSubSequence[Int]
  val checkSubSequenceObjString = new CheckSubSequence[String]
  val concatenateListObjInt = new ConcatenateList[Int]
  val concatenateListObjString = new ConcatenateList[String]
  val calculateLengthIntList = new Length[Int]
  val calculateLengthStringList = new Length[String]

  val splitListIntObj = new SplitList[Int]
  val splitListStringObj = new SplitList[String]

  val lambdaForInt = (input: Int) => if (input > 5) true else false
  val lambdaForString = (input: String) => if (input.length % 2 == 0) true else false

  logger.info(s"\n${checkSubSequenceObjInt.hasSubSequence(numberList, subInvalid)}\n")
  logger.info(s"\n${checkSubSequenceObjInt.hasSubSequence(numberList, subValid)}\n")
  logger.info(s"\n${checkSubSequenceObjString.hasSubSequence(nameList, subValidString2)}\n")
  logger.info(s"\n${checkSubSequenceObjString.hasSubSequence(nameList, subInvalidString2)}\n")
  logger.info(s"\n${concatenateListObjInt.concate(subValid, subInvalid)}\n")
  logger.info(s"\n${concatenateListObjString.concate(subInvalidString, subInvalidString2)}\n")
  logger.info(s"\n${calculateLengthIntList.length(numberList)}\n")
  logger.info(s"\n${calculateLengthStringList.length(nameList)}\n")
  logger.info(s"\n${splitListIntObj.splitList(numberList, lambdaForInt)}\n")
  logger.info(s"\n${splitListStringObj.splitList(nameList, lambdaForString)}\n")


}
