package kwic.drs

import scala.collection.mutable

/**
  * Especificação de um index manager, com as
  * operações esperadas para qualquer gerenciador
  * de indexação de palavras. Note que esse indexador pode
  * ser usado para gerar um KWIC, mas também índices em
  * outros formatos.
  */
trait IndexManager {

  /**
    * Retorna verdadeiro caso o gerenciador de indices esteja
    * vazio, ou seja, nenhuma palavra foi indexada.
    *
    * @return true, caso nenhua palavra tenha sido indexada.
    */
  def isEmpty : Boolean

  /**
    * Indexa uma palavra em uma string em uma determinada
    * posição.
    *
    * @param word palavra a ser indexada
    * @param line linha onde a palavra aparece
    * @param pos posicao em que a palavra aparece na linha
    */
  def map(word: String, line: String, pos : Int) : Unit

  /**
    * Recupera as ocorrências de uma determinada palavra no índice
    * @param word palavra usada como critério de busca
    * @return uma lista de tuplas, contendo as linhas em que uma
    *         palavra aparece e a posição na linha.
    */
  def occurrencesOfWord(word: String) : mutable.MutableList[(String, Int)]

  def sortedWords : List[String]
}
