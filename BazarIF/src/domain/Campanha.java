package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campanha {
    private Integer id;
    private String titulo;
    private String descricao;
    private String objetivo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Double metaFinanceira;
    private TipoCampanhaEnum tipo;
    private Pessoa responsavel;
    private List<Produto> produtos = new ArrayList<>();

    public Campanha(Integer id, String titulo, String descricao, String objetivo,
            LocalDate dataInicio, LocalDate dataTermino, Double metaFinanceira,
            TipoCampanhaEnum tipo, Pessoa responsavel) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.objetivo = objetivo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.metaFinanceira = metaFinanceira;
        this.tipo = tipo;
        this.responsavel = responsavel;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
    public LocalDate getDataTermino() { return dataTermino; }
    public void setDataTermino(LocalDate dataTermino) { this.dataTermino = dataTermino; }
    public Double getMetaFinanceira() { return metaFinanceira; }
    public void setMetaFinanceira(Double metaFinanceira) { this.metaFinanceira = metaFinanceira; }
    public TipoCampanhaEnum getTipo() { return tipo; }
    public void setTipo(TipoCampanhaEnum tipo) { this.tipo = tipo; }
    public Pessoa getResponsavel() { return responsavel; }
    public void setResponsavel(Pessoa responsavel) { this.responsavel = responsavel; }
    public List<Produto> getProdutos() { return produtos; }
    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }

    @Override
    public String toString() {
        return "Campanha [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao
                + ", objetivo=" + objetivo + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino
                + ", metaFinanceira=" + metaFinanceira + ", tipo=" + tipo
                + ", responsavel=" + responsavel + ", produtos=" + produtos + "]";
    }
}
