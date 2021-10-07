package model; 

/**
 * Classe que armazena as informações de um Alimento
 * 
 * @author Cleber de Oliveira Brant
 */
public class Alimento{
    
    private String nome;
    private String combos;
    private String pipocas;
    private String bebidas;
    private String doces;
    private Double preco;
    private String descricao;
    
    /**
     * Construtor default
     */
    public Alimento() {}
    
    /**
     * Construtor sobrecarregado para gerar um novo Alimento com as seguintes informações:
     * 
     * @param nome nome do alimento que será cadastrado
     * @param combos combos para caso o Alimento seja um tipo Combo
     * @param pipocas pipoca para caso o Alimento seja um tipo Pipoca
     * @param bebidas bebidas para caso o Alimento seja um tipo Bebidas
     * @param doces doce para caso o Alimento seja um tipo Doces
     * @param preco preço que vai ser de cada Alimento cadastrado
     * @param descricao descrição para detalhar ou resumir o Alimento
     */
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

    /**
     * Construtor para armazenar as informações do Alimento dentro da view
     * de CadastrarAlimento
     * 
     * @param nome nome do Alimento que vai ser cadastrado
     * @param preco preço do Alimento que vai ser cadastrado
     * @param descricao descrição do Alimento que vai ser cadastrado
     */
    public Alimento(String nome, Double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

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
    
    /**
     * ToString para poder printar as informações do Alimento cadastrado
     * ou selecionado
     */
    @Override
    public String toString(){
        return "Nome: "+getNome()+" /"+" Combos: "+getCombos()+" /"+" Pipocas: "+getPipocas()+" /"+" Bebidas: "
        +getBebidas()+" /"+" Doces: "+getDoces()+" /"+" Preco: "+getPreco()+" /"+" Descricao: "+getDescricao()+"\n";
    }
}