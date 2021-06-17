package com.projeto.Views;

public class Menu {
  private Menu() {}

  public static void execMenu() {
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\tBem vindo ao Truck Manager");

    System.out.println("");
    System.out.println("===------ Número dos armazens -----===");
    System.out.println("1. Armazem Portugal 1");
    System.out.println("2. Armazem Portugal 2");
    System.out.println("3. Armazem Espanha 1");
    System.out.println("4. Armazem Espanha 2");
    System.out.println("5. Armazem França 1");
    System.out.println("6. Armazem França 2");
    System.out.println("7. Armazem Alemanha 1");
    System.out.println("8. Armazem Itália 1");
    System.out.println("===--------------- -----------------===");
    System.out.println("");

    System.out.println("9. Sair");
    System.out.println("Escolha o número de armazem");
    System.out.print("Opção: ");
  }

  public static void execMenuEscolhaDeArmazem() {
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("Gestor de armazens");
    System.out.println("0. Sair");

    System.out.print("Opção: ");
  }

  public static void execMenuGestaoDeCamiao() {
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\tGestão de camiões");

    System.out.println("");
    System.out.println("1. Adicionar camião");
    System.out.println("2. Procurar entre pesos");
    System.out.println("3. Ordenar por espaço livre");
    System.out.println("4. Ordenar por Carga & Descarga");
    System.out.println("");

    System.out.print("Opção: ");
  }
}
