package Prototype.AtividadeAnimal;

public abstract class AnimalPrototype {
    protected String cor;
    public abstract String exibirInfo();
    public abstract AnimalPrototype clonar();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
