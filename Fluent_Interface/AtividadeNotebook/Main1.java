package Fluent_Interface.AtividadeNotebook;

public class Main1 {
    public static void main(String[] args) {
        Notebook notebook = new Notebook()
                .daMarca("Lenovo")
                .comProcessador("Core i7");
        System.out.println(notebook);
    }
}
