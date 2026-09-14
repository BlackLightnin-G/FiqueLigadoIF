package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private Integer id;
    private String nome;
    private String jogo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Integer quantidadeMaximaParticipantes;
    private FormatoCompeticaoEnum formato;
    private SituacaoCampeonatoEnum situacao;
    private List<InscricaoCampeonato> inscricoes = new ArrayList<>();
    private List<Partida> partidas = new ArrayList<>();

    public Campeonato(Integer id, String nome, String jogo, LocalDate dataInicio,
            LocalDate dataTermino, Integer quantidadeMaximaParticipantes,
            FormatoCompeticaoEnum formato, SituacaoCampeonatoEnum situacao) {
        this.id = id;
        this.nome = nome;
        this.jogo = jogo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.quantidadeMaximaParticipantes = quantidadeMaximaParticipantes;
        this.formato = formato;
        this.situacao = situacao;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getJogo() { return jogo; }
    public void setJogo(String jogo) { this.jogo = jogo; }
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
    public LocalDate getDataTermino() { return dataTermino; }
    public void setDataTermino(LocalDate dataTermino) { this.dataTermino = dataTermino; }
    public Integer getQuantidadeMaximaParticipantes() { return quantidadeMaximaParticipantes; }
    public void setQuantidadeMaximaParticipantes(Integer quantidade) { this.quantidadeMaximaParticipantes = quantidade; }
    public FormatoCompeticaoEnum getFormato() { return formato; }
    public void setFormato(FormatoCompeticaoEnum formato) { this.formato = formato; }
    public SituacaoCampeonatoEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoCampeonatoEnum situacao) { this.situacao = situacao; }
    public List<InscricaoCampeonato> getInscricoes() { return inscricoes; }
    public void setInscricoes(List<InscricaoCampeonato> inscricoes) { this.inscricoes = inscricoes; }
    public List<Partida> getPartidas() { return partidas; }
    public void setPartidas(List<Partida> partidas) { this.partidas = partidas; }

    @Override
    public String toString() {
        return "Campeonato [id=" + id + ", nome=" + nome + ", jogo=" + jogo
                + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino
                + ", quantidadeMaximaParticipantes=" + quantidadeMaximaParticipantes
                + ", formato=" + formato + ", situacao=" + situacao + "]";
    }
}
