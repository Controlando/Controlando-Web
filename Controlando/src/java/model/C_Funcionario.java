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
public class C_Funcionario {
    
    private int codigo, codCargo;
    private String nome, emailAdm;
    private float renda, adicional;

    public C_Funcionario(int codigo, int codCargo, String nome, String emailAdm, float renda, float adicional) {
        this.codigo = codigo;
        this.codCargo = codCargo;
        this.nome = nome;
        this.emailAdm = emailAdm;
        this.renda = renda;
        this.adicional = adicional;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
       
}
