package Fluent_Interface.ExemploPessoa;

public class Main2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa()
                .comCargo("Gerente");
        System.out.println(p);
    }
}
