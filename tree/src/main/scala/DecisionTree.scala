import breeze.linalg._

class Node {
  var label: Double = 0

  def build(data: DenseMatrix[Double], target: DenseVector[Double]): Unit = {
    val numdata = data.rows
    val num_features = data.cols

    if (Node.unique(target.toArray).keys.size == 1) {
      label = target(0)
      return
    }

    val class_cnt = Node.unique(target.toArray)
    label = class_cnt.maxBy(c => c._2)._1

    var bestGiniIndex = 0.0
    var bestFeature = -1
    var bestThreshold = -1.0

    val gini = Node.giniFunc(target.toArray)

    for (f <- 0 to num_features - 1) {
      val data_f = Node.unique(data(::, f).toArray).keys.toList.sorted
      println(data_f)
    }
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
