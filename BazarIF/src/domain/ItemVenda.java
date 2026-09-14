package domain;

public class ItemVenda {
    private Integer id;
    private Integer quantidade;
    private Double precoUnitario;
    private Produto produto;

    public ItemVenda(Integer id, Integer quantidade, Double precoUnitario, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.produto = produto;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
    public Double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(Double precoUnitario) { this.precoUnitario = precoUnitario; }
    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    @Override
    public String toString() {
        return "ItemVenda [id=" + id + ", quantidade=" + quantidade
                + ", precoUnitario=" + precoUnitario + ", produto=" + produto + "]";
    }
}
