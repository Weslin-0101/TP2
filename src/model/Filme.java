package model;

/**
 * Classe que armazena as informações do Filme
 * 
 * @author Wesley Lira Carvalho
 */
public class Filme {
    
    private String titulo;
    private String duracao;
    private String sinopse;
    private String genero;
    private String emCartaz;
    private String atores;
    private String diretor;
    
    /**
     * Construtor responsável para gerar um Filme
     * 
     * @param titulo titulo do Filme
     * @param duracao duração do Filme
     * @param sinopse sinopse e detalhes do Filme
     * @param genero gênero do Filme
     * @param emCartaz se o Filme está ou não em cartaz
     * @param atores atores e atrizes que fazem parte do Filme
     * @param diretor diretor ou diretores do Filme
     */
    public Filme(String titulo, String duracao, String sinopse, String genero, String emCartaz, String atores,
            String diretor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.genero = genero;
        this.emCartaz = emCartaz;
        this.atores = atores;
        this.diretor = diretor;
    }

    /**
     * Construtor default
     */
    public Filme() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmCartaz() {
        return emCartaz;
    }

    public void setEmCartaz(String emCartaz) {
        this.emCartaz = emCartaz;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * Método responsável para printar e exibir as informações
     * do Filme que foi cadastrado
     */
    @Override
    public String toString() {
        return "Título: " + getTitulo() +"\n" + " Sinopse: " + getSinopse() + "\n" + " Gênero: " + getGenero()
            + "\n" + " Duração: " + getDuracao() + "\n" + " Atores: " + getAtores() + "\n" + " Diretor: " + getDiretor()
            + "\n" + " Está em cartaz: " + getEmCartaz() + "\n";
    }
}
