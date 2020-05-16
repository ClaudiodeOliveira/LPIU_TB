/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.modelo;

/**
 *
 * @author morae
 */
public class Relatorio {
    private String nome;
    private String modelo;
    private String placa;

    public Relatorio() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "nome=" + nome + ", modelo=" + modelo + ", placa=" + placa + '}';
    }
    
    public Object [] getrelatorio(){
        Object relatorio[]={nome,modelo,placa};
        return relatorio;
    }
    
    
}
