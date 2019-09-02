package kwic.drs

trait StopWordManager {
  /**
    * Retorna verdadeiro caso "word" seja uma stop word.
    */
  def stopWord(word : String) : Boolean
}
