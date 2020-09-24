package Fluent_Interface.ExemploConexao;

public class Main {
    public static void main(String[] args) {
        Conexao con = new Conexao()
                .conectarEm("127.0.0.1")
                .naPorta(8080)
                .usandoOUsuario("Rodrigo")
                .comASenha("teste");
        System.out.println(con);
    }
}
