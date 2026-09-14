package domain;

import java.time.LocalDate;

public class Documento {
    private Integer id;
    private String nome;
    private LocalDate dataEnvio;
    private SituacaoDocumentoEnum situacao;

    public Documento(Integer id, String nome, LocalDate dataEnvio, SituacaoDocumentoEnum situacao) {
        this.id = id;
        this.nome = nome;
        this.dataEnvio = dataEnvio;
        this.situacao = situacao;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataEnvio() { return dataEnvio; }
    public void setDataEnvio(LocalDate dataEnvio) { this.dataEnvio = dataEnvio; }
    public SituacaoDocumentoEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoDocumentoEnum situacao) { this.situacao = situacao; }

    @Override
    public String toString() {
        return "Documento [id=" + id + ", nome=" + nome + ", dataEnvio=" + dataEnvio
                + ", situacao=" + situacao + "]";
    }
}
