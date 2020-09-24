package Abstract_Factory.AtividadeHardware;

import Abstract_Factory.AtividadeHardware.Factory.FabricaAmd;
import Abstract_Factory.AtividadeHardware.Factory.FabricaIntel;
import Abstract_Factory.AtividadeHardware.Interface.FabricaDeHardware;
import Abstract_Factory.AtividadeHardware.Interface.IPlacaDeVideo;
import Abstract_Factory.AtividadeHardware.Interface.IProcessador;

public class Main {
    public static void main(String[] args) {
        FabricaDeHardware fabrica = new FabricaAmd();
        IProcessador processador = fabrica.criarProcessador();
        IPlacaDeVideo placaDeVideo = fabrica.criarPlacaDeVideo();
        processador.exibirInfoProcessador();
        System.out.println();
        placaDeVideo.exibirInfoPlacaDeVideo();
        System.out.println();

        fabrica = new FabricaIntel();
        processador = fabrica.criarProcessador();
        placaDeVideo = fabrica.criarPlacaDeVideo();
        processador.exibirInfoProcessador();
        System.out.println();
        placaDeVideo.exibirInfoPlacaDeVideo();
        System.out.println();
    }
}
