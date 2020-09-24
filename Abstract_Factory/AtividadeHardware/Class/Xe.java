package Abstract_Factory.AtividadeHardware.Class;

import Abstract_Factory.AtividadeHardware.Interface.IPlacaDeVideo;

public class Xe implements IPlacaDeVideo {
    @Override
    public void exibirInfoPlacaDeVideo() {
        System.out.println("Modelo: Intel Xe Graphics \nFabrica: Intel \nTipo de peça: Placa de Vídeo");
    }
}
