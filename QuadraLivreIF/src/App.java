import java.time.LocalDate;
import java.time.LocalTime;

import domain.*;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Gabriel", "2026101");
        Aluno aluno2 = new Aluno(2, "Beatriz", "2026102");
        Aluno aluno3 = new Aluno(3, "Rafael", "2026103");

        Quadra quadra1 = new Quadra(1, "Quadra Coberta", "Bloco A", "Cimento");
        quadra1.getModalidadesPermitidas().add(ModalidadeEnum.FUTSAL);
        quadra1.getModalidadesPermitidas().add(ModalidadeEnum.HANDEBOL);

        Quadra quadra2 = new Quadra(2, "Quadra de Areia", "Área externa", "Areia");
        quadra2.getModalidadesPermitidas().add(ModalidadeEnum.VOLEI);
        quadra2.getModalidadesPermitidas().add(ModalidadeEnum.PETECA);

        Agendamento agendamento1 = new Agendamento(1, LocalDate.of(2026, 9, 16),
                LocalTime.of(14, 0), LocalTime.of(15, 30), ModalidadeEnum.FUTSAL,
                SituacaoAgendamentoEnum.CONFIRMADO, aluno1, quadra1);
        agendamento1.getParticipantes().add(new ParticipanteAgendamento(1, aluno1));
        agendamento1.getParticipantes().add(new ParticipanteAgendamento(2, aluno2));

        Agendamento agendamento2 = new Agendamento(2, LocalDate.of(2026, 9, 17),
                LocalTime.of(16, 0), LocalTime.of(17, 0), ModalidadeEnum.VOLEI,
                SituacaoAgendamentoEnum.SOLICITADO, aluno2, quadra2);
        agendamento2.getParticipantes().add(new ParticipanteAgendamento(3, aluno2));
        agendamento2.getParticipantes().add(new ParticipanteAgendamento(4, aluno3));

        System.out.println(quadra1);
        System.out.println(quadra2);
        System.out.println(agendamento1);
        System.out.println(agendamento2);
    }
}
