package com.emendes;

/**
 * Exception a ser lançada quando algum parâmetro for inválido.
 */
public class ParametrosInvalidosException extends RuntimeException {

  ParametrosInvalidosException() {
    super();
  }

  ParametrosInvalidosException(String message) {
    super(message);
  }

}
