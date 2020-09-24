package Abstract_Factory.AtividadeHardware.Class;

import Abstract_Factory.AtividadeHardware.Interface.IProcessador;

public class Ryzen implements IProcessador {
    @Override
    public void exibirInfoProcessador() {
        System.out.println("Modelo: Ryzen \nFabrica: AMD \nTipo de peça: Processador");
    }
}
