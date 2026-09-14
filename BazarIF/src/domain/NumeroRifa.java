package domain;

public class NumeroRifa {
    private Integer id;
    private Integer numero;
    private Double valor;
    private SituacaoNumeroRifaEnum situacao;
    private Pessoa comprador;
    private Campanha campanha;

    public NumeroRifa(Integer id, Integer numero, Double valor, SituacaoNumeroRifaEnum situacao,
            Pessoa comprador, Campanha campanha) {
        this.id = id;
        this.numero = numero;
        this.valor = valor;
        this.situacao = situacao;
        this.comprador = comprador;
        this.campanha = campanha;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public SituacaoNumeroRifaEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoNumeroRifaEnum situacao) { this.situacao = situacao; }
    public Pessoa getComprador() { return comprador; }
    public void setComprador(Pessoa comprador) { this.comprador = comprador; }
    public Campanha getCampanha() { return campanha; }
    public void setCampanha(Campanha campanha) { this.campanha = campanha; }

    @Override
    public String toString() {
        return "NumeroRifa [id=" + id + ", numero=" + numero + ", valor=" + valor
                + ", situacao=" + situacao + ", comprador=" + comprador + "]";
    }
}
