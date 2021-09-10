package model;

public class Sala {
    
    private Integer numeroDaSala;
    private Integer capacidade;
    private String mapaDaSala;
    private String tecnologia;
    
    public Sala(Integer numeroDaSala, Integer capacidade, String mapaDaSala, String tecnologia) {
        this.numeroDaSala = numeroDaSala;
        this.capacidade = capacidade;
        this.mapaDaSala = mapaDaSala;
        this.tecnologia = tecnologia;
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

    public String getMapaDaSala() {
        return mapaDaSala;
    }

    public void setMapaDaSala(String mapaDaSala) {
        this.mapaDaSala = mapaDaSala;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

}
