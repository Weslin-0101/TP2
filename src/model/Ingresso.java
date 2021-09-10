package model;

import java.util.List;
import java.util.ArrayList;

public class Ingresso {
    
    private Double valor;
    private String tipo;
    private Integer numeroDaPoltrona;
    private Double taxa;
    private Integer quantidade;

    private Filme filme;
    private Sala sala;

    public Ingresso() {

    }

    public Ingresso(Double valor, String tipo, Integer numeroDaPoltrona, Double taxa, Integer quantidade) {
        this.valor = valor;
        this.tipo = tipo;
        this.numeroDaPoltrona = numeroDaPoltrona;
        this.taxa = taxa;
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroDaPoltrona() {
        return numeroDaPoltrona;
    }

    public void setNumeroDaPoltrona(Integer numeroDaPoltrona) {
        this.numeroDaPoltrona = numeroDaPoltrona;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return 
            // "Título: " + getFilme().getTitulo() + "\n" +
            " Tipo: " + getTipo() + "\n" + 
            " Valor: R$ " + getValor() + "\n" +
            // " Sala: " + getSala().getNumeroDaSala() + "\n" +
            " Poltrona: " + getNumeroDaPoltrona() + "\n" +
            " Taxa: " + getTaxa() + "%" + "\n";  
    }
}
