import breeze.linalg._

object App {
  def main(args: Array[String]) = {
    //val n = Node.giniFunc(Seq(1,1,1,1,1,1,1,1,1,10))
    //println(n)

    var n = new Node()
    n.build(DenseMatrix((1.0, 2.0, 3.0),(4.0, 5.0, 6.0)), DenseVector(1, 1, 2))
  }
}
