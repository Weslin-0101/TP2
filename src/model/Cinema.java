package model;

import java.util.List;

public class Cinema{
    private String nome;
    private List<Sala> salas;

    public Cinema() {} //default

    //construtor sobrecarregado
    public Cinema(String nome, List<Sala> salas){
        this.nome = nome;
        this.salas = salas;
    }

    //metodos de acesso - getters - setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    //métodos da classe
    @Override
    public String toString(){
        return "Nome: "+getNome()+"\n";
    }
}