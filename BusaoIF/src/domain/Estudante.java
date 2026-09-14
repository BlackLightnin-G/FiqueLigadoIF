package domain;

public class Estudante {
    private Integer id;
    private String nome;
    private String cpf;
    private String matricula;
    private String curso;
    private TurnoEnum turno;
    private Endereco endereco;

    public Estudante(Integer id, String nome, String cpf, String matricula,
            String curso, TurnoEnum turno, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.curso = curso;
        this.turno = turno;
        this.endereco = endereco;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public TurnoEnum getTurno() { return turno; }
    public void setTurno(TurnoEnum turno) { this.turno = turno; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    @Override
    public String toString() {
        return "Estudante [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula
                + ", curso=" + curso + ", turno=" + turno + ", endereco=" + endereco + "]";
    }
}
