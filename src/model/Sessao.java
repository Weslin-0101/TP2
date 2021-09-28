package model;

import java.util.Date;
import java.util.List;

public class Sessao {
    
    private Date dataDaSessao;
    private Date horario;

    private List<Sala> salas;
    
    public Sessao(Date dataDaSessao, Date horario, List<Sala> salas) {
        this.dataDaSessao = dataDaSessao;
        this.horario = horario;
        this.salas = salas;
    }

    public Date getDataDaSessao() {
        return dataDaSessao;
    }

    public void setDataDaSessao(Date dataDaSessao) {
        this.dataDaSessao = dataDaSessao;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}
