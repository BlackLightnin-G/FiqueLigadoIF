package domain;

import java.time.LocalDateTime;

public class Partida {
    private Integer id;
    private Integer rodada;
    private Integer pontuacaoCompetidor1;
    private Integer pontuacaoCompetidor2;
    private LocalDateTime dataHora;
    private SituacaoPartidaEnum situacao;
    private Campeonato campeonato;
    private Aluno competidor1;
    private Aluno competidor2;
    private Equipe equipe1;
    private Equipe equipe2;

    public Partida(Integer id, Integer rodada, Integer pontuacaoCompetidor1,
            Integer pontuacaoCompetidor2, LocalDateTime dataHora, SituacaoPartidaEnum situacao,
            Campeonato campeonato, Aluno competidor1, Aluno competidor2) {
        this.id = id;
        this.rodada = rodada;
        this.pontuacaoCompetidor1 = pontuacaoCompetidor1;
        this.pontuacaoCompetidor2 = pontuacaoCompetidor2;
        this.dataHora = dataHora;
        this.situacao = situacao;
        this.campeonato = campeonato;
        this.competidor1 = competidor1;
        this.competidor2 = competidor2;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getRodada() { return rodada; }
    public void setRodada(Integer rodada) { this.rodada = rodada; }
    public Integer getPontuacaoCompetidor1() { return pontuacaoCompetidor1; }
    public void setPontuacaoCompetidor1(Integer valor) { this.pontuacaoCompetidor1 = valor; }
    public Integer getPontuacaoCompetidor2() { return pontuacaoCompetidor2; }
    public void setPontuacaoCompetidor2(Integer valor) { this.pontuacaoCompetidor2 = valor; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public SituacaoPartidaEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoPartidaEnum situacao) { this.situacao = situacao; }
    public Campeonato getCampeonato() { return campeonato; }
    public void setCampeonato(Campeonato campeonato) { this.campeonato = campeonato; }
    public Aluno getCompetidor1() { return competidor1; }
    public void setCompetidor1(Aluno competidor1) { this.competidor1 = competidor1; }
    public Aluno getCompetidor2() { return competidor2; }
    public void setCompetidor2(Aluno competidor2) { this.competidor2 = competidor2; }
    public Equipe getEquipe1() { return equipe1; }
    public void setEquipe1(Equipe equipe1) { this.equipe1 = equipe1; }
    public Equipe getEquipe2() { return equipe2; }
    public void setEquipe2(Equipe equipe2) { this.equipe2 = equipe2; }

    @Override
    public String toString() {
        return "Partida [id=" + id + ", rodada=" + rodada + ", pontuacaoCompetidor1="
                + pontuacaoCompetidor1 + ", pontuacaoCompetidor2=" + pontuacaoCompetidor2
                + ", dataHora=" + dataHora + ", situacao=" + situacao
                + ", competidor1=" + competidor1 + ", competidor2=" + competidor2 + "]";
    }
}
