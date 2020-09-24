package Prototype.AtividadeAnimal;

public class Main {
    public static void main(String[] args) {
        GatoPrototype prototipoGato = new GatoPrototype();
        AnimalPrototype gato1 = prototipoGato.clonar();
        gato1.setCor("Preto");
        AnimalPrototype gato2 = prototipoGato.clonar();
        gato2.setCor("Pardo");

        System.out.println(gato1.exibirInfo());
        System.out.println(gato2.exibirInfo());
    }
}
