package Prototype.ExemploCarro;

public class Main {
    public static void main(String[] args) {
        GolPrototype prototipoGol = new GolPrototype();
        CarroPrototype golNovo =prototipoGol.clonar();
        golNovo.setValorCompra(30000.0);
        CarroPrototype golUsado = prototipoGol.clonar();
        golUsado.setValorCompra(25000);

        System.out.println(golNovo.exibirInfo());
        System.out.println(golUsado.exibirInfo());
    }
}
