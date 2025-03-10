package com.projeto.Classes.LinkedList;

import com.projeto.Classes.Camiao;

public class LinkedList<T> {
  private Node<Camiao> head, tail;
  private int maxCapacity;
  
  public LinkedList() {
    head = tail = null;
    maxCapacity = 0;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }
  
  public void addCamiao(Camiao camiao) {
    if (this.maxCapacity >= 6) {
      System.out.println("Cais cheio!");
    } else {
      Node<Camiao> newNode = new Node<Camiao>(camiao);
      Node<Camiao> oldHead = head;
      
      if (head == null) {
        head = newNode;
        newNode.setNext(tail);
      } else {
        head = newNode;
        newNode.setNext(oldHead);

        maxCapacity ++;
      }
    }
  }
  
  public Camiao removeCamiao(Camiao camiao) {
    if (head == null) {
      System.out.println("Cais vazio");
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
    
    if (this.maxCapacity == 1 && found) {
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
  
  // public String getByPeso(double pesoMinimo, double pesoMaximo) {
  //   Node<Camiao> current = head;
  //   String result = "";
  //   int count = 1;
    
  //   while (current != null) {
  //     result += "Camiao " + count + ": " + current.getElement().toString() + "\n";
  //     current = current.getNext();
  //     count++;
  //   }
    
  //   System.out.println(result);
    
  //   return result;
  // }
  
  public void sortList() {
    Node<Camiao> current = head, index = null;
    Camiao temp;
    
    if (head == null) {
      return;
    }
    else {
      while (current != null) {
        index = current.getNext();
        
        while (index != null) {
          if (current.getElement().getCarga() > index.getElement().getCarga()) {
            temp = current.getElement();
            current.setElement(index.getElement());
            index.setElement(temp);
          }
          
          index = index.getNext();
        }
        current = current.getNext();
      }
    }
  }
  
  public void sortCargaDescarga() {
    Node<Camiao> current = head, index = null;
    Camiao temp;
    
    if (head == null) {
      return;
    }
    else {
      while (current != null) {
        index = current.getNext();
        
        while (index != null) {
          double x,z, y,j;
          
          x=current.getElement().getCarga();
          y=current.getElement().getTara();
          z=index.getElement().getCarga();
          j=index.getElement().getTara();
          
          if (current.getElement().getCargaDescarga() == index.getElement().getCargaDescarga()) {
            if (y-x > j-z) {
              temp = current.getElement();
              current.setElement(index.getElement());
              index.setElement(temp);
            }
          }
          
          index = index.getNext();
        }
        current = current.getNext();
      }
    }
  }
  
  public void escreverCamioes() {
    Node<Camiao> current = head;
    String result = "";
    int count = 1;
    
    for (int i = 0; i < 6; i++) {
      if (current == null) {
        System.out.println("null");
      } else {
        result += "Camiao " + count + ": " + current.getElement().toString() + "\n";
        current = current.getNext();
        count++;
      }
    }
    
    System.out.println(result);
  }
  
  public void pesoMinMax(Double min, Double max) {
    Node<Camiao> current = head;
    String result = "";
    int count = 1;
    
    while (current != null) {
      if(current.getElement().getCarga() > min && current.getElement().getCarga() < max) {
        
        System.out.println("\n\n " + current.getElement().getCarga() + " ----- " + max + " ----- " + min + "\n\n ");
        result += "Camiao " + count + ": " + current.getElement().toString() + "\n";
        
        count++;
      }
      current = current.getNext();
      
    }
    System.out.println(result);
  }

  public Node<Camiao> getHead() {
    return head;
  }

  public Camiao getNextToLeaveHours() {
    Node<Camiao> current = head;
    double horasMax = 0;
    Camiao toLeave = null;

    while (current != null) {
      if (current.getElement().getHorasNoCais() > horasMax && current.getElement().getHorasNoCais() >= 24) {
        toLeave = current.getElement();
        horasMax = current.getElement().getHorasNoCais();
      }
      current = current.getNext();
    }

    return toLeave;
  }
}
