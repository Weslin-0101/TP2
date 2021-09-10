package model;

import java.util.Date;

public class Cinema{
    private String nome;
    private Localidade localidade;

    public Cinema() {} //default

    //construtor sobrecarregado
    public Cinema(String nome){
        this.nome = nome;
    }

    //metodos de acesso - getters - setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //métodos da classe
    @Override
    public String toString(){
        return "Nome: "+getNome()+"\n";
    }
}