package kwic

import java.io.File

import kwic.dblp.DBLPDefaultFactory
import org.backuity.clist._

import scala.collection.mutable.ListBuffer

object MainProgram extends CliMain[Unit]  (
  name="KWIC",
  description="a simple keyword in context implementation") {

  var outputFile = opt[Option[String]](description = "output file of the index")  
  var stopWord   = opt[Option[File]](description = "file with a list of stop words")

  // val f = new DefaultFactory()

  val f = new DBLPDefaultFactory()

  def run: Unit = {
    val dsm = f.createStorage()
    val idm = f.createIndexManager()
    val swm = f.createStopWordManager()
    val dwm = f.createWordShifft()
    val oum = f.createOutputManager()


    dsm.init()

    // read the input lines and build de index
    for(lineNumber <- 0 until dsm.length()) {
      val line = dsm.line(lineNumber)
      val words = line.split(' ')
      for(pos <- 0 until words.length) {
        val word = words(pos)
        if(!swm.stopWord(word)) {
          idm.map(word, line, pos)
        }
      }
    }
    val sortedWords = idm.sortedWords
    val res = new ListBuffer[String]()
    for(w <- sortedWords) {
      val occurrences = idm.occurrencesOfWord(w)
      for(r <- occurrences) {
        r match {
          case (line, pos) => res += dwm.shift(line, pos, 0)
        }
      }
    }
    oum.export(res.toList)
  }
}
