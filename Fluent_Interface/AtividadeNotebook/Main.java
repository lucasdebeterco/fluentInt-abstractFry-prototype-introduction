package Fluent_Interface.AtividadeNotebook;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook()
                .daMarca("Lenovo")
                .comProcessador("Core i7")
                .qntMemoria(16)
                .qntArmazemento(1000);
        System.out.println(notebook);
    }
}
