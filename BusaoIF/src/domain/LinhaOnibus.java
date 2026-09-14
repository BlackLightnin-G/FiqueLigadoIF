package domain;

public class LinhaOnibus {
    private Integer id;
    private String numero;
    private String nome;
    private String empresaResponsavel;
    private String pontoOrigem;
    private String pontoDestino;

    public LinhaOnibus(Integer id, String numero, String nome, String empresaResponsavel,
            String pontoOrigem, String pontoDestino) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.empresaResponsavel = empresaResponsavel;
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmpresaResponsavel() { return empresaResponsavel; }
    public void setEmpresaResponsavel(String empresaResponsavel) { this.empresaResponsavel = empresaResponsavel; }
    public String getPontoOrigem() { return pontoOrigem; }
    public void setPontoOrigem(String pontoOrigem) { this.pontoOrigem = pontoOrigem; }
    public String getPontoDestino() { return pontoDestino; }
    public void setPontoDestino(String pontoDestino) { this.pontoDestino = pontoDestino; }

    @Override
    public String toString() {
        return "LinhaOnibus [id=" + id + ", numero=" + numero + ", nome=" + nome
                + ", empresaResponsavel=" + empresaResponsavel + ", pontoOrigem=" + pontoOrigem
                + ", pontoDestino=" + pontoDestino + "]";
    }
}
