/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author e100397
 */
public class C_Receita {
    
    String nome, periodo, data;
    private int codigo, codCont;
    private float valor;
                                //codigo, nome, valor, periodo, data, CodCont
    public C_Receita(String nome, float valor, String periodo, String data, int codCont,int codigo) {
        this.nome = nome;
        this.periodo = periodo;
        this.data = data;
        this.codigo = codigo;
        this.codCont = codCont;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodCont() {
        return codCont;
    }

    public void setCodCont(int codCont) {
        this.codCont = codCont;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}