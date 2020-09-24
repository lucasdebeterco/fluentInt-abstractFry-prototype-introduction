package Prototype.ExemploCarro;

public class FiestaPrototype extends CarroPrototype {

    protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
        this.valorCompra = fiestaPrototype.getValorCompra();
    }

    public FiestaPrototype() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Fiesta \n Montadora: Ford \n"
                + "Valor: R$" + getValorCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }
}
