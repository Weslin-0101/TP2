package model;

/**
 * Classe para armazenar as Salas
 * 
 * @author Cleber de Oliveira Brant
 */
public class Sala {
    
    private Integer numeroDaSala;
    private Integer capacidade;
    private String tecnologia;
    
    /**
     * Construtor para armazenas as informações da sala
     * 
     * @param numeroDaSala numero da Sala que vai ser cadastrada
     * @param capacidade capacidade da Sala
     * @param tecnologia tecnologia que tem na Sala
     */
    public Sala(Integer numeroDaSala, Integer capacidade, String tecnologia) {
        this.numeroDaSala = numeroDaSala;
        this.capacidade = capacidade;
        this.tecnologia = tecnologia;
    }

    /**
     * Construtor para armazenas as informações da Sala (número da sala e sua capacidade)
     * 
     * @param numeroDaSala numero da Sala que vai ser cadastrada
     * @param capacidade capacidade da Sala
     */
    public Sala(Integer numeroDaSala, Integer capacidade) {
        this.numeroDaSala = numeroDaSala;
        this.capacidade = capacidade;
    }

    public Integer getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(Integer numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    
}
