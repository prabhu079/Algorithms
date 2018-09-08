object QuickSort {
  def main(args: Array[String]): Unit ={}
  def quickSort(arr: Array[Int], low: Int, high: Int): Unit =
    {
      if (low < high) {
        var piv = partition(arr, low, high)
        quickSort(arr, low, piv - 1)
        quickSort(arr, piv + 1, high)
      }
    }
  def partition(arr: Array[Int], low: Int, high: Int): Int = {
    var left = low
    var right = high
    var pivot = arr(high)
    while (left < right) {
      while (left < high && arr(left) <= pivot) {
        left += 1
      }
      while (right > low && arr(right) >= pivot) {
        right -= 1
      }
      if (left < right) {
        swap(arr, left, right)
      }
    }
    if (left < high) {
      swap(arr, left, high)
    }
    return left
  }
  def swap(arr: Array[Int], left: Int, right: Int) {
    var temp = arr(right)
    arr(right) = arr(left)
    arr(left) = temp
  }
}
