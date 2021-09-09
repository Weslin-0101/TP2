package model;

//importação da lista/arraylist
import java.util.List;
import java.util.ArrayList;

public class Localidade {
    private String endereco;
    private String cep;
    private String pontoDeReferencia;

    private List<Localidade> localidades = new ArrayList<>();


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

//métodos da classe
@Override
public String toString(){
    return "Endereco: "+getendereco()+" Cep: "+getCep()+" Ponto de referencia: "+getPontoDeReferencia()+"\n";
}

}
