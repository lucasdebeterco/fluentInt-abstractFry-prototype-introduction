package Prototype.AtividadeAnimal;

public class CachorroPrototype extends AnimalPrototype {
    protected CachorroPrototype(CachorroPrototype cachorroPrototype) {
        this.cor = cachorroPrototype.getCor();
    }

    public CachorroPrototype() {
        cor = "Undefined";
    }

    @Override
    public String exibirInfo() {
        return "Tipo de animal: Cachorro \n"
                + "Cor: " + getCor();
    }

    @Override
    public AnimalPrototype clonar() {
        return new CachorroPrototype(this);
    }
}
