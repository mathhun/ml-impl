import breeze.linalg._

class Node {
  def build(data: DenseMatrix[Double], target: DenseVector[Double]): Unit = {
    val numdata = data.rows
    val num_feature = data.cols

    // if (Node.unique(target).keys.length == 1) {
    //   return
    // }
  }
}

object Node {
  def giniFunc[A](target: Seq[A]): Double = {
    val classes = Node.unique(target)
    val numdata = target.length
    1.0 - classes.keys.map(c => Math.pow(classes(c).toFloat / numdata, 2)).sum
  }

  def unique[A](xs: Seq[A]): Map[A, Int] = {
    xs.groupBy(l => l).map(t => (t._1, t._2.length))
  }
}

class DecisionTree {
}
