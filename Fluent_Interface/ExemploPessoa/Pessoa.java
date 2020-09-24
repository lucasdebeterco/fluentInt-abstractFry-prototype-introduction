package Fluent_Interface.ExemploPessoa;

public class Pessoa {
    private String nome;
    private String cargo;

    public Pessoa chamado(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa comCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cargo='").append(cargo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
