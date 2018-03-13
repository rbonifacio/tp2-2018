package kwic

import scala.io.Source 
import org.scalatest._

class WordShiftTest extends FlatSpec with Matchers with GivenWhenThen {

  behavior of "a word shift of Design Patterns: Elements of Reusable OO Softwre"

  it should "return \"of Reusable OO Software...\" when we shift the Software word to the 20th position" in {
    val title = "Design Patterns Elements of Reusable OO Software".split(" ").toList
    val r1 = List("of", "Reusable", "OO", "Software", "Design", "Patterns", "Elements")

    title should be (List("Design", "Patterns", "Elements", "of", "Reusable", "OO", "Software"))

    WordShift.shift(title, 6, 20) should be (r1)
  }

  it should "return \"OO Software Design...\" when we shift the Pattern  word to the 30th position" in {
    val title = "Design Patterns Elements of Reusable OO Software".split(" ").toList
    val r1 = List("OO", "Software", "Design", "Patterns", "Elements", "of", "Reusable")

    title should be (List("Design", "Patterns", "Elements", "of", "Reusable", "OO", "Software"))

    WordShift.shift(title, 1, 30) should be (r1)
  }

  it should "fill a string with spaces " in {
    val l = List("abc", "defg", "hijk")
    val r = WordShift.shift(l, 1, 2)
    r should be (List("defg", "hijk", "abc")) 
  }
}
