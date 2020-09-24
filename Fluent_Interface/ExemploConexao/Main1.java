package Fluent_Interface.ExemploConexao;

public class Main1 {
    public static void main(String[] args) {
        Conexao con = new Conexao()
                .conectarEm("127.0.0.1")
                .naPorta(8080);
        System.out.println(con);
    }
}
