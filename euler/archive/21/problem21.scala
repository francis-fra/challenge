object problem21 extends App {

  def divisible(a :Int, b: Int): Boolean = a % b == 0

  def d(a: Int): Int = {
    val lim = math.sqrt(a).toInt
    var result = 0
    for (k <- 2 to lim) {
      if (divisible(a, k)) result += (k + a / k)
    }
    // 1 is always included
    result + 1
  }

  def amicable(a: Int): Boolean = {
    val b = d(a)
    a == d(b) && a != b
  }

  println("Problem 21")
  // println(s" ${args(0)} is divisible by 2: " + divisible(args(0).toInt, 2))
  //println(s" d(${args(0)}) = " + d(args(0).toInt))
  //println(s" d(${args(0)}) is amicable " + amicable(args(0).toInt))

  var result = 0
  for (k <- 1 to args(0).toInt) {
    if (amicable(k)) result += k
  }
  println(result)
}
