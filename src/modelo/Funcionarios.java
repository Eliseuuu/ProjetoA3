/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author ELIZEU
 */
public class Funcionarios {
    
    private int      CPF;
    private String   nome;
    private String   sobrenome;
    private int      nascimento;
    private String   sexo;
    
    
    public Funcionarios (){
        
    }
    
    public Funcionarios(int CPF, String nome, String sobrenome, int nascimento, String sexo){
        this.CPF = CPF;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    


}
