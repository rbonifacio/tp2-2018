package kwic

import scala.io.Source 
import org.scalatest._

class StopWordManagerTest extends FlatSpec with Matchers {

  behavior of "a stop word manager using the default dictionary"

  it should "return true when we call stopWord with stop words" in {
    val manager = new StopWordManager()
   
    manager.stopWord("the")     should be (true)
    manager.stopWord("a")       should be (true)
    manager.stopWord("been")    should be (true) 
    manager.stopWord("before")  should be (true) 
    manager.stopWord("being")   should be (true) 
    manager.stopWord("below")   should be (true) 
    manager.stopWord("between") should be (true)
    manager.stopWord("you're")  should be (true) 
    manager.stopWord("you've")  should be (true) 
  }

  it should "return false when we call stopWord without a stop word" in {
    val manager = new StopWordManager()
   
    manager.stopWord("scala") should be (false)
    manager.stopWord("rocks") should be (false)
  }
}
