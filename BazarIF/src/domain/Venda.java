package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Integer id;
    private LocalDateTime dataHora;
    private FormaPagamentoEnum formaPagamento;
    private SituacaoVendaEnum situacao;
    private Pessoa vendedor;
    private Pessoa comprador;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Integer id, LocalDateTime dataHora, FormaPagamentoEnum formaPagamento,
            SituacaoVendaEnum situacao, Pessoa vendedor, Pessoa comprador) {
        this.id = id;
        this.dataHora = dataHora;
        this.formaPagamento = formaPagamento;
        this.situacao = situacao;
        this.vendedor = vendedor;
        this.comprador = comprador;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public FormaPagamentoEnum getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(FormaPagamentoEnum formaPagamento) { this.formaPagamento = formaPagamento; }
    public SituacaoVendaEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoVendaEnum situacao) { this.situacao = situacao; }
    public Pessoa getVendedor() { return vendedor; }
    public void setVendedor(Pessoa vendedor) { this.vendedor = vendedor; }
    public Pessoa getComprador() { return comprador; }
    public void setComprador(Pessoa comprador) { this.comprador = comprador; }
    public List<ItemVenda> getItens() { return itens; }
    public void setItens(List<ItemVenda> itens) { this.itens = itens; }

    @Override
    public String toString() {
        return "Venda [id=" + id + ", dataHora=" + dataHora + ", formaPagamento=" + formaPagamento
                + ", situacao=" + situacao + ", vendedor=" + vendedor + ", comprador=" + comprador
                + ", itens=" + itens + "]";
    }
}
