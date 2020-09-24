package Abstract_Factory.ExemploCarro.Class;

import Abstract_Factory.ExemploCarro.Interface.CarroSedan;

public class Siena implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena \nFabrica: Fiat \nCategoria: Sedan");
    }
}
