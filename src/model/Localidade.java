package model;

//importação da lista/arraylist
import java.util.List;
import java.util.ArrayList;

public class Localidade {
    
    private String endereco;
    private String cep;
    private String pontoDeReferencia;
    private List<Cinema> cinema;


public Localidade() {} //default

//construtor sobrecarregado
public Localidade(List<Cinema> cinema ,String endereco, String cep, String pontoDeReferencia){
    this.cinema = cinema;
    this.endereco = endereco;
    this.cep = cep;
    this.pontoDeReferencia = pontoDeReferencia;
}

//metodos de acesso - getters - setter
public String getendereco() {
    return endereco;
}

public void setendereco(String endereco) {
    this.endereco = endereco;
}

public String getCep() {
    return cep;
}

public void setCep(String cep) {
    this.cep = cep;
}

public String getPontoDeReferencia() {
    return pontoDeReferencia;
}

public void setPontoDeReferencia(String pontoDeReferencia) {
    this.pontoDeReferencia = pontoDeReferencia;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public List<Cinema> getCinema() {
    return cinema;
}

//métodos da classe
@Override
public String toString(){
    return "Cinema: " + getCinema() + "\n" + 
        "Endereco: " + getendereco() + "\n" + 
        " Cep: " + getCep() + "\n" +
        " Ponto de referencia: " + getPontoDeReferencia()+ "\n";
}

}
