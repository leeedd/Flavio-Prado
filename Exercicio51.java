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
	static JLabel capa, capa2, capa3, capa4, capa5, capa6;
	static JTextField campo1, campo2, campo3, campo4, campo5;
	static JMenuBar menu2;
	static JMenu iniciar, ajuda, sobre;
	static JButton botaodemenu1;
	static JMenuItem cadastro_cliente, sair;
	static JButton novo;
	static JButton editar;
	static JButton salvar;
	static JButton consultar;

	static int i = 0;
	static int j = 0;
	static int cod = 1;
	static String[][] cadastro = new String[100][5];

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

	static void botaoBarra() {
		botaodemenu1 = new JButton("Cadastro de Clientes");
		botaodemenu1.setSize(1500, 20);
		botaodemenu1.setLocation(1, 100);
		botaodemenu1.setBackground(Color.black);
		botaodemenu1.setVisible(true);
		menu2.add(botaodemenu1);
		botaoBarra();// mudar chamada

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
				criarMenu();

			}
		});

	}

	static void criarMenu() {

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

				telaCadastro();

			}
		});

		sair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		sobre.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
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

			}

			@Override
			public void windowIconified(WindowEvent e) {

			}

			@Override
			public void windowDeiconified(WindowEvent e) {

			}

			@Override
			public void windowDeactivated(WindowEvent e) {

				sobre.setVisible(true);
			}

			@Override
			public void windowClosing(WindowEvent e) {

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

			}

		});

	}

	static void telaCadastro() {

		janela3 = new JFrame("Cadastro de Cliente");
		janela3.setLayout(null);
		janela3.setSize(800, 600);
		janela3.setLocationRelativeTo(null);
		janela3.setVisible(true);

		painel3 = new JPanel();
		painel3.setSize(800, 400);
		painel3.setLocation(0, 50);
		painel3.setLayout(null);
		painel3.setBackground(Color.LIGHT_GRAY);
		janela3.setResizable(false);
		painel3.setVisible(true);
		janela3.add(painel3);

		capa2 = new JLabel("Cliente:");
		capa2.setHorizontalAlignment(SwingConstants.CENTER);
		capa2.setBounds(-250, 50, 600, 50);
		capa2.setVisible(true);
		painel3.add(capa2);

		campo1 = new JTextField();
		campo1.setSize(490, 30);
		campo1.setLocation(90, 60);
		campo1.setVisible(true);
		painel3.add(campo1);

		capa5 = new JLabel("Código:");
		capa5.setHorizontalAlignment(SwingConstants.CENTER);
		capa5.setBounds(340, 15, 600, 50);
		capa5.setVisible(true);
		painel3.add(capa5);

		campo4 = new JTextField();
		campo4.setSize(30, 30);
		campo4.setLocation(670, 25);
		campo4.setText("" + cod);
		campo4.setVisible(true);
		painel3.add(campo4);

		capa3 = new JLabel("Endereço:");
		capa3.setHorizontalAlignment(SwingConstants.CENTER);
		capa3.setBounds(-243, 90, 600, 50);
		capa3.setVisible(true);
		painel3.add(capa3);

		campo2 = new JTextField();
		campo2.setSize(490, 30);
		campo2.setLocation(90, 100);
		campo2.setVisible(true);
		painel3.add(campo2);

		capa4 = new JLabel("E-mail:");
		capa4.setHorizontalAlignment(SwingConstants.CENTER);
		capa4.setBounds(-251, 130, 600, 50);
		capa4.setVisible(true);
		painel3.add(capa4);

		campo3 = new JTextField();
		campo3.setSize(490, 30);
		campo3.setLocation(90, 140);
		campo3.setVisible(true);
		painel3.add(campo3);

		capa6 = new JLabel("Telefone:");
		capa6.setHorizontalAlignment(SwingConstants.CENTER);
		capa6.setBounds(-245, 170, 600, 50);
		capa6.setVisible(true);
		painel3.add(capa6);

		campo5 = new JTextField();
		campo5.setSize(100, 30);
		campo5.setLocation(90, 180);
		campo5.setVisible(true);
		painel3.add(campo5);

		novo = new JButton("Novo");
		novo.setSize(80, 30);
		novo.setLocation(50, 345);
		novo.setVisible(true);
		painel3.add(novo);

		editar = new JButton("Editar");
		editar.setSize(80, 30);
		editar.setLocation(180, 345);
		editar.setVisible(true);
		editar.setEnabled(false);
		painel3.add(editar);

		salvar = new JButton("Salvar");
		salvar.setSize(80, 30);
		salvar.setLocation(430, 345);
		salvar.setVisible(true);
		painel3.add(salvar);

		consultar = new JButton("Consultar");
		consultar.setSize(120, 30);
		consultar.setLocation(280, 345);
		consultar.setVisible(true);
		painel3.add(consultar);

		novo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cod < 100) {
					salvarRegistro();
					campo4.setText("");
					campo4.setText("" + cod);
					
					cod++;

					salvar.setEnabled(true);
					editar.setEnabled(false);
					janela3.dispose();
					telaCadastro();
					
				} else {
					
					
					campo1.setEnabled(false);
					campo2.setEnabled(false);
					campo3.setEnabled(false);
					campo4.setEnabled(false);
					campo5.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Limite de clientes atingido!");

				}

				
				
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");
				campo5.setText("");

			}

		});

		salvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				salvar.setEnabled(false);
				editar.setEnabled(true);
				salvar.setEnabled(true);
				
				
				campo1.setEnabled(false);
				campo2.setEnabled(false);
				campo3.setEnabled(false);
				campo4.setEnabled(false);
				campo5.setEnabled(false);
				
				
				JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");

			}
		});
		
		editar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				campo1.setEnabled(true);
				campo2.setEnabled(true);
				campo3.setEnabled(true);
				campo4.setEnabled(true);
				campo5.setEnabled(true);
				
			}
		});
	}

	static void salvarRegistro() {
		j = 0;
		cadastro[i][j] = campo1.getText();
		cadastro[i][j + 1] = campo4.getText();
		cadastro[i][j + 2] = campo2.getText();
		cadastro[i][j + 3] = campo3.getText();
		cadastro[i][j + 4] = campo5.getText();
		i++;

	}
}
