package com.projeto.Classes;

import com.projeto.Classes.LinkedList.LinkedList;

public class Armazem {
  private String nome;
  private LinkedList<Camiao> cais;

  public Armazem(String nome, LinkedList<Camiao> cais) {
    this.nome = nome;
    this.cais = cais;
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


  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", cais='" + getCais() + "'" +
      "}";
  }
}
