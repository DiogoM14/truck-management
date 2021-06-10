package com.projeto.Classes;

import com.projeto.Classes.LinkedList.LinkedList;

public class Armazem {
  private LinkedList cais = new LinkedList<Camiao>();

  public Armazem() {
    cais.createCais();
  }

  @Override
  public String toString() {
    return "{" + " cais='" + cais + "'" + "}";
  }

}
