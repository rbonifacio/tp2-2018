package kwic

import scala.io.Source 
import org.scalatest._

class DataStorageManagerTest extends FlatSpec with Matchers {

  behavior of "a DataStorage"

  it should "have zero size if the file is empty" in {
    // val storage = new DataStorageManager("teste.txt")
    val url = getClass.getResource("/teste.txt")
    println("foo") 
    0 should be (0) 
  }
}
