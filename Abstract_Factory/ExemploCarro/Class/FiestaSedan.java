package Abstract_Factory.ExemploCarro.Class;

import Abstract_Factory.ExemploCarro.Interface.CarroSedan;

public class FiestaSedan implements CarroSedan {

    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Fiesta \nFabrica: Ford \nCategoria: Sedan");
    }
}
