package model;

public class Pagamento {
    
    private String numeroDoCartao;
    private String nomeImpresso;
    private String dataDeValidade;
    private String codigoDeSeguranca;
    private String cpf;
    private String pix;
    private Double dinheiro;
    
    public Pagamento(String numeroDoCartao, String nomeImpresso, String dataDeValidade, String codigoDeSeguranca,
            String cpf) {
        this.numeroDoCartao = numeroDoCartao;
        this.nomeImpresso = nomeImpresso;
        this.dataDeValidade = dataDeValidade;
        this.codigoDeSeguranca = codigoDeSeguranca;
        this.cpf = cpf;
    }

    
    public Pagamento(String cpf, String pix) {
        this.cpf = cpf;
        this.pix = pix;
    }

    public Pagamento(Double dinheiro) {
        this.dinheiro = dinheiro;
    }


    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNomeImpresso() {
        return nomeImpresso;
    }

    public void setNomeImpresso(String nomeImpresso) {
        this.nomeImpresso = nomeImpresso;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String getCodigoDeSeguranca() {
        return codigoDeSeguranca;
    }

    public void setCodigoDeSeguranca(String codigoDeSeguranca) {
        this.codigoDeSeguranca = codigoDeSeguranca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }


}
