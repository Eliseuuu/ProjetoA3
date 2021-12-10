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
public class ProdutosClasse {
    
    private int      codigo;
    private String   nome;
    private String   modelo;
    private String   categoria;
    private boolean  preço;
    
    
    public ProdutosClasse(){
        
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isPreço() {
        return preço;
    }

    public void setPreço(boolean preço) {
        this.preço = preço;
    }
    
    
}
