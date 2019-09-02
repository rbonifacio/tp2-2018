package kwic.drs

/**
  * Contrato para a feature DataStorage.
  */
trait DataStorageManager {

  /**
    * inicializa o DataStorageManager.
    */
  def init(): Unit

  /**
    * Recupera um item especifico do data storage.
    * @param an índice do item a ser recuperado
    * @return a specific item on the data storage (String) .
    */
  def line(idx : Int): String

  /**
    * O número total de itens do data storage.
    */
  def length() : Int
}
