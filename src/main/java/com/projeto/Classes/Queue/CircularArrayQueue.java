package com.projeto.Classes.Queue;

public class CircularArrayQueue<Camiao> {
  private Camiao[] arrayQueue;
  private int size, front, back;
  private static final int CAPACITY = 50;

  public CircularArrayQueue() {
    arrayQueue = (Camiao[]) new Object[CAPACITY];
    size = front = back = 0;
  }

  public void enqueue(Camiao camiao) {
    arrayQueue[back] = camiao;
    back = (back + 1) % CAPACITY;
    size++;
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

  public boolean isFull() {
    return size == CAPACITY;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    String text = "";

    if (isEmpty()) {
      System.out.println("A fila está vazia!");
    } else {
      for (int i = 0; i < size; i++) {
        text += arrayQueue[(front + i) % CAPACITY] + " ";
      }
    }

    return text;
  }
}
