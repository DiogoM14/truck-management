package com.projeto.Services;

import java.util.ArrayList;
import java.util.Scanner;

import com.projeto.Classes.Armazem;
import com.projeto.Classes.Camiao;
import com.projeto.Classes.LinkedList.LinkedList;

public class GestaoDeCamioes {
  private GestaoDeCamioes() {}
  static Scanner scanner = new Scanner(System.in);
  
  public static void execGestaoDeCamioes(ArrayList<Armazem> armazens) {
    String matricula, hora_chegada, dia_chegada;
    Double tara, carga;
    Armazem armazem;
    LinkedList<Camiao> cais;
    int numeroArmazem;
    
    // Formulário -------------------------------------------------------
    System.out.println("\n");
    System.out.println("Prima Enter para continuar... ");
    scanner.nextLine();
    System.out.print("Matricula -> ");
    matricula = scanner.next();
    System.out.print("Hora de Chegada -> ");
    hora_chegada = scanner.next();
    System.out.print("Armazem -> ");
    numeroArmazem = scanner.nextInt();
    System.out.print("Dia de chegada -> ");  
    dia_chegada = scanner.next();
    System.out.print("Peso máximo -> ");
    tara = scanner.nextDouble();
    System.out.print("Carga -> ");
    carga = scanner.nextDouble();
    // ------------------------------------------------------------------
    
    armazem = armazens.get(numeroArmazem);
    cais = armazem.getCais();
    
    Camiao camiao = new Camiao(matricula, armazem, hora_chegada, dia_chegada, tara, carga);
    
    cais.addCamiao(camiao);
    cais.addCamiao(camiao);
    cais.addCamiao(camiao);
    cais.addCamiao(camiao);
    cais.addCamiao(camiao);
    cais.escreverCamioes();
    
    cais.removeCamiao(camiao);
    cais.escreverCamioes();
  }
}
