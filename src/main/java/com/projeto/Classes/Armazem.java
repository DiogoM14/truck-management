package com.projeto.Classes;

import com.projeto.Classes.LinkedList.LinkedList;

public class Armazem {
  private String nome;
  private String localizacao;
  private LinkedList<Camiao> cais;

  public Armazem(String nome, String localizacao, LinkedList<Camiao> cais) {
    this.nome = nome;
    this.localizacao = localizacao;
    this.cais = cais;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLocalizacao() {
    return this.localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public LinkedList<Camiao> getCais() {
    return this.cais;
  }

  public void setCais(LinkedList<Camiao> cais) {
    this.cais = cais;
  }

  @Override
  public String toString() {
    return "{" + " cais='" + cais + "'" + "}";
  }
}
