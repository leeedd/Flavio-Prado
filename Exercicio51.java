import java.awt.Color;
import java.awt.Component;
import javax.swing.table.*;
import javax.swing.text.MaskFormatter;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class Exercicio51 {

	static JPanel menu;
	static JPanel painel;
	static JPanel painel2;
	static JPanel painel3;
	static JPanel painel4;
	static JButton botao;
	static JButton botao2;
	static JFrame janela;
	static JFrame janela2;
	static JFrame janela3;
	static JFrame janela4;
	static JLabel capa;
	static JLabel capa2;
	static JLabel capa3;
	static JLabel capa4;
	static JLabel capa5;
	static JLabel capa6;
	static JLabel capa7;
	static JLabel capa8;
	static JTextField campo1;
	static JTextField campo2;
	static JTextField campo3;
	static JTextField campo4;
	static JTextField campo6;
	static JTextField campo7;
	static JMenuBar menu2;
	static JMenu iniciar;
	static JMenu ajuda;
	static JMenu sobre;
	static JButton botaodemenu1;
	static JMenuItem cadastroCliente;
	static JMenuItem sair;
	static JButton novo;
	static JButton editar;
	static JButton salvar;
	static JButton consultar;
	static JButton excluir;
	static JButton ok;
	static JButton sair2;
	static JTable tabela;
	static Scrollbar rolagem;
	static JScrollPane rolagem2;
	static MaskFormatter mascara;
	static JFormattedTextField telefone;

	static int i = 0;
	static int j = 0;
	static int cod = 0;

	static int posicao;

	static String[][] cadastro = new String[100][5];

	static String[] tabela1 = new String[] { "Código", "Nome", "Endereço", "E-mail", "Telefone" };

	static boolean salvo = false;

	static DefaultTableModel tabela2;

	static void componentes() {
		janela = new JFrame("Cadastro de Usuário.");
		capa8 = new JLabel(new ImageIcon("Imagem\\imagem2.png"));
		capa = new JLabel("Login:");
		capa.setHorizontalAlignment(SwingConstants.CENTER);
		capa.setBounds(240, 100, 150, 20);
		capa.setVisible(true);

		capa7 = new JLabel("Senha:");
		capa7.setHorizontalAlignment(SwingConstants.CENTER);
		capa7.setBounds(240, 100, 152, 75);
		capa7.setVisible(true);

		painel = new JPanel();
		painel.setSize(550, 300);
		painel.setLayout(null);
		painel.setBackground(Color.WHITE);
		painel.setVisible(true);
		painel.add(capa);
		painel.add(capa7);

		capa8.setHorizontalAlignment(SwingConstants.CENTER);
		capa8.setBounds(30, 20, 200, 200);
		capa8.setVisible(true);
		painel.add(capa8);

		campo6 = new JTextField("admin");
		campo6.setSize(80, 20);
		campo6.setLocation(350, 95);
		campo6.setVisible(true);
		painel.add(campo6);

		campo7 = new JPasswordField("admin");
		campo7.setSize(80, 20);
		campo7.setLocation(350, 125);
		campo7.setVisible(true);
		painel.add(campo7);

		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(550, 300);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
		painel.add(capa);

		botao = new JButton("Login");
		botao.setSize(80, 20);
		botao.setLocation(380, 150);
		botao.setVisible(true);
		painel.add(botao);

		botao2 = new JButton("Sair");
		botao2.setSize(80, 20);
		botao2.setLocation(300, 150);
		botao2.setVisible(true);
		painel.add(botao2);
		botoes();

	}

	public static void main(String[] args) {

		iniciarMatriz();

		componentes();

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

				String a = campo6.getText();
				String b = campo7.getText();

				if (a.equalsIgnoreCase("admin") && b.equalsIgnoreCase("admin")) {

					janela.setVisible(false);
					criarMenu();

					JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");

				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto, por favor verifique!");
				}

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

		cadastroCliente = new JMenuItem("Cadastro de Cliente");
		sair = new JMenuItem("Sair");

		iniciar.add(cadastroCliente);
		iniciar.addSeparator();
		iniciar.add(sair);

		cadastroCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buscarPosicao(0);
				cod = posicao;
				if (cod == 0) {

					cod = 1;

				} else {
					cod++;
				}

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

				componentes();
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
		janela3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

		try {
			mascara = new MaskFormatter("(##)####-####");
			mascara.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}

		telefone = new JFormattedTextField(mascara);
		telefone.setColumns(10);
		telefone.setSize(90, 20);
		telefone.setLocation(90, 182);
		telefone.setVisible(true);
		painel3.add(telefone);

		novo = new JButton("Novo");
		novo.setSize(80, 30);
		novo.setLocation(82, 345);
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
		salvar.setLocation(550, 345);
		salvar.setVisible(true);
		painel3.add(salvar);

		consultar = new JButton("Consultar");
		consultar.setSize(120, 30);
		consultar.setLocation(278, 345);
		consultar.setVisible(true);
		consultar.setEnabled(true);

		painel3.add(consultar);

		excluir = new JButton("Excluir");
		excluir.setSize(120, 30);
		excluir.setLocation(415, 345);
		excluir.setVisible(true);
		painel3.add(excluir);

		botoesCadastros();

	}

	static void botoesCadastros() {

		novo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buscarPosicao(0);
				cod = posicao;
				if (cod < 100) {
					cod++;

					campo4.setText("");
					campo4.setText("" + cod);
					if (!salvo) {
						salvarRegistro();
					}

					salvar.setEnabled(true);
					editar.setEnabled(false);
					janela3.dispose();
					telaCadastro();
					salvo = false;
				} else {

					campo1.setEnabled(false);
					campo2.setEnabled(false);
					campo3.setEnabled(false);
					campo4.setEnabled(false);
					telefone.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Limite de clientes atingido!");

				}

			}

		});

		salvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				buscarPosicao(0);
				cod = posicao;
				cod++;
				salvar.setEnabled(false);
				editar.setEnabled(true);
				salvar.setEnabled(true);

				campo1.setEnabled(false);
				campo2.setEnabled(false);
				campo3.setEnabled(false);
				campo4.setEnabled(false);
				telefone.setEnabled(false);

				if (cod < 1) {
					consultar.setEnabled(false);

				} else {
					consultar.setEnabled(true);
				}

				salvarRegistro();
				salvo = true;
				JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");

			}
		});

		excluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (excluir.isEnabled()) {
					if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir?", null,
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_NO_OPTION) {
						janela3.dispose();
						telaCadastro();

						JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");

						j = 0;
						i = posicao - 1;

						cadastro[i][j] = " ";
						cadastro[i][j + 1] = " ";
						cadastro[i][j + 2] = " ";
						cadastro[i][j + 3] = " ";
						cadastro[i][j + 4] = " ";

						cod--;

					}
					;
				}

			}
		});

		consultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				janela3.dispose();

				janela4 = new JFrame("Consulta de Clientes");
				janela4.setLayout(null);
				janela4.setSize(600, 400);
				janela4.setLocationRelativeTo(null);
				janela4.setVisible(true);

				painel4 = new JPanel();
				painel4.setSize(800, 600);
				painel4.setLocation(0, 0);
				painel4.setLayout(null);
				painel4.setBackground(Color.LIGHT_GRAY);
				janela4.setResizable(false);
				painel4.setVisible(true);
				janela4.add(painel4);

				tabela2 = new DefaultTableModel(tabela1, 0);

				tabela = new JTable();
				tabela.setBounds(10, 10, 575, 300);
				tabela.setLayout(null);
				tabela.setModel(tabela2);
				painel4.add(tabela);
				painel4.setVisible(true);

				rolagem2 = new JScrollPane(tabela);
				rolagem2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				rolagem2.setBounds(10, 10, 575, 300);
				rolagem2.setViewportView(tabela);
				painel4.add(rolagem2);

				buscarPosicao(0);

				ok = new JButton("OK");
				ok.setBounds(10, 310, 100, 20);
				ok.setVisible(true);
				painel4.add(ok);

				if (posicao == 0 && quantidadeCliente() == 0) {
					ok.setEnabled(false);

				}

				sair2 = new JButton("Sair");
				sair2.setBounds(140, 310, 100, 20);
				sair2.setVisible(true);
				painel4.add(sair2);

				exibirRegistros();
				acoesDaTelaOk();

			}
		});

		editar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				campo1.setEnabled(true);
				campo2.setEnabled(true);
				campo3.setEnabled(true);
				campo4.setEnabled(true);
				telefone.setEnabled(true);

			}
		});
	}

	static int quantidadeCliente() {
		int qtde = 0;
		for (int q = 0; q < 100; q++) {
			for (int w = 0; w < 5; w++) {
				String valor = cadastro[q][w];
				if(!valor.equals(" ") && w == 0){
					qtde++;
				}
				
			}
		}
		return qtde;
	}

	static void acoesDaTelaOk() {

		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int t = tabela.getSelectedRow();

				if (t > -1) {

					janela4.dispose();
					telaCadastro();

					campo4.setText((String) tabela.getValueAt(t, 0));
					campo1.setText((String) tabela.getValueAt(t, 1));
					campo2.setText((String) tabela.getValueAt(t, 2));
					campo3.setText((String) tabela.getValueAt(t, 3));
					telefone.setText((String) tabela.getValueAt(t, 4));

					posicao = Integer.parseInt(((String) tabela.getValueAt(t, 0)));

				} else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione um registro para continuar!");
				}

			}
		});

		sair2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela4.dispose();

			}
		});

	}

	static void buscarPosicao(int n) {
		String dados = cadastro[n][0];
		if (!dados.equals(" ")) {
			buscarPosicao(n + 1);
		} else {
			posicao = n;
		}

	}

	static void exibirRegistros() {

		int k = quantidadeCliente();
		
		
		String[] dados = new String[5];

		for (int i = 0; i < k; i++) {

			for (int j = 0; j < 5; j++) {

				if (!cadastro[i][j].equals(" ") && j == 0) {

					dados[0] = cadastro[i][0];
					dados[1] = cadastro[i][1];
					dados[2] = cadastro[i][2];
					dados[3] = cadastro[i][3];
					dados[4] = cadastro[i][4];
					tabela2.addRow(dados);
					
				}

			}

		}

	}

	static void salvarRegistro() {

		j = 0;
		cadastro[i][j] = campo4.getText();
		cadastro[i][j + 1] = campo1.getText();
		cadastro[i][j + 2] = campo2.getText();
		cadastro[i][j + 3] = campo3.getText();
		cadastro[i][j + 4] = telefone.getText();
		i++;

	}

	static void iniciarMatriz() {

		for (int f = 0; f < 100; f++) {

			for (int w = 0; w < 5; w++) {

				cadastro[f][w] = " ";
			}

		}

	}
}
