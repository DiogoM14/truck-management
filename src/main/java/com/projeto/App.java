package com.projeto;

import java.util.Scanner;

import com.projeto.Services.EscolhaDeArmazem;
import com.projeto.Services.GestaoDeCamioes;
import com.projeto.Views.Menu;

public class App {
    public static void main(String[] args) {
        // final Armazem armazem1 = new Armazem();
        execApp();
    }

    public static void execApp() {
        Scanner scanner = new Scanner(System.in);

        Menu.execMenu();

        int opcao = 0;

        do {
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                break;
                case 1:
                    EscolhaDeArmazem.execEscolhaDeArmazem();
                    Menu.execMenu();
                break;
                case 2:
                    GestaoDeCamioes.execGestaoDeCamioes();
                    Menu.execMenu();
                break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
