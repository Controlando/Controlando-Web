/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class C_Despesa {
   private String nivel, periodo, data, nome;
   private int codCont,codigo;
   private float valor;

    public C_Despesa(String nome, float valor, String nivel, String periodo, String data, int codCont, int codigo) {
        this.nome = nome;
        this.nivel = nivel;
        this.periodo = periodo;
        this.data = data;
        this.codCont = codCont;
        this.valor = valor;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodCont() {
        return codCont;
    }

    public void setCodCont(int codCont) {
        this.codCont = codCont;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
   
}

