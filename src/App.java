import java.time.LocalDate;
import java.time.LocalDateTime;

import domain.*;

public class App {
    public static void main(String[] args) {
        Area area = new Area(1, "Computação");

        Local local = new Local(
                1,
                "Auditório IFTM Udi Centro",
                "Rua Blanche Galassi",
                1150,
                "Morada da Colina",
                "Uberlândia",
                "38400000",
                120,
                "Dentro do campus");

        Pessoa pessoa = new Pessoa(
                1,
                "Carlos Eduardo",
                "/home/cadu.jpg",
                "Professor",
                "carloseduardodantas@iftm.edu.br");

        Usuario usuario = new Usuario(1, "senha", TipoUsuarioEnum.SERVIDOR, pessoa);

        Evento evento = new Evento(
                1,
                "Palestra de IA",
                LocalDate.parse("2026-07-28"),
                LocalDate.parse("2026-07-28"),
                "/home/banner.jpg",
                StatusEnum.PENDENTE,
                0.0,
                usuario,
                usuario);

        Atividade atividade = new Atividade(
                1,
                "Engenharia de Prompt",
                LocalDateTime.of(2026, 7, 28, 19, 0),
                LocalDateTime.of(2026, 7, 28, 22, 0),
                3.0,
                120,
                evento,
                local);

        AreaDaAtividade areaDaAtividade = new AreaDaAtividade(1, area, atividade);
        AtividadeMinistrante ministrante = new AtividadeMinistrante(1, atividade, pessoa);
        Inscricao inscricao = new Inscricao(
                1,
                LocalDateTime.of(2026, 7, 24, 11, 25, 22),
                atividade,
                usuario);

        System.out.println(area);
        System.out.println(local);
        System.out.println(pessoa);
        System.out.println(usuario);
        System.out.println(evento);
        System.out.println(atividade);
        System.out.println(areaDaAtividade);
        System.out.println(ministrante);
        System.out.println(inscricao);
    }
}
