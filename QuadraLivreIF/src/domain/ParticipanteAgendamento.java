package domain;

public class ParticipanteAgendamento {
    private Integer id;
    private Aluno aluno;

    public ParticipanteAgendamento(Integer id, Aluno aluno) {
        this.id = id;
        this.aluno = aluno;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    @Override
    public String toString() {
        return "ParticipanteAgendamento [id=" + id + ", aluno=" + aluno + "]";
    }
}
