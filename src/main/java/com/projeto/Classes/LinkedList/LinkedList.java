package com.projeto.Classes.LinkedList;

import com.projeto.Classes.Camiao;

public class LinkedList<T> {
  private Node<Camiao> head, tail;
  private int maxCapacity;
  
  public LinkedList() {
    head = tail = null;
    maxCapacity = 0;
  }
  
  public void addCamiao(Camiao camiao) {
    if (this.maxCapacity >= 6) {
      System.out.println("Cais cheio.");
    } else {
      Node<Camiao> newNode = new Node<Camiao>(camiao);
      Node<Camiao> oldHead = head;
      
      if (head == null) {
        head = newNode;
        newNode.setNext(tail);
      } else {
        head = newNode;
        newNode.setNext(oldHead);
      }
      
      maxCapacity ++;
    }
  }
  
  public Camiao removeCamiao(Camiao camiao) {
    if (head == null) {
      System.out.println("Impossivel eliminar");
    }
    boolean found = false;
    Node<Camiao> previous = null;
    Node<Camiao> current = head;
    
    while (current != null && !found) {
      if (camiao.equals(current.getElement())) {
        found = true;
      } else {
        previous = current;
        current = current.getNext();
      }
    }
    
    if (!found) {
      System.out.println("Impossivel eliminar");
    }
    
    if (this.maxCapacity == 1) {
      head = tail = null;
    } else if (current.equals(head)) {
      head = current.getNext();
    } else if (current.equals(tail)) {
      tail = previous;
      tail.setNext(null);
    } else {
      previous.setNext(current.getNext());
    }
    
    maxCapacity--;
    
    return current.getElement();
  }
  
  public void escreverCamioes() {
    Node<Camiao> current = head;
    String result = "";
    int count = 1;
    
    while (current != null) {
      result += "Camiao " + count + ": " + current.getElement().toString() + "\n";
      current = current.getNext();
      count++;
    }
    
    System.out.println(result);
  }
}
