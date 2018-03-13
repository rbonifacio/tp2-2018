package kwic

/**
  * A helper object to move strings around, until a 
  * desired position. Its implementation is tight to 
  * the KWIC problem.  
  */
object WordShift {

  /** Rotate the words in a list of Strings
    * 
    * Move the words to the left or to the right, until 
    * the word at position pos is moved to the target 
    * position in a string that corresponds to joining 
    * all string in the resulting list. .    
    */
  def shift(words: List[String], pos: Int, target: Int) : List[String] = {
    val (l, r) = words.splitAt(pos)
    if(l.mkString(" ").length < (target -5)) {
      return shiftRight(l, r, target)
    }
    return shiftLeft(l, r, target)
  }

  /*
   * Move the entries of the second list to the beginning of 
   * the first list, until the total length of the strings     
   * of the first list is "smaller enough" than the target parameter. 
   */
  private def shiftRight(l : List[String], r : List[String], target : Int) : List[String] = {
    if(r.length == 0) {
      return l
    }

    val (r1, r2) = r.splitAt(r.length-1)
    val l1 = r2 ++ l

    if(l1.mkString(" ").length > (target - 5)) {
      return l ++ r
    }

    return shiftRight(l1, r1, target)
  }

  /*
   * Move the entries of the first list to the end of 
   * the second list, until the length of the strings 
   * of the first list is "smaller enough" than the target parameter. 
   */
  private def shiftLeft(l : List[String], r : List[String], target : Int) : List[String]= {
    if(l.length == 0) {
      return r
    }

    val (l1, l2) = l.splitAt(1)
    val r1 = r ++ l1

    val diff = 
    if(l2.mkString(" ").length < (target - 5)) {
      return l2 ++ r1
    }

    return shiftLeft(l2, r1, target)
  }
}
