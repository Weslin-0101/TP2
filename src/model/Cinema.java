package model;

import java.util.ArrayList;
import java.util.List;

public class Cinema{
    private String nome;
    private ArrayList<Sala> salas;
    private Localidade localidade;

    public Cinema() {} //default

    //construtor sobrecarregado
    public Cinema(String nome, Localidade localidade, Sala sala){
        this.nome = nome;
        this.localidade = localidade;
        this.salas = new ArrayList<>();
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

    //métodos da classe
    @Override
    public String toString(){
        return "Nome: "+getNome()+"\n";
    }
}