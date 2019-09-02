package kwic.drs

/**
  * Contrato para a feature que permite rotacionar palavras
  */
trait WordShift {
  /**
    * Dada uma lista de palavras, desloca / rotaciona a palavra de
    * índice "pos" para a posição "target".
    *
    * @param words lista de palavras original
    * @param pos posição inicial da palavra a ser deslocada
    * @param target posição final da palavra a ser deslocada
    *
    * @return lista de palavras na ordem após o deslocamento
    */
  def shift(words: String, pos: Int, target: Int) : String
}
