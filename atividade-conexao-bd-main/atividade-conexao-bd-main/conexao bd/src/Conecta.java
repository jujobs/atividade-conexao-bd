package cap12;   /* da linha 1 a 3 ficam os pacotes. aqui temos um novo pacote, que trabalha com o banco de dados. */
import java.sql.*;
import javax.swing.*;
public class Conecta {   /* abrindo a classe Conecta */
    public static void main(String[] args) {   /* começando o método principal da classe */
        final String DRIVER = "com.mysql.jdbc.Driver";    /* cria uma variável para acessar o driver usado na conexão */
        final String URL = "jdbc:mysql://localhost:3306/mysql";  /* cria uma variável para acessar o url do banco de dados */
        try {   /* começo do método try catch - faz o sistema que indica o que fazer em caso de erro */
            Class.forName(DRIVER);  /* chama o driver usado para fazer a conexão */
            Connection connection = DriverManager.getConnection(URL, "root", "");  /* estabelece a conexão ao banco de dados,
             colocando a url (inserida na variável), a senha e o usuário */
        } catch (SQLException erro) { /* primeira mensagem de erro */
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados\n"  /* mensagem que aparece quando dá erro no banco de dados */
            + erro.toString());
        } catch (ClassNotFoundException e) {  /* segunda mensagem de erro */
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n"  /* mensagem de erro que aparece quando o driver não está instalado */
                    + e.toString());
        }
    }

}
