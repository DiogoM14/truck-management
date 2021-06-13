package com.projeto.Services;

import java.util.Scanner;

import com.projeto.Views.Menu;

public class EscolhaDeArmazem {
  private EscolhaDeArmazem() {}
  static Scanner scanner = new Scanner(System.in);

  public static void execEscolhaDeArmazem() {
    int opcao = 0;

    Menu.execMenuEscolhaDeArmazem();
    opcao = scanner.nextInt();

    
  }
}
