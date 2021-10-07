package model;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe que armazena as informações da Localidade
 * 
 * @author Cleber de Oliveira Brant
 */
public class Localidade {
    
    private String endereco;
    private String cep;
    private String pontoDeReferencia;
    private ArrayList<Cinema> cinemas;


    /**
     * Construtor default
     */
    public Localidade() {}

    /**
     * Construtor responsável para armazenar as informações 
     * de uma nova Localidade cadastrada.
     * Recebe também uma arrayList em branco de Cinema
     * @see Cinema
     * 
     * @param endereco endereço/localidade
     * @param cep cep do local
     * @param pontoDeReferencia ponto de referência do local
     */
    public Localidade(String endereco, String cep, String pontoDeReferencia){
        this.cinemas = new ArrayList<>();
        this.endereco = endereco;
        this.cep = cep;
        this.pontoDeReferencia = pontoDeReferencia;
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
        return cinemas;
    }

    /**
     * Método responsável para exibir e printar as informações
     * dos dados de uma nova localidade cadastrada quando
     * selecionada
     */
    @Override
    public String toString(){
        return "Cinema: " + getCinema() + "\n" + 
            "Endereco: " + getEndereco() + "\n" + 
            " Cep: " + getCep() + "\n" +
            " Ponto de referencia: " + getPontoDeReferencia()+ "\n";
    }

}
