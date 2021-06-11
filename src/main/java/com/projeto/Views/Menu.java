package com.projeto.Views;

public class Menu {
  private Menu() {}

  public static void execMenu() {
    System.out.println("\n");
    System.out.println("\tBem vindo ao Truck Manager");
    System.out.println("0. Sair");
    System.out.println("1. Escolha de armazem");
    System.out.println("2. Gestão de camiões");
    System.out.print("Opção: ");
  }

  public static void execMenuEscolhaDeArmazem() {
    System.out.println("\n");
    System.out.println("\tGestor de armazens");
    System.out.println("0. Sair");
    System.out.println("1. Armazem Portugal 1");
    System.out.println("2. Armazem Portugal 2");
    System.out.println("3. Armazem Espanha 1");
    System.out.println("4. Armazem Espanha 2");
    System.out.println("4. Armazem França 1");
    System.out.println("4. Armazem França 2");
    System.out.println("4. Armazem Alemanha 1");
    System.out.println("4. Armazem Itália 1");
    System.out.print("Opção: ");
  }

  public static void execMenuGestaoDeCamiao() {
    System.out.println("\n");
    System.out.println("\tBem vindo ao Truck Manager");
    System.out.println("0. Sair");
    System.out.println("1. Carregar Camião");
    System.out.println("2. Selecionar Destino");
    System.out.print("Opção: ");
  }

  public static void execMenuEscolhaCamiao() {
    System.out.println("\n");
    System.out.println("\tBem vindo ao Truck Manager");
    System.out.println("0. Sair");
    System.out.println("1. Camião 1");
    System.out.println("2. Camião 2");
    System.out.println("3. Camião 3");
    System.out.println("4. Camião 4");
    System.out.print("Opção: ");
  }
}
