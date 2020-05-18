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
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Pessoa() {
    }

    public Pessoa(String nome, String cnh, String dataNasc) {
        this.nome = nome;
        this.cnh = cnh;
        this.dataNasc = dataNasc;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cnh=" + cnh + ","
                + " dataNasc=" + dataNasc + ", rua=" + rua + ", numero="
                + numero + ", complemento=" + complemento + ", bairro="
                + bairro + ", cidade=" + cidade + ", estado=" + estado
                + ", cep=" + cep + '}';
    }

    public Object[] getpessoa() {
        Object pessoa[] = {nome, cnh, dataNasc, rua, numero, complemento, bairro,
            cidade, estado, cep};
        return pessoa;
    }
}
