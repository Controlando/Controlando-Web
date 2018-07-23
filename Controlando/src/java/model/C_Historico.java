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
public class C_Historico {
   private String hora, data, descricao; 
   private int codContador;

    public C_Historico(String hora, String data, String descricao, int codContador) {
        this.hora = hora;
        this.data = data;
        this.descricao = descricao;
        this.codContador = codContador;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodContador() {
        return codContador;
    }

    public void setCodContador(int codContador) {
        this.codContador = codContador;
    }

    
    
}
