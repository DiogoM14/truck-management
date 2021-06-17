package com.projeto.Classes.Queue;

public class CircularArrayQueue<Camiao> {
  private Camiao[] arrayQueue;
  private int size, front, back;
  private static final int CAPACITY = 44;

  public CircularArrayQueue() {
    arrayQueue = (Camiao[]) new Object[CAPACITY];
    size = front = back = 0;
  }

  public boolean enqueue(Camiao camiao) {
    arrayQueue[back] = camiao;
    back = (back + 1) % CAPACITY;
    size++;

    return true;
  }

  public Camiao dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Fila vazia");
    } else {
      Camiao toReturn = arrayQueue[(front % CAPACITY)];
      arrayQueue[front] = null;
      front = (front + 1) % CAPACITY;
      size--;
      return toReturn;
    }
  }

  public Camiao first() {
    return arrayQueue[front];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void escreveParque() {
    String text = "";
    int pos = 1;
    
    for (int i = 0; i < size; i++) {
      System.out.println(text += "Pos. " + pos + "\t" + arrayQueue[(front + i) % CAPACITY] + "\n");
      pos++;
    }
  }

  @Override
  public String toString() {
    String text = "";
    int pos = 1;

    // if (isEmpty()) {
    //   // System.out.println("A fila está vazia!");
    // } 
      for (int i = 0; i < size; i++) {
        text += "Pos. " + pos + "\t" + arrayQueue[(front + i) % CAPACITY] + "\n";
        pos++;
      }

      System.out.println(text);

    return text;
  }
}
