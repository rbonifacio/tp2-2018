package kwic.base

import kwic.drs.OutputManager

class DefaultOutputManager extends OutputManager {

  override def export(data: List[String]): Unit = {
    data.foreach(s => {
      println(s)
    })
  }

}
