package cap12;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NavegaFilmes extends JFrame{
    private JLabel label1, label2, label3, label4, label5;
    private JButton btProximo, btAnterior, btPrimeiro, btUltimo, btMais10, btMenos10, btSair;
    private JTextField tfCodigo, tfTitulo, tfGenero, tfProdutora, tfDatcom;
    private BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public static void main(String args[]) {
        JFrame frame = new NavegaFilmes();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public NavegaFilmes() {
        inicializarComponentes();
        definirEventos();
    }
    public void inicializarComponentes() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label1 = new JLabel("Código ");
        label2 = new JLabel("Título");
        label3 = new JLabel("Gênero");
        label4 = new JLabel("Produtora");
        label5 = new JLabel("Data de compra");
        tfCodigo = new JTextField(10);
        tfTitulo = new JTextField(35);
        tfGenero = new JTextField(10);
        tfProdutora = new JTextField(15);
        tfDatcom = new JTextField(8);
        btProximo = new JButton(null, new ImageIcon("icones/proximo.gif"));
        btProximo.setToolTipText("Próximo");
        btAnterior =  new JButton(null, new ImageIcon("icones/anterior"));
        btAnterior.setToolTipText("");
    }
}
