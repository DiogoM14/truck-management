package com.company.Queue;

public interface QueueADT<T> {
  public void enqueue(T element);

  public Node<T> dequeue();

  public Node<T> first();

  public boolean isEmpty();

  public int size();

  public String toString();
}
