object CountingSort {
  
  val pattern=" ".r
  def main(args: Array[String])
  {
    import scala.io.StdIn.readLine
    var n=readLine.trim.toInt
    var arr=pattern.split(readLine.trim).map(_.toInt)
    arr=sort(arr, 100)
    for(i<- 0 until arr.length)
    {
      if(i!=arr.length-1)
      {
        print(arr(i)+" ")
      }
      else
      {
         print(arr(i))
      }
    }
  }
  
  
  def sort(arr: Array[Int],max: Int):Array[Int]={
    var countArr=Array.ofDim[Int](max+1).map(x =>0)
    var finArr=Array.ofDim[Int](arr.length)
    for(i<- 0 until arr.length)
    {
      countArr(arr(i))=countArr(arr(i))+1
    }
    for(i<- 1 until countArr.length)
    {
      countArr(i)=countArr(i)+countArr(i-1)
    }
    var i=arr.length-1
    while(i>=0)
    {
      finArr(countArr(arr(i))-1)=arr(i)
      countArr(arr(i))=countArr(arr(i))-1
      i-=1
    }
    return finArr
  }

}
