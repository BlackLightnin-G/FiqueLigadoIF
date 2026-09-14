package domain;

public class Veiculo {
    private Integer id;
    private String placa;
    private String modelo;
    private String cor;
    private Integer quantidadeMaximaPassageiros;
    private Aluno proprietario;

    public Veiculo(Integer id, String placa, String modelo, String cor,
            Integer quantidadeMaximaPassageiros, Aluno proprietario) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
        this.proprietario = proprietario;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public Integer getQuantidadeMaximaPassageiros() { return quantidadeMaximaPassageiros; }
    public void setQuantidadeMaximaPassageiros(Integer valor) { this.quantidadeMaximaPassageiros = valor; }
    public Aluno getProprietario() { return proprietario; }
    public void setProprietario(Aluno proprietario) { this.proprietario = proprietario; }

    @Override
    public String toString() {
        return "Veiculo [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", cor=" + cor
                + ", quantidadeMaximaPassageiros=" + quantidadeMaximaPassageiros
                + ", proprietario=" + proprietario + "]";
    }
}
