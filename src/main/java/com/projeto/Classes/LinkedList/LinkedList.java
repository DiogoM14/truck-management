package com.projeto.Classes.LinkedList;

import com.projeto.Classes.Camiao;

public class LinkedList<T> {
  private Node<Camiao> head, tail;
  private int capacity;

  public LinkedList() {
    head = null;
    tail = null;
    capacity = 0;
  }

  public void createCais() {
    Node<Camiao> porta = new Node<>();

    for (int i = 0; i < 6; i++) {
      if (head == null) {
        head = porta;
        head.setNext(null);
      } else if (tail == null) {
        tail = porta;
        tail.setNext(null);
        head.setNext(tail);
      } else {
        tail.setNext(porta);
        tail = porta;
      }
    }
  }

  // Adding to end of LinkedList
  public void add(Camiao camiao) {
    if (this.capacity == 6) {
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
    }
  }

  // Removing a chosen camiao
  public void remove(T camiao) {
    Node<Camiao> previous = null;
    Node<Camiao> current = head;
    boolean found = false;

    try {
      while (current != null && !found) {
        if (camiao.equals(current.getElement())) {
          found = true;
        } else {
          previous = current;
          current = current.getNext();
        }
      }

      if (!found) {
        System.out.println("Camião não encontrado");
      }

      if (capacity == 1) {
        head = null;
      } else if (head.equals(current)) {
        head = current.getNext();
      } else if (tail.equals(current)) {
        tail = previous;
        tail.setNext(null);
      } else {
        previous.setNext(current.getNext());
      }

      capacity--;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public String toString() {
    return "LinkedList{" + "head=" + head + ", tail=" + tail + ", size=" + capacity + '}';
  }
}
