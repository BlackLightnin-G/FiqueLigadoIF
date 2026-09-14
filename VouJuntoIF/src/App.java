import java.time.LocalDateTime;

import domain.*;

public class App {
    public static void main(String[] args) {
        Aluno motorista = new Aluno(1, "Lucas", "2026001");
        Aluno passageiro1 = new Aluno(2, "Mariana", "2026002");
        Aluno passageiro2 = new Aluno(3, "Pedro", "2026003");
        Aluno passageiro3 = new Aluno(4, "Ana", "2026004");

        Veiculo veiculo = new Veiculo(1, "ABC1D23", "Onix", "Branco", 5, motorista);
        Carona carona = new Carona(1, "IFTM Centro", "UFU Santa Mônica",
                LocalDateTime.of(2026, 9, 15, 18, 30), 3,
                SituacaoCaronaEnum.ABERTA, motorista, veiculo);

        carona.getSolicitacoes().add(new Solicitacao(1, LocalDateTime.now(),
                SituacaoSolicitacaoEnum.ACEITA, passageiro1));
        carona.getSolicitacoes().add(new Solicitacao(2, LocalDateTime.now(),
                SituacaoSolicitacaoEnum.PENDENTE, passageiro2));
        carona.getSolicitacoes().add(new Solicitacao(3, LocalDateTime.now(),
                SituacaoSolicitacaoEnum.RECUSADA, passageiro3));

        System.out.println(carona);
    }
}
