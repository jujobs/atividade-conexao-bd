package cap12;  /* da linha 1 a 3 ficam os pacotes. aqui temos um novo pacote, que trabalha com o banco de dados. */
import java.sql.*;
import javax.swing.*;
public class ConsultaFilmes {  /* abertura da classe ConsultaFilmes */
    public static void main(String[] args) {  /* começa o método principal da classe */
        final String DRIVER = "com.mysql.jdbc.Driver";  /* começando o método principal da classe */
        final String URL = "jdbc:mysql://localhost:3306/banco"; /* cria uma variável para acessar o driver usado na conexão */
        try {  /* começo do método try catch */
            Class.forName(DRIVER);  /* acessa o driver que faz a conexão ao banco de dados */
            Connection connection = DriverManager.getConnection(URL, "root", "123456");  /* faz a conexão com o banco de dados com a senha, url e usuário */
            String sql = "SELECT codigo, titulo FROM Filmes Where codigo > ? AND codigo < ? ORDER BY codigo";  /* cria uma variavel de texto - é um comando na linguagem
             sql, feito para selecionar o codigo e titulo da tabela Filmes os organizando pelo código */
            PreparedStatement statement = connection.prepareStatement(sql);  /* prepara o comando sql para o executar */
            statement.setString(1, "03120");  /* define o primeiro parametro */
            statement.setString(2, "03140");  /* define o segundo parametro */
            ResultSet resultSet = statement.executeQuery();  /* Consulta os resultados */
            System.out.println("CÓDIGO   TÍTULO");  /* um titulo bonitinho que faz uma tabela */
            System.out.println("~~~~~~   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            while (resultSet.next()) {  /* funciona enquanto existir registros */
                String codigo = resultSet.getString("codigo");  /* obtém valor da coluna codigo */
                String titulo = resultSet.getString("titulo");  /* obtém valor da coluna  titulo */
                System.out.println(codigo + "   " + titulo);
            }
            resultSet.close();
            statement.close();
            connection.close();   /* as tres linhas passadas contando com essa fecham resultados, definições e conexão */
        } catch (ClassNotFoundException erro) {  /* mensagem de erro para quando o driver não é encontrado */
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n"
            + erro.toString());
        }catch (SQLException erro) {  /* mensagem de erro para quando houver problemas no sql */
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados\n"
            + erro.toString());
        }
    }
}
