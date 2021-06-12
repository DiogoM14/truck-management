package com.projeto.Classes;

public class Camiao {
  private String matricula;
  private Armazem destino;
  private String hora_chegada;
  private String dia_chegada;
  private Double tara;
  private Double carga;

  public Camiao(String matricula, Armazem destino, String hora_chegada, String dia_chegada, Double tara, Double carga) {
    this.matricula = matricula;
    this.destino = destino;
    this.hora_chegada = hora_chegada;
    this.dia_chegada = dia_chegada;
    this.tara = tara;
    this.carga = carga;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public Armazem getDestino() {
    return this.destino;
  }

  public void setDestino(Armazem destino) {
    this.destino = destino;
  }

  public String getHora_chegada() {
    return this.hora_chegada;
  }

  public void setHora_chegada(String hora_chegada) {
    this.hora_chegada = hora_chegada;
  }

  public String getDia_chegada() {
    return this.dia_chegada;
  }

  public void setDia_chegada(String dia_chegada) {
    this.dia_chegada = dia_chegada;
  }

  public Double getTara() {
    return this.tara;
  }

  public void setTara(Double tara) {
    this.tara = tara;
  }

  public Double getCarga() {
    return this.carga;
  }

  public void setCarga(Double carga) {
    this.carga = carga;
  }

  @Override
  public String toString() {
    return "{" +
      " matricula='" + getMatricula() + "'" +
      ", destino='" + getDestino() + "'" +
      ", hora_chegada='" + getHora_chegada() + "'" +
      ", dia_chegada='" + getDia_chegada() + "'" +
      ", tara='" + getTara() + "'" +
      ", carga='" + getCarga() + "'" +
      "}";
  }
}