package kwic.base

import kwic.drs.{AbstractFactory, DataStorageManager, IndexManager, OutputManager, StopWordManager, WordShift}

class DefaultFactory() extends AbstractFactory {
  override def createStorage(): DataStorageManager = new DefaultStorageManager()
  override def createIndexManager(): IndexManager = new DefaultIndexManager()
  override def createStopWordManager(): StopWordManager = new DefaultStopWordManager()
  override def createWordShifft(): WordShift = new DefaultWordShift
  override def createOutputManager(): OutputManager = new DefaultOutputManager()
}
