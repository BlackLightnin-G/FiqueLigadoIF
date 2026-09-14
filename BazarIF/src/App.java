import java.time.LocalDate;
import java.time.LocalDateTime;

import domain.*;

public class App {
    public static void main(String[] args) {
        Pessoa responsavel = new Pessoa(1, "Fernanda", "fernanda@iftm.edu.br");
        Pessoa comprador1 = new Pessoa(2, "Mateus", "mateus@iftm.edu.br");
        Pessoa comprador2 = new Pessoa(3, "Sofia", "sofia@iftm.edu.br");

        Campanha campanha = new Campanha(1, "Camisetas da Formatura",
                "Venda de camisetas personalizadas", "Arrecadar dinheiro para a formatura",
                LocalDate.of(2026, 9, 14), LocalDate.of(2026, 10, 14), 3000.0,
                TipoCampanhaEnum.CAMISETAS, responsavel);

        Produto camiseta = new Produto(1, "Camiseta preta", "Camiseta tamanho M",
                45.0, 30, CategoriaProdutoEnum.CAMISETA, campanha);
        Produto brigadeiro = new Produto(2, "Brigadeiro", "Brigadeiro tradicional",
                4.0, 100, CategoriaProdutoEnum.DOCE, campanha);
        campanha.getProdutos().add(camiseta);
        campanha.getProdutos().add(brigadeiro);

        Venda venda1 = new Venda(1, LocalDateTime.now(), FormaPagamentoEnum.PIX,
                SituacaoVendaEnum.PAGA, responsavel, comprador1);
        venda1.getItens().add(new ItemVenda(1, 1, 45.0, camiseta));

        Venda venda2 = new Venda(2, LocalDateTime.now(), FormaPagamentoEnum.DINHEIRO,
                SituacaoVendaEnum.ENTREGUE, responsavel, comprador2);
        venda2.getItens().add(new ItemVenda(2, 3, 4.0, brigadeiro));

        System.out.println(campanha);
        System.out.println(venda1);
        System.out.println(venda2);
    }
}
