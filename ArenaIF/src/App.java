import java.time.LocalDate;
import java.time.LocalDateTime;

import domain.*;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Arthur", "2026301");
        Aluno aluno2 = new Aluno(2, "Bruna", "2026302");
        Aluno aluno3 = new Aluno(3, "Caio", "2026303");
        Aluno aluno4 = new Aluno(4, "Daniela", "2026304");

        Campeonato campeonato = new Campeonato(1, "Copa ArenaIF", "EA FC",
                LocalDate.of(2026, 9, 20), LocalDate.of(2026, 9, 21), 16,
                FormatoCompeticaoEnum.ELIMINATORIA_SIMPLES,
                SituacaoCampeonatoEnum.INSCRICOES_ABERTAS);

        campeonato.getInscricoes().add(new InscricaoCampeonato(1, LocalDate.now(), campeonato, aluno1));
        campeonato.getInscricoes().add(new InscricaoCampeonato(2, LocalDate.now(), campeonato, aluno2));
        campeonato.getInscricoes().add(new InscricaoCampeonato(3, LocalDate.now(), campeonato, aluno3));
        campeonato.getInscricoes().add(new InscricaoCampeonato(4, LocalDate.now(), campeonato, aluno4));

        Partida partida = new Partida(1, 1, 3, 1,
                LocalDateTime.of(2026, 9, 20, 14, 0), SituacaoPartidaEnum.FINALIZADA,
                campeonato, aluno1, aluno2);
        campeonato.getPartidas().add(partida);

        System.out.println(campeonato);
        System.out.println(campeonato.getInscricoes());
        System.out.println(partida);
    }
}
