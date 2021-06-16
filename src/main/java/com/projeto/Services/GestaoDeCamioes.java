package com.projeto.Services;

import java.util.ArrayList;
import java.util.Scanner;

import com.projeto.Classes.Armazem;
import com.projeto.Classes.Camiao;
import com.projeto.Classes.Enum.CargaDescarga;
import com.projeto.Classes.LinkedList.LinkedList;
import com.projeto.Classes.Queue.CircularArrayQueue;

public class GestaoDeCamioes {
  private GestaoDeCamioes() {}
  static Scanner scanner = new Scanner(System.in);
  
  public static void execGestaoDeCamioes(ArrayList<Armazem> armazens, int opcao) {
    String matricula, hora_chegada, dia_chegada;
    Double tara, carga, pesoMinimo, pesoMaximo;
    Armazem armazem;
    LinkedList<Camiao> cais;
    int escolha, cargaDescarga = 0;
    CircularArrayQueue<Camiao> parque;
    
    System.out.println("1. Adicionar camião");
    System.out.println("2. Procurar entre pesos");
    System.out.println("3. Editar camião");
    escolha = scanner.nextInt();
    
    if (escolha == 1) {
      // Formulário -------------------------------------------------------
      System.out.println("\n");
      System.out.println("Prima Enter para continuar... ");
      scanner.nextLine();
      System.out.print("Matricula -> ");
      matricula = scanner.next();
      System.out.print("Hora de Chegada -> ");
      hora_chegada = scanner.next();
      System.out.print("Dia de chegada -> ");  
      dia_chegada = scanner.next();
      System.out.print("Peso máximo -> ");
      tara = scanner.nextDouble();
      System.out.print("Carga -> ");
      carga = scanner.nextDouble();
      System.out.print("Tipo de Registo (1 = CARREGAR, 2 = DESCARREGAR) -> ");
      cargaDescarga = scanner.nextInt();
      // ------------------------------------------------------------------

      armazem = armazens.get(opcao);
      parque = armazem.getParque();
      cais = armazem.getCais();

      while (cargaDescarga != 1 && cargaDescarga != 2) {
        System.out.print("Escolha o tipo de Registo entre 1 ou 2 (1 = EDITOR, 2 = LEITOR) -> ");
        cargaDescarga = scanner.nextInt();
      }
  
      if (cargaDescarga == 1) {
        CargaDescarga type = CargaDescarga.valueOf("CARGA");

        Camiao camiao = new Camiao(matricula, armazem, hora_chegada, dia_chegada, type, tara, carga);
        
        parque.enqueue(camiao);
        cais.addCamiao(parque.dequeue());
        parque.toString();
      } else if (cargaDescarga == 2) {
        CargaDescarga type = CargaDescarga.valueOf("DESCARGA");

        Camiao camiao = new Camiao(matricula, armazem, hora_chegada, dia_chegada, type, tara, carga);
        
        parque.enqueue(camiao);
        cais.addCamiao(parque.dequeue());
      }
      
      // cais.removeCamiao(camiao2);
      cais.escreverCamioes();
      
    } else if (escolha == 2) {
      // Formulário -------------------------------------------------------
      System.out.println("\n");
      System.out.println("Prima Enter para continuar... ");
      scanner.nextLine();
      System.out.print("Peso minimo -> ");
      pesoMinimo = scanner.nextDouble();
      System.out.print("Peso máximo -> ");
      pesoMaximo = scanner.nextDouble();
      // ------------------------------------------------------------------

      armazem = armazens.get(opcao);
      cais = armazem.getCais();

      System.out.println(cais.getByPeso(pesoMinimo, pesoMaximo));
    }
  }

  private static void pesquisaCamioes(Armazem armazem) {
    Scanner scanner = new Scanner(System.in);
    
    Double cargaMin, cargaMax;
    Double carguita = 0.0;

    System.out.print("Limite inferior -> ");
    cargaMin = scanner.nextDouble(); 
    System.out.print("Limite maximo -> ");
    cargaMax = scanner.nextDouble(); 

    if(cargaMin > cargaMax){
        cargaMin = carguita;
        cargaMin = cargaMax;
        cargaMax = carguita;
    }

    LinkedList<Camiao> cais;
    cais = armazem.getCais();

    cais.pesquisaCamioes(cargaMin, cargaMax);
  }
}
