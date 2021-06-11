package com.projeto.Services;

import java.util.Scanner;

import com.projeto.Views.Menu;

public class GestaoDeCamioes {
  private GestaoDeCamioes() {}
  static Scanner scanner = new Scanner(System.in);

  public static void execGestaoDeCamioes() {
    int opcao = 0;

    Menu.execMenuEscolhaCamiao();
    opcao = scanner.nextInt();

    if (opcao == 1) {
      Menu.execMenuGestaoDeCamiao();
    }
  }
}
