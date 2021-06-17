package com.projeto.Services;

import java.util.ArrayList;
import java.util.Scanner;

import com.projeto.Classes.Armazem;
import com.projeto.Classes.Camiao;
import com.projeto.Classes.Enum.CargaDescarga;
import com.projeto.Classes.LinkedList.LinkedList;
import com.projeto.Classes.Queue.CircularArrayQueue;
import com.projeto.Views.Menu;

public class GestaoDeCamioes {
  static Scanner scanner = new Scanner(System.in);
  
  private GestaoDeCamioes() {}
  
  public static void execGestaoDeCamioes(ArrayList<Armazem> armazens, int opcao) {
    Armazem armazem;
    LinkedList<Camiao> cais;
    CircularArrayQueue<Camiao> parque;
    CargaDescarga type = null;
    
    String matricula, hora_chegada, dia_chegada;
    Double tara, carga, pesoMinimo, pesoMaximo;
    int escolha, cargaDescarga, horasNoCais = 0;
    
    // Menu de entrada --------------------------------------------------
    Menu.execMenuGestaoDeCamiao();
    escolha = scanner.nextInt();
    // ------------------------------------------------------------------
    
    // Recupera os valores do respetivo armazem, vindas da arraylist do app.java
    armazem = armazens.get(opcao-1);
    parque = armazem.getParque();
    cais = armazem.getCais();
    
    if (escolha == 1) {
      // Formulário ADICIONAR CAMIÃO ------------------------------------
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");

      System.out.print("Matricula -> ");
      matricula = scanner.next();
      System.out.print("Hora de Chegada -> ");
      hora_chegada = scanner.next();
      System.out.print("Dia de chegada -> ");  
      dia_chegada = scanner.next();
      System.out.print("Horas no cais -> ");
      horasNoCais = scanner.nextInt();
      System.out.print("Peso máximo -> ");
      tara = scanner.nextDouble();
      System.out.print("Carga -> ");
      carga = scanner.nextDouble();
      System.out.print("Tipo de Registo (1 = CARREGAR, 2 = DESCARREGAR) -> ");
      cargaDescarga = scanner.nextInt();
      // ------------------------------------------------------------------
      
      while (cargaDescarga != 1 && cargaDescarga != 2) {
        System.out.print("Escolha o tipo de Registo (1 = CARREGAR, 2 = DESCARREGAR) -> ");
        cargaDescarga = scanner.nextInt();
      }
      
      while (tara < carga) {
        System.out.print("Exesso de carga! Insira nova carga");
        carga = scanner.nextDouble();
      }
      
      if (cargaDescarga == 1) {
        type = CargaDescarga.valueOf("CARGA");
      } else {
        type = CargaDescarga.valueOf("DESCARGA");
      }
      
      Camiao camiao1 = new Camiao(matricula, armazem, hora_chegada, dia_chegada, horasNoCais, type, tara, carga);
      
      // CAMIÕES EXEMPLO ------------------------------------------------------------------------------------
      Camiao camiao2 = new Camiao("12-FO-12", armazem, "20:45H", "30-06-2021", 24, type, 2500.00, 2300.00);
      Camiao camiao3 = new Camiao("23-DA-76", armazem, "14:00H", "27-06-2021", 12, type, 2500.00, 1500.00);
      Camiao camiao4 = new Camiao("12-ZA-54", armazem, "14:45H", "21-06-2021", 37, type, 3500.00, 3310.40);
      Camiao camiao5 = new Camiao("76-SG-97", armazem, "13:00H", "21-06-2021", 8, type, 1700.00, 1600.00);
      Camiao camiao6 = new Camiao("AS-22-AB", armazem, "09:55H", "26-06-2021", 10, type, 2500.00, 2430.20);
      Camiao camiao7 = new Camiao("AS-22-AB", armazem, "09:55H", "26-06-2021", 12, type, 2500.00, 2430.20);
      // ----------------------------------------------------------------------------------------------------
      
      if (parque.enqueue(camiao1)) {
        if (cais.getMaxCapacity() == 6) {
          if (cais.getNextToLeaveHours() != null) {
            cais.removeCamiao(cais.getNextToLeaveHours());
            cais.addCamiao(parque.dequeue());
          }
        } else {
          cais.addCamiao(parque.dequeue());
        }
      }

      if (parque.enqueue(camiao2)) {
        if (cais.getMaxCapacity() == 6) {
          if (cais.getNextToLeaveHours() != null) {
            cais.removeCamiao(cais.getNextToLeaveHours());
            cais.addCamiao(parque.dequeue());
          }
        } else {
          cais.addCamiao(parque.dequeue());
        }
      }

      if (parque.enqueue(camiao3)) {
        if (cais.getMaxCapacity() == 6) {
          if (cais.getNextToLeaveHours() != null) {
            cais.removeCamiao(cais.getNextToLeaveHours());
            cais.addCamiao(parque.dequeue());
          }
        } else {
          cais.addCamiao(parque.dequeue());
        }
      }

      if (parque.enqueue(camiao4)) {
        if (cais.getMaxCapacity() == 6) {
          if (cais.getNextToLeaveHours() != null) {
            cais.removeCamiao(cais.getNextToLeaveHours());
            cais.addCamiao(parque.dequeue());
          }
        } else {
          cais.addCamiao(parque.dequeue());
        }
      }

      if (parque.enqueue(camiao5)) {
        if (cais.getMaxCapacity() == 6) {
          if (cais.getNextToLeaveHours() != null) {
            cais.removeCamiao(cais.getNextToLeaveHours());
            cais.addCamiao(parque.dequeue());
          }
        } else {
          cais.addCamiao(parque.dequeue());
        }
      }

      if (parque.enqueue(camiao6)) {
        if (cais.getMaxCapacity() == 6) {
          if (cais.getNextToLeaveHours() != null) {
            cais.removeCamiao(cais.getNextToLeaveHours());
            cais.addCamiao(parque.dequeue());
          }
        } else {
          cais.addCamiao(parque.dequeue());
        }
      }

      if (parque.enqueue(camiao7)) {
        if (cais.getMaxCapacity() == 6) {
          if (cais.getNextToLeaveHours() != null) {
            cais.removeCamiao(cais.getNextToLeaveHours());
            cais.addCamiao(parque.dequeue());
          }
        } else {
          cais.addCamiao(parque.dequeue());
        }
      }

      System.out.println("\n");
      System.out.println("---=====- Cais -=====---");
      cais.escreverCamioes();
      System.out.println("---=====- Fila de espera -=====---");
      System.out.println(parque);
      
    } else if (escolha == 2) {
      // Formulário -------------------------------------------------------
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      
      System.out.print("Peso minimo -> ");
      pesoMinimo = scanner.nextDouble();
      System.out.print("Peso máximo -> ");
      pesoMaximo = scanner.nextDouble();
      // ------------------------------------------------------------------
      
      cais.pesquisaCamioes(pesoMinimo, pesoMaximo);
    } else if (escolha == 3) {
      
      cais.sortList();
      cais.escreverCamioes();
    } else if (escolha == 4) {

      cais.sortCargaDescarga();
      cais.escreverCamioes();
    }
  }
}
