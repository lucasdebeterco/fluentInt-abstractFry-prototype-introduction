package Fluent_Interface.ExemploConexao;

public class Conexao {
    private String host;
    private int porta;
    private String user;
    private String pass;

    public Conexao conectarEm(String host) {
        this.host = host;
        return this;
    }

    public Conexao naPorta(int porta) {
        this.porta = porta;
        return this;
    }

    public Conexao usandoOUsuario(String user) {
        this.user = user;
        return this;
    }

    public Conexao comASenha(String pass) {
        this.pass = pass;
        return this;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conexao{");
        sb.append("host='").append(host).append('\'');
        sb.append(", porta=").append(porta);
        sb.append(", user='").append(user).append('\'');
        sb.append(", pass='").append(pass).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
