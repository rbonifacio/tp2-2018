package kwic.drs

/**
  * Contrato para a feature OutputManager
  */
trait OutputManager {
  /**
    * Exporta uma lista de strings usando uma estratégia
    * específica
    *
    * @param data strinds a serem exportadas
    */
  def export(data: List[String]) : Unit
}
