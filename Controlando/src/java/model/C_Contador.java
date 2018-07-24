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
public class C_Contador {
   private String nome, senha, emailAdm; 
   private int codigoEmp, adm, codigoAdm,status;

    public C_Contador(String nome, String senha, String emailAdm, int codigoEmp, int adm, int codigoAdm, int status) {
        this.nome = nome;
        this.senha = senha;
     
        this.emailAdm = emailAdm;
        
        this.codigoEmp = codigoEmp;
        this.adm = adm;
        this.codigoAdm = codigoAdm;
        this.status = status;
    }

    public int getCodigoEmp() {
        return codigoEmp;
    }

    public void setCodigoEmp(int codigoEmp) {
        this.codigoEmp = codigoEmp;
    }

    public int getAdm() {
        return adm;
    }

    public void setAdm(int adm) {
        this.adm = adm;
    }

    public int getCodigoAdm() {
        return codigoAdm;
    }

    public void setCodigoAdm(int codigoAdm) {
        this.codigoAdm = codigoAdm;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }

   
    
}
