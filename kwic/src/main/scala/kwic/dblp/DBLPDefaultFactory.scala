package kwic.dblp

import kwic.base.DefaultFactory
import kwic.drs.{DataStorageManager}

class DBLPDefaultFactory extends DefaultFactory {
  override def createStorage(): DataStorageManager = new DBLPStorageManager
}
