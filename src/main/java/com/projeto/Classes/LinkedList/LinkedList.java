package com.projeto.Classes.LinkedList;

import com.projeto.Classes.Camiao;

public class LinkedList<T> {
  private Node<Camiao> head, tail;
  private int maxCapacity;

  public LinkedList() {
    head = null;
    tail = null;
    maxCapacity = 0;
  }

  public void createCais() {
    Node<Camiao> cais = new Node<>();

    for (int i = 0; i < 6; i++) {
      if (head == null) {
        head = cais;
        head.setNext(null);
      } else if (tail == null) {
        tail = cais;
        tail.setNext(null);
        head.setNext(tail);
      } else {
        tail.setNext(cais);
        tail = cais;
      }
    }
  }

  // Adding to end of LinkedList
  public void add(Camiao camiao) {
    if (this.maxCapacity >= 6) {
      System.out.println("Cais cheio.");
    } else {
      Node<Camiao> current = head;
      boolean found = false;

      while (current != null && found == false) {
        if (current.getCamiao() == null) {
          current.setCamiao(camiao);
          found = true;
        } else {
          current = current.getNext();
        }
      }

      maxCapacity ++;
    }
  }

  // // Removing a chosen camiao
  // public void remove(T camiao) {
  //   Node<Camiao> previous = null;
  //   Node<Camiao> current = head;
  //   boolean found = false;

  //   try {
  //     while (current != null && !found) {
  //       if (camiao.equals(current.getElement())) {
  //         found = true;
  //       } else {
  //         previous = current;
  //         current = current.getNext();
  //       }
  //     }

  //     if (!found) {
  //       System.out.println("Camião não encontrado");
  //     }

  //     if (capacity == 1) {
  //       head = null;
  //     } else if (head.equals(current)) {
  //       head = current.getNext();
  //     } else if (tail.equals(current)) {
  //       tail = previous;
  //       tail.setNext(null);
  //     } else {
  //       previous.setNext(current.getNext());
  //     }

  //     capacity--;
  //   } catch (Exception e) {
  //     System.out.println(e.getMessage());
  //   }
  // }

  @Override
  public String toString() {
    return "CAIS DO PORTO CARALHO";
  }
}
