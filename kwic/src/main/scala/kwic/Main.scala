package kwic

import java.io.File
import java.io.PrintWriter

import org.backuity.clist._

object MainProgram extends CliMain[Unit] (
  name="KWIC",
  description="a simple keyword in context implementation") {

  var inputFile  = arg[String](description = "input file with a list of paper titles")
  var outputFile = opt[Option[String]](description = "output file of the index")  
  var stopWord   = opt[Option[File]](description = "file with a list of stop words")
 

  def run: Unit = {
    val dsm = new DataStorageManager(inputFile)
    val im  = new IndexManager()

    // read the file and build de index
    for(lineNumber <- 0 until dsm.length()) {
      val line = dsm.line(lineNumber)
      val words = line.split(' ')
      for(pos <- 0 until words.length) {
        im.map(words(pos), line, pos) 
      }
    }
    // export the result as a KWIC.
    for(w <- im.sortedWords) {

      im.occurrencesOfWord(w).foreach({
        case (line, pos) => println(WordShift.shift(line.split(' ').toList, pos, 0).mkString(" "))
      })
    }
  }
}
