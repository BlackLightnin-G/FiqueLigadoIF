package domain;

import java.time.LocalDate;

public class InscricaoCampeonato {
    private Integer id;
    private LocalDate dataInscricao;
    private Campeonato campeonato;
    private Aluno aluno;
    private Equipe equipe;

    public InscricaoCampeonato(Integer id, LocalDate dataInscricao, Campeonato campeonato, Aluno aluno) {
        this.id = id;
        this.dataInscricao = dataInscricao;
        this.campeonato = campeonato;
        this.aluno = aluno;
    }

    public InscricaoCampeonato(Integer id, LocalDate dataInscricao, Campeonato campeonato, Equipe equipe) {
        this.id = id;
        this.dataInscricao = dataInscricao;
        this.campeonato = campeonato;
        this.equipe = equipe;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public LocalDate getDataInscricao() { return dataInscricao; }
    public void setDataInscricao(LocalDate dataInscricao) { this.dataInscricao = dataInscricao; }
    public Campeonato getCampeonato() { return campeonato; }
    public void setCampeonato(Campeonato campeonato) { this.campeonato = campeonato; }
    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
    public Equipe getEquipe() { return equipe; }
    public void setEquipe(Equipe equipe) { this.equipe = equipe; }

    @Override
    public String toString() {
        return "InscricaoCampeonato [id=" + id + ", dataInscricao=" + dataInscricao
                + ", aluno=" + aluno + ", equipe=" + equipe + "]";
    }
}
