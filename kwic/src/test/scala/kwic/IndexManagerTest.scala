package kwic

import scala.io.Source 
import org.scalatest._

class IndexManagerTest extends FlatSpec with Matchers {

  behavior of "a non-empty index manager"

  it should "return false when we call the isEmpty method" in {
    val manager = new IndexManager()

    manager.isEmpty should be (true)

    manager.map("Programming", "Programming in Scala", 0)
    manager.map("Programming", "Object-oriented Programming", 2)

    manager.isEmpty should be (false) 
  }

  it should "return a list of sorted words when we call sortedWords" in {
    val manager = new IndexManager()

    manager.isEmpty should be (true)

    manager.map("Programming", "Programming in Scala", 0)
    manager.map("Programming", "Object-oriented Programming", 2)
    manager.map("Scala", "Programming in Scala", 2)
    manager.map("Java", "Java is also cool, isn't it?", 0)

    val words = manager.sortedWords

    words.length should be (3)
    words should be (List("Java", "Programming", "Scala")) 
  }
}

