package Abstract_Factory.ExemploCarro.Factory;

import Abstract_Factory.ExemploCarro.Class.FiestaSedan;
import Abstract_Factory.ExemploCarro.Class.Fista;
import Abstract_Factory.ExemploCarro.Interface.CarroPopular;
import Abstract_Factory.ExemploCarro.Interface.CarroSedan;
import Abstract_Factory.ExemploCarro.Interface.FabricaDeCarro;

public class FabricaFord implements FabricaDeCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Fista();
    }
}
