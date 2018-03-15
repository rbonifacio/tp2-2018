package kwic

import play.api.libs.json._

/**
  *  An implementation of a storage manager based on 
  *  the available data of DBLP. 
  *  
  *  @author: rbonifacio
  */ 
class DBLPStorageManager() extends DataStorageManager {

  var lines: List[String] = _ 

  def init() : Unit = {
    print("Enter the DBLP search criteria (such as the author name) ")
    val query = scala.io.StdIn.readLine() 
    val url   = "http://dblp.org/search/publ/api?q="+query+"&format=json"
    lines     = makeRequest(url) 
  }
  
  private def makeRequest(url: String ): List[String] = {
    val json   = Json.parse(scala.io.Source.fromURL(url).mkString)
    val titles = (json \\ "title")
    return titles.map(t => t match { case JsString(s) => s.toString case _ => "-" }).toList 
  }


  def line(idx : Int) = lines(idx)

  /**
    * The total number of lines of a file. 
    */  
  def length() = lines.length

}
