package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para armazenar as Sessões
 * 
 * @author Wesley Lira Carvalho
 */
public class Sessao {
    
    private String dataDaSessao;
    private String horario;

    private ArrayList<Sala> salas;
    
    /**
     * Construtor responsável para armazenas as informações da sessão
     * O construtor recebe também uma arraylist em branco da Sala
     * 
     * @param dataDaSessao data da sessão que vai ser cadastrada
     * @param horario horário da sessão que vai ser cadastrada
     */
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
