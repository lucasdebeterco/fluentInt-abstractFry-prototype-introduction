package Abstract_Factory.AtividadeHardware.Factory;

import Abstract_Factory.AtividadeHardware.Class.Radeon;
import Abstract_Factory.AtividadeHardware.Class.Ryzen;
import Abstract_Factory.AtividadeHardware.Interface.FabricaDeHardware;
import Abstract_Factory.AtividadeHardware.Interface.IPlacaDeVideo;
import Abstract_Factory.AtividadeHardware.Interface.IProcessador;

public class FabricaAmd implements FabricaDeHardware {
    @Override
    public IPlacaDeVideo criarPlacaDeVideo() {
        return new Radeon();
    }

    @Override
    public IProcessador criarProcessador() {
        return new Ryzen();
    }
}
