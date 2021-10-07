package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que armazena as informações de um Cinema
 * 
 * @author Wesley Lira Carvalho
 */
public class Cinema{
    private String nome;
    private ArrayList<Sala> salas;
    private Localidade localidade;

    /**
     * Construtor default
     */
    public Cinema() {} 

    /**
     * Gerar um novo Cinema, e recebe a Localidade e uma 
     * arraylist de Salas
     * 
     * @param nome nome do Cinema
     * @param localidade localidade do Cinema
     * @param sala sala que o Cinema possui
     */
    public Cinema(String nome, Localidade localidade, Sala sala){
        this.nome = nome;
        this.localidade = localidade;
        this.salas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    /**
     * Método toString para poder printar as informações
     * do Cinema cadastrado ou selecionado
     */
    @Override
    public String toString(){
        return "Nome: "
            + getNome()
            + "\n"
            + localidade.getEndereco()
            + "\n"
            + localidade.getCep()
            + "\n"
            + localidade.getPontoDeReferencia()
            + "\n";
    }
}