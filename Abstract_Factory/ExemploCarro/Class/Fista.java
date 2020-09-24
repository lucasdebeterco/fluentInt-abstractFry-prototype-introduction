package Abstract_Factory.ExemploCarro.Class;

import Abstract_Factory.ExemploCarro.Interface.CarroPopular;

public class Fista implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta \nFabrica: Ford \nCategoria: Popular");
    }
}
