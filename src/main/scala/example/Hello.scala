package example

import Utilities.QuickSort

object Hello extends App {
  val array = Array(5,4,3,2,1)
  val sortedArray = new QuickSort().sort(array)
  println("Hello")
  print(s"Sorted Array - ")
  sortedArray.foreach(element => {
    print(s"$element ")
  })
}