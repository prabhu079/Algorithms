

object MergeSort {
  def main(args: Array[String]) = {
    var arr=Array(7,9,11,1,3,100,5,9)
    mergeSort(arr,0,arr.length-1)
    for (i<-0 until arr.length)
    {
      print(arr(i)+" ")
    }
    
  }

  def mergeSort(arr: Array[Int], low: Int, high: Int): Unit =
    {
      if (low < high) {
        var mid = low + (high - low) / 2
        
        mergeSort(arr, low, mid)
        mergeSort(arr, mid + 1, high)
        
        merge(arr, low, mid, high)
      }
    }
  def merge(arr: Array[Int], low: Int, mid: Int, high: Int) {
    var arr1 = Array.ofDim[Int](mid - low + 1)
    var arr2 = Array.ofDim[Int](high - mid)
    for (i <- 0 until arr1.length) {
      arr1(i) = arr(low + i)
    }
    for (i <- 0 until arr2.length) {
      arr2(i) = arr(i + mid + 1)
    }
    var i = low
    var i1 = 0
    var i2 = 0

    while (i1 < arr1.length && i2 < arr2.length) {
      if (arr1(i1) <= arr2(i2)) {
        arr(i) = arr1(i1)
        i += 1
        i1 += 1
      } else {
        arr(i) = arr2(i2)
        i += 1
        i2 += 1
      }
    }
    while (i1 < arr1.length) {
      arr(i) = arr1(i1)
      i += 1
      i1 += 1
    }
    while (i2 < arr2.length) {
      arr(i) = arr2(i2)
      i += 1
      i2 += 1
    }
  }
}
