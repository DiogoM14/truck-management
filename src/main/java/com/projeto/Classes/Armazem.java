package com.projeto.Classes;

import com.projeto.Classes.LinkedList.LinkedList;
import com.projeto.Classes.Queue.CircularArrayQueue;

public class Armazem {
  private String nome;
  private LinkedList<Camiao> cais;
  private CircularArrayQueue<Camiao> parque;

  public Armazem(String nome, LinkedList<Camiao> cais, CircularArrayQueue<Camiao> parque) {
    this.nome = nome;
    this.cais = cais;
    this.parque = new CircularArrayQueue<>();
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LinkedList<Camiao> getCais() {
    return this.cais;
  }

  public void setCais(LinkedList<Camiao> cais) {
    this.cais = cais;
  }

  public CircularArrayQueue<Camiao> getParque() {
    return this.parque;
  }

  public void setParque(CircularArrayQueue<Camiao> parque) {
    this.parque = parque;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", cais='" + getCais() + "'" +
      ", parque='" + parque.toString() + "'" +
      "}";
  }
}
