package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SolicitacaoPasse {
    private Integer id;
    private LocalDate dataSolicitacao;
    private SituacaoSolicitacaoEnum situacao;
    private Estudante estudante;
    private LinhaOnibus linhaOnibus;
    private List<Documento> documentos = new ArrayList<>();

    public SolicitacaoPasse(Integer id, LocalDate dataSolicitacao, SituacaoSolicitacaoEnum situacao,
            Estudante estudante, LinhaOnibus linhaOnibus) {
        this.id = id;
        this.dataSolicitacao = dataSolicitacao;
        this.situacao = situacao;
        this.estudante = estudante;
        this.linhaOnibus = linhaOnibus;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public LocalDate getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(LocalDate dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }
    public SituacaoSolicitacaoEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoSolicitacaoEnum situacao) { this.situacao = situacao; }
    public Estudante getEstudante() { return estudante; }
    public void setEstudante(Estudante estudante) { this.estudante = estudante; }
    public LinhaOnibus getLinhaOnibus() { return linhaOnibus; }
    public void setLinhaOnibus(LinhaOnibus linhaOnibus) { this.linhaOnibus = linhaOnibus; }
    public List<Documento> getDocumentos() { return documentos; }
    public void setDocumentos(List<Documento> documentos) { this.documentos = documentos; }

    @Override
    public String toString() {
        return "SolicitacaoPasse [id=" + id + ", dataSolicitacao=" + dataSolicitacao
                + ", situacao=" + situacao + ", estudante=" + estudante + ", linhaOnibus=" + linhaOnibus
                + ", documentos=" + documentos + "]";
    }
}
