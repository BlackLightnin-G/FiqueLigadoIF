package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Carona {
    private Integer id;
    private String localSaida;
    private String destino;
    private LocalDateTime dataHora;
    private Integer quantidadeVagas;
    private SituacaoCaronaEnum situacao;
    private Aluno motorista;
    private Veiculo veiculo;
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    public Carona(Integer id, String localSaida, String destino, LocalDateTime dataHora,
            Integer quantidadeVagas, SituacaoCaronaEnum situacao, Aluno motorista, Veiculo veiculo) {
        this.id = id;
        this.localSaida = localSaida;
        this.destino = destino;
        this.dataHora = dataHora;
        this.quantidadeVagas = quantidadeVagas;
        this.situacao = situacao;
        this.motorista = motorista;
        this.veiculo = veiculo;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getLocalSaida() { return localSaida; }
    public void setLocalSaida(String localSaida) { this.localSaida = localSaida; }
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public Integer getQuantidadeVagas() { return quantidadeVagas; }
    public void setQuantidadeVagas(Integer quantidadeVagas) { this.quantidadeVagas = quantidadeVagas; }
    public SituacaoCaronaEnum getSituacao() { return situacao; }
    public void setSituacao(SituacaoCaronaEnum situacao) { this.situacao = situacao; }
    public Aluno getMotorista() { return motorista; }
    public void setMotorista(Aluno motorista) { this.motorista = motorista; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
    public List<Solicitacao> getSolicitacoes() { return solicitacoes; }
    public void setSolicitacoes(List<Solicitacao> solicitacoes) { this.solicitacoes = solicitacoes; }

    @Override
    public String toString() {
        return "Carona [id=" + id + ", localSaida=" + localSaida + ", destino=" + destino
                + ", dataHora=" + dataHora + ", quantidadeVagas=" + quantidadeVagas
                + ", situacao=" + situacao + ", motorista=" + motorista + ", veiculo=" + veiculo
                + ", solicitacoes=" + solicitacoes + "]";
    }
}
