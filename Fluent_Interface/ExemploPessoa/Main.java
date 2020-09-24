package Fluent_Interface.ExemploPessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa()
                .chamado("Rodrigo").comCargo("Gerente");
        System.out.println(p);
    }
}
