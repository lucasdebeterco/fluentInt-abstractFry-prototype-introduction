package Abstract_Factory.AtividadeHardware.Factory;

import Abstract_Factory.AtividadeHardware.Class.Core;
import Abstract_Factory.AtividadeHardware.Class.Xe;
import Abstract_Factory.AtividadeHardware.Interface.FabricaDeHardware;
import Abstract_Factory.AtividadeHardware.Interface.IPlacaDeVideo;
import Abstract_Factory.AtividadeHardware.Interface.IProcessador;

public class FabricaIntel implements FabricaDeHardware {
    @Override
    public IPlacaDeVideo criarPlacaDeVideo() {
        return new Xe();
    }

    @Override
    public IProcessador criarProcessador() {
        return new Core();
    }
}
