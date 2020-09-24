package Abstract_Factory.AtividadeHardware.Class;

import Abstract_Factory.AtividadeHardware.Interface.IPlacaDeVideo;

public class Radeon implements IPlacaDeVideo {
    @Override
    public void exibirInfoPlacaDeVideo() {
        System.out.println("Modelo: Radeon \nFabrica: AMD \nTipo de peça: Placa de Vídeo");
    }
}
