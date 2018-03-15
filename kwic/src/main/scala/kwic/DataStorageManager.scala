package kwic

import scala.io.Source
/**
  * Models an abstract data storage manager. 
  */ 
trait DataStorageManager {

  /**
    * Initialize the DataStorageManager. 
    */
  def init(): Unit

  /**
    * Get a specific item on the data storage. 
    * @param an index for a data storage item 
    * @return a specific item on the data storage (String) .      
    */
  def line(idx : Int): String

  /**
    * The total number of lines of a file. 
    */  
  def length() : Int 
}
