object InsertionSort {
  val pattern=" ".r
  def main(args: Array[String]):Unit=
  {
    import scala.io.StdIn.readLine
    var n=readLine.trim.toInt
    var arr=pattern.split(readLine).map(_.toInt)
    var sb=new StringBuilder
    
    //Insertion Sort Starts from here..
    for(i <- 1 until n)
    {
      var j=i-1
      var key=arr(i)
      while(j>=0 && arr(j)>key)
      {
        arr(j+1)=arr(j)
        j-=1
      }
        arr(j+1)=key
        arr.addString(sb, " ")
        println(sb)
        sb.setLength(0)
    }
  }
}
