package Abstract_Factory.ExemploCarro.Class;

import Abstract_Factory.ExemploCarro.Interface.CarroPopular;

public class Palio implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio \nFabrica: Fiesta \nCategoria: Popular");
    }
}
