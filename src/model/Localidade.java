package model;

//importação da lista/arraylist
import java.util.List;
import java.util.ArrayList;

public class Localidade {
    private String endereco;
    private String cep;
    private String pontoDeReferencia;

    private Cinema cinema;


public Localidade() {} //default

//construtor sobrecarregado
public Localidade(String endereco, String cep, String pontoDeReferencia){
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

public Cinema getCinema() {
    return cinema;
}

public void setCinema(Cinema cinema) {
    this.cinema = cinema;
}

//métodos da classe
@Override
public String toString(){
    return "Cinema: " + getCinema() + "Endereco: " +getendereco()+ " Cep: " +getCep()+ " Ponto de referencia: " +getPontoDeReferencia()+ "\n";
}

}
