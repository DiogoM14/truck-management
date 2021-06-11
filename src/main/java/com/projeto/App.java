package com.projeto;

import java.util.Scanner;

import com.projeto.Classes.Armazem;
import com.projeto.Classes.LinkedList.Cais;
import com.projeto.Classes.LinkedList.LinkedList;
import com.projeto.Services.EscolhaDeArmazem;
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
                default:
                System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
