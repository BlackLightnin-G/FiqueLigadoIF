import java.time.LocalDate;

import domain.*;

public class App {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(1, "Rua das Flores", 120, "Centro", "Uberlândia", "38400000");
        Estudante estudante = new Estudante(1, "João", "123.456.789-00", "2026201",
                "Desenvolvimento de Sistemas", TurnoEnum.MATUTINO, endereco);
        LinhaOnibus linha = new LinhaOnibus(1, "A105", "Terminal Central - Morumbi",
                "São Miguel", "Terminal Central", "Bairro Morumbi");

        SolicitacaoPasse solicitacao = new SolicitacaoPasse(1, LocalDate.of(2026, 9, 14),
                SituacaoSolicitacaoEnum.APROVADA, estudante, linha);
        solicitacao.getDocumentos().add(new Documento(1, "Comprovante de matrícula",
                LocalDate.of(2026, 9, 14), SituacaoDocumentoEnum.APROVADO));
        solicitacao.getDocumentos().add(new Documento(2, "Comprovante de endereço",
                LocalDate.of(2026, 9, 14), SituacaoDocumentoEnum.APROVADO));

        PasseEscolar passe = new PasseEscolar(1, "PASSE-2026-001", LocalDate.of(2026, 9, 15),
                LocalDate.of(2027, 9, 15), SituacaoPasseEnum.ATIVO, solicitacao);

        System.out.println(estudante);
        System.out.println(linha);
        System.out.println(solicitacao);
        System.out.println(passe);
    }
}
