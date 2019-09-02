package kwic.drs

/**
  * Contrato para a criação das implemenntações
  * concretas dos pontos de variabilidade do
  * KWIC.
  */
trait AbstractFactory {

  def createStorage(): DataStorageManager
  def createIndexManager(): IndexManager
  def createStopWordManager(): StopWordManager
  def createWordShifft(): WordShift
  def createOutputManager(): OutputManager

}
