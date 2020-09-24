package Abstract_Factory.AtividadeHardware.Class;

import Abstract_Factory.AtividadeHardware.Interface.IProcessador;

public class Core implements IProcessador {
    @Override
    public void exibirInfoProcessador() {
        System.out.println("Modelo: Intel Core \nFabrica: Intel \nTipo de peça: Processador");
    }
}
