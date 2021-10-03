package model;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    
    private String dataDaSessao;
    private String horario;

    private ArrayList<Sala> salas;
    
    public Sessao(String dataDaSessao, String horario) {
        this.dataDaSessao = dataDaSessao;
        this.horario = horario;
        this.salas = new ArrayList<>();
    }

    public String getDataDaSessao() {
        return dataDaSessao;
    }

    public void setDataDaSessao(String dataDaSessao) {
        this.dataDaSessao = dataDaSessao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Sala> getSalas() {
        return salas;
    }
}
