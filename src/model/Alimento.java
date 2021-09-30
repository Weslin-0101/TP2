package model; 

public class Alimento{
    
    private String nome;
    private String combos;
    private String pipocas;
    private String bebidas;
    private String doces;
    private Double preco;
    private String descricao;
    
    public Alimento() {} //default
    
    //construtor sobrecarregado
    public Alimento(String nome, String combos, String pipocas, String bebidas, String doces, Double preco,
            String descricao) {
        this.nome = nome;
        this.combos = combos;
        this.pipocas = pipocas;
        this.bebidas = bebidas;
        this.doces = doces;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Alimento(String nome, Double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    //metodos de acesso - getters - setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCombos() {
        return combos;
    }

    public void setCombos(String combos) {
        this.combos = combos;
    }

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getDoces() {
        return doces;
    }

    public void setDoces(String doces) {
        this.doces = doces;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //métodos da classe
    @Override
    public String toString(){
        return "Nome: "+getNome()+" /"+" Combos: "+getCombos()+" /"+" Pipocas: "+getPipocas()+" /"+" Bebidas: "
        +getBebidas()+" /"+" Doces: "+getDoces()+" /"+" Preco: "+getPreco()+" /"+" Descricao: "+getDescricao()+"\n";
    }
}