package domain;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidadeDisponivel;
    private CategoriaProdutoEnum categoria;
    private Campanha campanha;

    public Produto(Integer id, String nome, String descricao, Double preco,
            Integer quantidadeDisponivel, CategoriaProdutoEnum categoria, Campanha campanha) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.categoria = categoria;
        this.campanha = campanha;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public Integer getQuantidadeDisponivel() { return quantidadeDisponivel; }
    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) { this.quantidadeDisponivel = quantidadeDisponivel; }
    public CategoriaProdutoEnum getCategoria() { return categoria; }
    public void setCategoria(CategoriaProdutoEnum categoria) { this.categoria = categoria; }
    public Campanha getCampanha() { return campanha; }
    public void setCampanha(Campanha campanha) { this.campanha = campanha; }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao
                + ", preco=" + preco + ", quantidadeDisponivel=" + quantidadeDisponivel
                + ", categoria=" + categoria + "]";
    }
}
