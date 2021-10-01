package model;

public class Sala {
    
    private Integer numeroDaSala;
    private Integer capacidade;
    private String tecnologia;
    
    public Sala(Integer numeroDaSala, Integer capacidade, String tecnologia) {
        this.numeroDaSala = numeroDaSala;
        this.capacidade = capacidade;
        this.tecnologia = tecnologia;
    }

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
