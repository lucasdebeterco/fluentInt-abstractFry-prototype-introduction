package Abstract_Factory.ExemploCarro.Factory;

import Abstract_Factory.ExemploCarro.Class.Palio;
import Abstract_Factory.ExemploCarro.Class.Siena;
import Abstract_Factory.ExemploCarro.Interface.CarroPopular;
import Abstract_Factory.ExemploCarro.Interface.CarroSedan;
import Abstract_Factory.ExemploCarro.Interface.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
}
