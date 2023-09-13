package com.emendes;

import java.util.Scanner;

public class Contador {

  public void executar() {
    int parametroUm = recuperarEntrada("Digite o primeiro parâmetro");
    int parametroDois = recuperarEntrada("Digite o segundo parâmetro");

    try {
      //chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException exception) {
      //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println(exception.getMessage());
    }

  }

  private int recuperarEntrada(String mensagem) {
    Scanner terminal = new Scanner(System.in);

    System.out.println(mensagem);
    return terminal.nextInt();
  }

  private void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int contagem = parametroDois - parametroUm;
    //realizar o for para imprimir os números com base na variável contagem
    for (int i = 1; i <= contagem; i++) {
      String mensagemTemplate = "Imprimindo o número %d";
      System.out.println(mensagemTemplate.formatted(i));
    }
  }

}
