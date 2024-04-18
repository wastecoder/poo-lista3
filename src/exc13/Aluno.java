package exc13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {
    private long id;
    private LocalDate nascimento;
    private String ra;
    private String nome;

    public Aluno() {
    }

    public Aluno(long id, LocalDate nascimento, String ra, String nome) {
        this.id = id;
        this.nascimento = nascimento;
        this.ra = ra;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nascimento=" + nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
