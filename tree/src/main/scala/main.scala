import breeze.linalg._

object App {
  def main(args: Array[String]) = {
    //val m = DenseMatrix.zeros[Double](3, 2)
    //println("main")
    //println(m)

    val n = Node.giniFunc(Seq(1,1,1,1,1,1,1,1,1,10))
    println(n)
  }
}
