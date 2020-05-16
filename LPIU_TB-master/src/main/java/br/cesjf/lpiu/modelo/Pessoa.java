/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpiu.modelo;

import java.io.Serializable;

/**
 *
 * @author claud
 */
public class Pessoa implements Serializable {

    private String nome;
    private String cnh;
    private String dataNasc;

    public Pessoa() {
    }

    public Pessoa(String nome, String cnh, String dataNasc) {
        this.nome = nome;
        this.cnh = cnh;
        this.dataNasc = dataNasc;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public Object[] getpessoa(){
        Object pessoa[] = {nome,cnh,dataNasc};
        return pessoa;
    }
}
