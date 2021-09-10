package model;

import java.util.Date;

public class Sessao {
    
    private Date dataDaSessao;
    private Date horario;

    private Sala sala;
    
    public Sessao(Date dataDaSessao, Date horario, Sala sala) {
        this.dataDaSessao = dataDaSessao;
        this.horario = horario;
        this.sala = sala;
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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    
}
