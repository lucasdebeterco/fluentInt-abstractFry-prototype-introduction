package Abstract_Factory.ExemploCarro;

import Abstract_Factory.ExemploCarro.Factory.FabricaFiat;
import Abstract_Factory.ExemploCarro.Interface.CarroPopular;
import Abstract_Factory.ExemploCarro.Interface.CarroSedan;
import Abstract_Factory.ExemploCarro.Interface.FabricaDeCarro;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroPopular popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();

        fabrica = new FabricaFiat();
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
    }
}
