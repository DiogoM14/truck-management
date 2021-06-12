package com.projeto;

import java.util.Scanner;

import com.projeto.Classes.Armazem;
import com.projeto.Classes.Camiao;
import com.projeto.Classes.LinkedList.LinkedList;
import com.projeto.Services.EscolhaDeArmazem;
import com.projeto.Services.GestaoDeCamioes;
import com.projeto.Views.Menu;

public class App {
    public static void main(String[] args) {
        LinkedList<Camiao> cais = new LinkedList<>();
        Armazem armazem1 = new Armazem("Porto 1", "Porto", cais);
        Armazem armazem2 = new Armazem("Lisboa 1", "Lisboa", cais);

        Camiao camiao1 = new Camiao("10-ZG-12", armazem1, "TESTE", "TESTE", 7500.00, 500.00);
        Camiao camiao2 = new Camiao("10-ZG-12", armazem1, "TESTE", "TESTE", 7500.00, 500.00);
        Camiao camiao3 = new Camiao("10-ZG-12", armazem1, "TESTE", "TESTE", 7500.00, 500.00);
        Camiao camiao4 = new Camiao("10-ZG-12", armazem1, "TESTE", "TESTE", 7500.00, 500.00);
        Camiao camiao5 = new Camiao("10-ZG-12", armazem1, "TESTE", "TESTE", 7500.00, 500.00);
        Camiao camiao6 = new Camiao("10-ZG-12", armazem1, "TESTE", "TESTE", 7500.00, 500.00);
        Camiao camiao7 = new Camiao("10-ZG-12", armazem1, "TESTE", "TESTE", 7500.00, 500.00);

        System.out.println(camiao1.toString());

        cais.add(camiao1);
        cais.add(camiao2);
        cais.add(camiao3);
        cais.add(camiao4);
        cais.add(camiao5);
        cais.add(camiao6);
        cais.add(camiao7);
        System.out.println(cais.toString());

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
