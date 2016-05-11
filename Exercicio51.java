import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JButton;

public class Exercicio51 {

	static JPanel menu;
	static JPanel painel;
	static JPanel painel2;
	static JPanel painel3;
	static JButton botao;
	static JButton botao2;
	static JFrame janela;
	static JFrame janela2;
	static JFrame janela3;
	static JFrame janela4;
	static JLabel capa;
	static JTextField Campo;
	static JMenuBar menu2;
	static JMenu iniciar, ajuda, sobre;
	static JButton botaodemenu1;
	static JMenuItem cadastro_cliente, sair;

	static void CriarComponentes() {
		janela = new JFrame("Cadastro de Usuário.");
		capa = new JLabel("Seja bem vindo ao cadastro de clientes, para cadastrar seus clientes clique em Iniciar!");
		capa.setHorizontalAlignment(SwingConstants.CENTER);
		capa.setBounds(120, 150, 600, 50);
		capa.setVisible(true);

		painel = new JPanel();
		painel.setSize(800, 600);
		painel.setLayout(null);
		painel.setBackground(Color.LIGHT_GRAY);
		painel.setVisible(true);
		painel.add(capa);
		janela.add(painel);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(800, 600);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
		painel.add(capa);

		botao = new JButton("Iniciar");
		botao.setSize(100, 50);
		botao.setLocation(300, 400);
		botao.setVisible(true);
		painel.add(botao);

		botao2 = new JButton("Sair");
		botao2.setSize(100, 50);
		botao2.setLocation(401, 400);
		botao2.setVisible(true);
		painel.add(botao2);
		botoes();
	}

	static void BotaoBarra() {
		botaodemenu1 = new JButton("Cadastro de Clientes");
		botaodemenu1.setSize(1500, 20);
		botaodemenu1.setLocation(1, 100);
		botaodemenu1.setBackground(Color.black);
		botaodemenu1.setVisible(true);
		menu2.add(botaodemenu1);
		BotaoBarra();// mudar chamada

	}

	public static void main(String[] args) {
		CriarComponentes();

	}

	static void botoes() {
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela.setVisible(false);
				CriarMenu();

			}
		});

	}

	static void CriarMenu() {

		janela2 = new JFrame();
		janela2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		janela2.setSize(1200, 650);
		janela2.setResizable(false);
		janela2.setVisible(true);
		janela2.setLocationRelativeTo(null);

		painel2 = new JPanel();
		painel2.setSize(800, 600);
		painel2.setLayout(null);
		painel2.setBackground(Color.gray);
		painel2.setVisible(true);
		janela2.add(painel2);

		menu2 = new JMenuBar();
		menu2.setSize(1500, 20);
		menu2.setLocation(1, 1);
		menu2.setBackground(Color.LIGHT_GRAY);
		menu2.setVisible(true);
		painel2.add(menu2);

		iniciar = new JMenu("Iniciar");
		ajuda = new JMenu("Ajuda");
		sobre = new JMenu("Sobre");
		menu2.add(iniciar);
		menu2.add(ajuda);
		menu2.add(sobre);

		cadastro_cliente = new JMenuItem("Cadastro de Cliente");
		sair = new JMenuItem("Sair");

		iniciar.add(cadastro_cliente);
		iniciar.addSeparator();
		iniciar.add(sair);

		cadastro_cliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tela_Cadastro();

			}
		});

		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		sobre.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				sobre.setToolTipText("Informações sobre o desenvolvimento.");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Versão do Sistema 1.1 \nDesenvolvido por Prado Devolepment");
				sobre.setVisible(true);

			}
		});

		janela2.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

				sobre.setVisible(true);
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				CriarComponentes();
				janela2.dispose();
				janela.setVisible(true);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

		});

	}

	static void Tela_Cadastro() {

		janela3 = new JFrame("Cadastro de Cliente");
		janela3.setSize(400, 200);
		janela3.setLocationRelativeTo(null);
		janela3.setVisible(true);

	}

}
