package com.company.CircularArrayQueue;

public class CircularArrayQueue<T> {
  private T[] arrayQueue;
  private int size, front, back;
  private static final int CAPACITY = 5;

  public CircularArrayQueue() {
    arrayQueue = (T[]) new Object[CAPACITY];
    size = front = back = 0;
  }

  public void enqueue(T element) {
    if (isFull()) {
      throw new IllegalStateException("Fila cheia");
    } else {
      arrayQueue[back] = element;
      back = (back + 1) % CAPACITY;
      size++;
    }
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Fila vazia");
    } else {
      T toReturn = arrayQueue[(front % CAPACITY)];
      arrayQueue[front] = null;
      front = (front + 1) % CAPACITY;
      size--;
      return toReturn;
    }
  }

  public T first() {
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
      throw new IllegalStateException("Fila vazia");
    }

    for (int i = 0; i < size; i++) {
      text += arrayQueue[(front + i) % CAPACITY] + " ";
    }

    return text;
  }
}
