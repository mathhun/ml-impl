import org.scalatest._
import breeze.linalg._

class DecisionTreeSpec extends FlatSpec with Matchers {
  "giniFunc" should "be 0.0 if all the elements are same" in {
    Node.giniFunc(Seq(1,1,1)) should be (0.0)
    Node.giniFunc(Seq(0,0,0,0,0)) should be (0.0)
  }
  it should "be low for some skewed data" in {
    Node.giniFunc(Seq(1,1,1,1,1,1,1,1,1,10)) should be (0.18 +- 0.001)
  }
}
