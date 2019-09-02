package kwic.base

import kwic.drs.StopWordManager

import scala.io.Source

/**
 * A class that deals with stop words. 
 */   
class DefaultStopWordManager(fileName : String = null) extends StopWordManager {

  val words : List[String] = if(fileName == null) { 
    Source.fromResource("stop_words.txt").getLines.toList
  } 
  else {
    Source.fromFile(fileName).getLines.toList 
  }

  /**
    * return true in the case of a stop word. 
    */
  def stopWord(word : String) = words.contains(word) 

}
