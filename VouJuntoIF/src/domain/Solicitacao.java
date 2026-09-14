package domain;

import java.time.LocalDateTime;

public class Solicitacao {
    private Integer id;
    private LocalDateTime dataSolicitacao;
    private SituacaoSolicitacaoEnum situacao;
    private Aluno passageiro;

    public Solicitacao(Integer id, LocalDateTime dataSolicitacao,
            SituacaoSolicitacaoEnum situacao, Aluno passageiro) {
        this.id = id;
        this.dataSolicitacao = dataSolicitacao;
        this.situacao = situacao;
        this.passageiro = passageiro;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public LocalDateTime getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(LocalDateTime dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }
    public SituacaoSolicitacaoEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoSolicitacaoEnum situacao) { this.situacao = situacao; }
    public Aluno getPassageiro() { return passageiro; }
    public void setPassageiro(Aluno passageiro) { this.passageiro = passageiro; }

    @Override
    public String toString() {
        return "Solicitacao [id=" + id + ", dataSolicitacao=" + dataSolicitacao
                + ", situacao=" + situacao + ", passageiro=" + passageiro + "]";
    }
}
