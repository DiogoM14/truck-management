package com.projeto.Classes;

import com.projeto.Classes.LinkedList.LinkedList;
import com.projeto.Classes.Queue.CircularArrayQueue;

public class Armazem {
  private String nome;
  private LinkedList<Camiao> cais;
  private CircularArrayQueue<Camiao> parque;

  public Armazem(String nome) {
    this.nome = nome;
    this.cais = new LinkedList<>();
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
}
