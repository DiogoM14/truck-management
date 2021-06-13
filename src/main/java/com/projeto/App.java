package com.projeto;

import java.util.ArrayList;
import java.util.Scanner;

import com.projeto.Classes.Armazem;
import com.projeto.Classes.Camiao;
import com.projeto.Classes.LinkedList.LinkedList;
import com.projeto.Services.EscolhaDeArmazem;
import com.projeto.Services.GestaoDeCamioes;
import com.projeto.Views.Menu;

public class App {
    public static void main(String[] args) {
        ArrayList<Armazem> armazens = new ArrayList<>();
        
        LinkedList<Camiao> cais1 = new LinkedList<>();
        LinkedList<Camiao> cais2 = new LinkedList<>();
        LinkedList<Camiao> cais3 = new LinkedList<>();
        LinkedList<Camiao> cais4 = new LinkedList<>();
        LinkedList<Camiao> cais5 = new LinkedList<>();
        LinkedList<Camiao> cais6 = new LinkedList<>();
        LinkedList<Camiao> cais7 = new LinkedList<>();
        LinkedList<Camiao> cais8 = new LinkedList<>();

        Armazem armazem1 = new Armazem("Portugal 1", cais1);
        Armazem armazem2 = new Armazem("Portugal 2", cais2);
        Armazem armazem3 = new Armazem("Espanha 1", cais3);
        Armazem armazem4 = new Armazem("Espanha 2", cais4);
        Armazem armazem5 = new Armazem("França 1", cais5);
        Armazem armazem6 = new Armazem("França 2", cais6);
        Armazem armazem7 = new Armazem("Alemanha 1", cais7);
        Armazem armazem8 = new Armazem("Itália 1", cais8);
        
        armazens.add(armazem1);
        armazens.add(armazem2);
        armazens.add(armazem3);
        armazens.add(armazem4);
        armazens.add(armazem5);
        armazens.add(armazem6);
        armazens.add(armazem7);
        armazens.add(armazem8);

        execApp(armazens);
    }

    public static void execApp(ArrayList<Armazem> armazens) {
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
                    GestaoDeCamioes.execGestaoDeCamioes(armazens);
                    Menu.execMenu();
                break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
