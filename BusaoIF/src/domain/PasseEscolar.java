package domain;

import java.time.LocalDate;

public class PasseEscolar {
    private Integer id;
    private String numero;
    private LocalDate dataEmissao;
    private LocalDate dataValidade;
    private SituacaoPasseEnum situacao;
    private SolicitacaoPasse solicitacao;

    public PasseEscolar(Integer id, String numero, LocalDate dataEmissao, LocalDate dataValidade,
            SituacaoPasseEnum situacao, SolicitacaoPasse solicitacao) {
        this.id = id;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
        this.situacao = situacao;
        this.solicitacao = solicitacao;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public LocalDate getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(LocalDate dataEmissao) { this.dataEmissao = dataEmissao; }
    public LocalDate getDataValidade() { return dataValidade; }
    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }
    public SituacaoPasseEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoPasseEnum situacao) { this.situacao = situacao; }
    public SolicitacaoPasse getSolicitacao() { return solicitacao; }
    public void setSolicitacao(SolicitacaoPasse solicitacao) { this.solicitacao = solicitacao; }

    @Override
    public String toString() {
        return "PasseEscolar [id=" + id + ", numero=" + numero + ", dataEmissao=" + dataEmissao
                + ", dataValidade=" + dataValidade + ", situacao=" + situacao
                + ", solicitacao=" + solicitacao + "]";
    }
}
