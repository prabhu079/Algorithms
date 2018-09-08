object RadixSort {
  var max = Int.MinValue
  var min=Int.MaxValue
  var neg=false
  def main(args: Array[String]) {
    var arr = Array(7, 9, -112, 100, 18, 120, 123)
    for (i <- arr) {
      max = math.max(i, max)
      min=math.min(i,min)
      if(i<0)
      {
        neg=true
      }
    }
    if(neg)
    {
      max=max-min
      arr=arr.map(_.-(min))
    }
    var pass=1
    while(max/pass>0)
    {
      arr=sort(arr,pass)
      pass=pass*10
    }
    if(neg)
    {
      arr=arr.map(_.+(min))
    }
    var sb=new StringBuilder
    arr.addString(sb," ")
    println(sb)
  }
  def sort(a: Array[Int], exp: Int): Array[Int] =
    {
      var count = Array.ofDim[Int](10).map(x => 0)
      for (data<- a) {
        count((data / exp) % 10) += 1
      }
      for (i <- 1 until count.length) {
        count(i) = count(i) + count(i - 1)
      }
      var output = Array.ofDim[Int](a.length)
      for (i <- a.length-1 to 0 by -1) {
        output(count((a(i) / exp) % 10) - 1) = a(i)
        count((a(i) / exp) % 10)-=1
      }
      return output
    }
}
