package kwic

import scala.collection.mutable.HashMap
import scala.collection.mutable.MutableList

class IndexManager() {

  //a hash map from a word to the list of lines it appears. 
  private val map : HashMap[String, MutableList[(String, Int)]] = HashMap()

  def isEmpty = map.isEmpty

  /**
    * introduces a new mapping between a word and a line that it appears. 
    * Note that here we also deal with multiple occurences of the 
    * same word in a line. In this case, it is necessary to call this 
    * method to the multiples occurences that it appears in the line, 
    * indicating the particular position.  
    */
  def map(word: String, line: String, pos : Int) : Unit = {
    val tuple = (line, pos)

    if(map.contains(word)) {
      map(word) += tuple
    }
    else {
      map += (word -> MutableList(tuple))
    }
  }

  def occurrencesOfWord(word: String) : MutableList[(String, Int)] = map(word)

  /**
    * returns a list of the mapped words, after 
    * applying a sort operation. 
    */ 
  def sortedWords = map.keys.toList.sorted

}
