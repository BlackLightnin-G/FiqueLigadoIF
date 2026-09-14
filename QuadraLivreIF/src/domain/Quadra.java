package domain;

import java.util.ArrayList;
import java.util.List;

public class Quadra {
    private Integer id;
    private String nome;
    private String localizacao;
    private String tipoPiso;
    private List<ModalidadeEnum> modalidadesPermitidas = new ArrayList<>();

    public Quadra(Integer id, String nome, String localizacao, String tipoPiso) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.tipoPiso = tipoPiso;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public String getTipoPiso() { return tipoPiso; }
    public void setTipoPiso(String tipoPiso) { this.tipoPiso = tipoPiso; }
    public List<ModalidadeEnum> getModalidadesPermitidas() { return modalidadesPermitidas; }
    public void setModalidadesPermitidas(List<ModalidadeEnum> modalidades) { this.modalidadesPermitidas = modalidades; }

    @Override
    public String toString() {
        return "Quadra [id=" + id + ", nome=" + nome + ", localizacao=" + localizacao
                + ", tipoPiso=" + tipoPiso + ", modalidadesPermitidas=" + modalidadesPermitidas + "]";
    }
}
