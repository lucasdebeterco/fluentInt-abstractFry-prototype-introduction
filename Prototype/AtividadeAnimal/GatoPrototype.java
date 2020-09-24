package Prototype.AtividadeAnimal;

public class GatoPrototype extends AnimalPrototype {
    protected GatoPrototype(GatoPrototype gatoPrototype) {
        this.cor = gatoPrototype.getCor();
    }

    public GatoPrototype() {
        cor = "Undefined";
    }

    @Override
    public String exibirInfo() {
        return "Tipo de animal: Gato \n"
                + "Cor: " + getCor();
    }

    @Override
    public AnimalPrototype clonar() {
        return new GatoPrototype(this);
    }
}
