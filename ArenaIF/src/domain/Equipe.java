package domain;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private Integer id;
    private String nome;
    private Aluno capitao;
    private List<Aluno> jogadores = new ArrayList<>();

    public Equipe(Integer id, String nome, Aluno capitao) {
        this.id = id;
        this.nome = nome;
        this.capitao = capitao;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Aluno getCapitao() { return capitao; }
    public void setCapitao(Aluno capitao) { this.capitao = capitao; }
    public List<Aluno> getJogadores() { return jogadores; }
    public void setJogadores(List<Aluno> jogadores) { this.jogadores = jogadores; }

    @Override
    public String toString() {
        return "Equipe [id=" + id + ", nome=" + nome + ", capitao=" + capitao
                + ", jogadores=" + jogadores + "]";
    }
}
