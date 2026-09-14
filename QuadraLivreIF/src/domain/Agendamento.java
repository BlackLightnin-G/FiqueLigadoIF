package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    private Integer id;
    private LocalDate data;
    private LocalTime horarioInicial;
    private LocalTime horarioFinal;
    private ModalidadeEnum modalidade;
    private SituacaoAgendamentoEnum situacao;
    private Aluno responsavel;
    private Quadra quadra;
    private List<ParticipanteAgendamento> participantes = new ArrayList<>();

    public Agendamento(Integer id, LocalDate data, LocalTime horarioInicial, LocalTime horarioFinal,
            ModalidadeEnum modalidade, SituacaoAgendamentoEnum situacao,
            Aluno responsavel, Quadra quadra) {
        this.id = id;
        this.data = data;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.modalidade = modalidade;
        this.situacao = situacao;
        this.responsavel = responsavel;
        this.quadra = quadra;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    public LocalTime getHorarioInicial() { return horarioInicial; }
    public void setHorarioInicial(LocalTime horarioInicial) { this.horarioInicial = horarioInicial; }
    public LocalTime getHorarioFinal() { return horarioFinal; }
    public void setHorarioFinal(LocalTime horarioFinal) { this.horarioFinal = horarioFinal; }
    public ModalidadeEnum getModalidade() { return modalidade; }
    public void setModalidade(ModalidadeEnum modalidade) { this.modalidade = modalidade; }
    public SituacaoAgendamentoEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoAgendamentoEnum situacao) { this.situacao = situacao; }
    public Aluno getResponsavel() { return responsavel; }
    public void setResponsavel(Aluno responsavel) { this.responsavel = responsavel; }
    public Quadra getQuadra() { return quadra; }
    public void setQuadra(Quadra quadra) { this.quadra = quadra; }
    public List<ParticipanteAgendamento> getParticipantes() { return participantes; }
    public void setParticipantes(List<ParticipanteAgendamento> participantes) { this.participantes = participantes; }

    @Override
    public String toString() {
        return "Agendamento [id=" + id + ", data=" + data + ", horarioInicial=" + horarioInicial
                + ", horarioFinal=" + horarioFinal + ", modalidade=" + modalidade
                + ", situacao=" + situacao + ", responsavel=" + responsavel + ", quadra=" + quadra
                + ", participantes=" + participantes + "]";
    }
}
