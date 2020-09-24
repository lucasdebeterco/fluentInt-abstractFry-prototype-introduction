package Fluent_Interface.AtividadeNotebook;

public class Notebook {
    private String marca;
    private String processador;
    private int memoriaPrincipal;
    private int armazenamento;

    public Notebook daMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public Notebook comProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public Notebook qntMemoria(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
        return this;
    }

    public Notebook qntArmazemento(int armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notebook{");
        sb.append("modelo='").append(processador).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", memoriaPrincipal=").append(memoriaPrincipal);
        sb.append(", armazenamento=").append(armazenamento);
        sb.append('}');
        return sb.toString();
    }
}
