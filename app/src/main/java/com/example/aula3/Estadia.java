package com.example.aula3;

public class Estadia {
    private  String NomeHospede;
    private int qtdDiaria;

    private double valorDiaria;
    private  String qtdHospedes;
    private  String tipoAcomodacao;

    public Estadia(String nome, int qtdDiaria, double valorDiaria, String tipoAcomodacao ) {
        this.NomeHospede = nome;
        this.qtdDiaria = qtdDiaria;
        this.valorDiaria = valorDiaria;
        this.tipoAcomodacao = tipoAcomodacao;

        // TODO CRIAR METODO PARA CALCULO DA ESTADIA!
    }// fim construtor




    // botao -> direito -> getter and setters

    public String getNomeHospede() {
        return NomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.NomeHospede = nomeHospede;
    }

    public int getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(int qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    public void setTipoAcomodacao(String tipoAcomodacao) {
        this.tipoAcomodacao = tipoAcomodacao;
    }
}// fim classe
