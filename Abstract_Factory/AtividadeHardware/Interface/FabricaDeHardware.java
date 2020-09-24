package Abstract_Factory.AtividadeHardware.Interface;

public interface FabricaDeHardware {
    IPlacaDeVideo criarPlacaDeVideo();
    IProcessador criarProcessador();
}
