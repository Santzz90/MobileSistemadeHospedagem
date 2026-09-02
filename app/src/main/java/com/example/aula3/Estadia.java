package com.example.aula3;

public class Estadia {
    private  String NomeHospede;
    private int qtdDiaria;

    private double valorDiaria;
    private int qtdHospedes;
    private  String tipoAcomodacao;

    public Estadia(String nome, int qtdDiaria, double valorDiaria, String tipoAcomodacao, int qtdHospedes ) {
        this.NomeHospede = nome;
        this.qtdDiaria = qtdDiaria;
        this.valorDiaria = valorDiaria;
        this.tipoAcomodacao = tipoAcomodacao;
        this.qtdHospedes = qtdHospedes;
        // TODO CRIAR METODO PARA CALCULO DA ESTADIA!
    }// fim construtor

    public double calcularTotalEstadia(){
        double valorBase = this.valorDiaria * this.qtdDiaria;
        double adicional = 0.0;
        String tipo = this.tipoAcomodacao != null ? this.tipoAcomodacao : "";
        if (tipo.equalsIgnoreCase("Luxo")){
            adicional = valorBase *0.20;

        }else if (tipo.equalsIgnoreCase("Suite")){
            adicional = valorBase * 0.35;
        }

        double taxaExcedente =0.0;
        if (this.qtdHospedes > 2 ){
            int hospedesExcedentes = this.qtdHospedes - 2;
            taxaExcedente = hospedesExcedentes *50.0 *this.qtdDiaria;
        }
            return valorBase + adicional + taxaExcedente;
    }


    // botao -> direito -> getter and setters

    public String getNomeHospede() {
        return NomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.NomeHospede = nomeHospede;
    }

    public int getQtdHospedes(){
        return qtdHospedes;
    }
    public void setQtdHospedes(int qtdHospedes) {
        this.qtdHospedes = qtdHospedes;

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
