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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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
	static JLabel celular;
	static JLabel telefoneComercial;
	static JLabel telefoneResidencial;
	static JLabel telefoneContato;
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
	static JButton voltar;
	static JTable tabela;
	static Scrollbar rolagem;
	static JScrollPane rolagem2;
	static MaskFormatter mascara;
	static MaskFormatter mascara2;
	static MaskFormatter mascara3;
	static MaskFormatter mascara4;
	static MaskFormatter mascara5;
	static JFormattedTextField telefone;
	static JFormattedTextField telefone2;
	static JFormattedTextField telefone3;
	static JFormattedTextField telefone4;
	static JFormattedTextField telefone5;
	
	static int i = 0;
	static int j = 0;
	static int cod =1;

	static int posicao;

	static String[][] cadastro = new String[100][9];

	static String[] tabela1 = new String[] { "Código", "Nome", "Endereço", "E-mail", "Telefone", "Telefone Comercial", "Celuarl", "Telefone Residencial", "Telefone Recado"};

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
					
					telaCadastro();
					JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");

				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto, por favor verifique!");
				}

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
		painel3.setBackground(Color.white);
		janela3.setResizable(false);
		painel3.setVisible(true);
		janela3.add(painel3);

		capa2 = new JLabel("Nome: *");
		capa2.setHorizontalAlignment(SwingConstants.CENTER);
		capa2.setBounds(-250, -10, 600, 50);
		capa2.setVisible(true);
		painel3.add(capa2);

		campo1 = new JTextField();
		campo1.setSize(490, 20);
		campo1.setLocation(40, 30);
		campo1.setVisible(true);
		painel3.add(campo1);

		capa5 = new JLabel("Código: *");
		capa5.setHorizontalAlignment(SwingConstants.CENTER);
		capa5.setBounds(340, -10, 600, 50);
		capa5.setVisible(true);
		painel3.add(capa5);

		campo4 = new JTextField();
		campo4.setSize(25, 20);
		campo4.setLocation(640, 30);
		campo4.setEnabled(false);
		campo4.setText(" "+cod);
		campo4.setVisible(true);
		painel3.add(campo4);
	
		capa3 = new JLabel("Endereço: *");
		capa3.setHorizontalAlignment(SwingConstants.CENTER);
		capa3.setBounds(-243, 45, 600, 50);
		capa3.setVisible(true);
		painel3.add(capa3);

		campo2 = new JTextField();
		campo2.setSize(490, 20);
		campo2.setLocation(40, 85);
		campo2.setVisible(true);
		painel3.add(campo2);

		capa4 = new JLabel("E-mail: *");
		capa4.setHorizontalAlignment(SwingConstants.CENTER);
		capa4.setBounds(-251, 100, 600, 50);
		capa4.setVisible(true);
		painel3.add(capa4);

		campo3 = new JTextField();
		campo3.setSize(490, 20);
		campo3.setLocation(40, 140);
		campo3.setVisible(true);
		painel3.add(campo3);

		capa6 = new JLabel("Telefone: *");
		capa6.setHorizontalAlignment(SwingConstants.CENTER);
		capa6.setBounds(-245, 150, 600, 50);
		capa6.setVisible(true);
		painel3.add(capa6);

		telefoneComercial = new JLabel("Telefone Comercial: *");
		telefoneComercial.setHorizontalAlignment(SwingConstants.CENTER);
		telefoneComercial.setBounds(-60, 150, 600, 50);
		telefoneComercial.setVisible(true);
		painel3.add(telefoneComercial);
		
		celular = new JLabel("Celular: *");
		celular.setHorizontalAlignment(SwingConstants.CENTER);
		celular.setBounds(-250, 197, 600, 50);
		celular.setVisible(true);
		painel3.add(celular);
		
		telefoneResidencial = new JLabel("Telefone Residencial: *");
		telefoneResidencial.setHorizontalAlignment(SwingConstants.CENTER);
		telefoneResidencial.setBounds(-56, 197, 600, 50);
		telefoneResidencial.setVisible(true);
		painel3.add(telefoneResidencial);

		telefoneContato = new JLabel("Recado: *");
		telefoneContato.setHorizontalAlignment(SwingConstants.CENTER);
		telefoneContato.setBounds(-250, 240, 600, 50);
		telefoneContato.setVisible(true);
		painel3.add(telefoneContato);
		
		
		
		try {
			mascara = new MaskFormatter("(##)####-####");
			mascara.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}

		telefone = new JFormattedTextField(mascara);
		telefone.setColumns(10);
		telefone.setSize(90, 20);
		telefone.setLocation(40, 185);
		telefone.setVisible(true);
		painel3.add(telefone);
		//pronto1
		try {
			mascara2 = new MaskFormatter("(##)####-####");
			mascara2.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}

		telefone2 = new JFormattedTextField(mascara2);
		telefone2.setColumns(10);
		telefone2.setSize(90, 20);
		telefone2.setLocation(40, 232);
		telefone2.setVisible(true);
		painel3.add(telefone2);
		//pronto2
		
		try {
			mascara3 = new MaskFormatter("(##)####-####");
			mascara3.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		telefone3 = new JFormattedTextField(mascara3);
		telefone3.setColumns(10);
		telefone3.setSize(90, 20);
		telefone3.setLocation(180, 232);
		telefone3.setVisible(true);
		painel3.add(telefone3);
		//pronto3
		
		try {
			mascara4 = new MaskFormatter("(##)####-####");
			mascara4.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}

		telefone4 = new JFormattedTextField(mascara4);
		telefone4.setColumns(10);
		telefone4.setSize(90, 20);
		telefone4.setLocation(180, 185);
		telefone4.setVisible(true);
		painel3.add(telefone4);
		//pronto4
		
		try {
			mascara5 = new MaskFormatter("(##)####-####");
			mascara5.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}

		telefone5 = new JFormattedTextField(mascara5);
		telefone5.setColumns(10);
		telefone5.setSize(90, 20);
		telefone5.setLocation(40, 275);
		telefone5.setVisible(true);
		painel3.add(telefone5);
		
		
		
		novo= new JButton("Novo");
		novo.setSize(80, 20);
		novo.setLocation(82, 355);
		novo.setEnabled(false);
		novo.setVisible(true);
		painel3.add(novo);

		editar = new JButton("Editar");
		editar.setSize(80, 20);
		editar.setLocation(180, 355);
		editar.setVisible(true);
		editar.setEnabled(false);
		painel3.add(editar);

		salvar = new JButton("Salvar");
		salvar.setSize(80, 20);
		salvar.setLocation(550, 355);
		salvar.setVisible(true);
		painel3.add(salvar);

		consultar = new JButton("Consultar");
		consultar.setSize(120, 20);
		consultar.setLocation(278, 355);
		consultar.setVisible(true);
		consultar.setEnabled(true);
		painel3.add(consultar);

		excluir = new JButton("Excluir");
		excluir.setSize(120, 20);
		excluir.setLocation(415, 355);
		excluir.setEnabled(false);
		excluir.setVisible(true);
		painel3.add(excluir);

		botoesCadastros();

	}
	

	static void botoesCadastros() {

		novo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela3.dispose();
				telaCadastro();
				buscarPosicao(0);
				cod = posicao + 1;
				
				if (cod < 100) {
					
					
					campo4.setText("");
					campo4.setText("" + cod);
					if (!salvo) {
						salvarRegistro();
					}

					salvar.setEnabled(true);
					editar.setEnabled(false);
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
			
				
				/**salvarRegistro();
				
				janela3.dispose();
				cod++;
				telaCadastro();*/
				
				
				
				
				
				//cod = posicao + 1;
				
				salvar.setEnabled(false);
				editar.setEnabled(true);
				novo.setEnabled(true);
				excluir.setEnabled(true);

				
				campo1.setEnabled(false);
				campo2.setEnabled(false);
				campo3.setEnabled(false);
				campo4.setEnabled(false);
				telefone.setEnabled(false);
				telefone2.setEnabled(false);
				telefone3.setEnabled(false);
				telefone4.setEnabled(false);
				telefone5.setEnabled(false);
				
							
				
				if (cod < 1) {
					consultar.setEnabled(false);

				} else {
					consultar.setEnabled(true);
				}
				
				if(campo1.getText().isEmpty()||campo2.getText().isEmpty()||campo3.getText().isEmpty()||telefone.getText().isEmpty()||telefone2.getText().isEmpty()||telefone3.getText().isEmpty()||telefone.getText().isEmpty()){
					
				
					salvar.setEnabled(false);
								
					
					JOptionPane.showMessageDialog(null, "Campos com ' * 'são obrigatórios! \nPor favor verifique!");
					
				}else{
				
				salvarRegistro();
				buscarPosicao(0);
				//cod = posicao +1;
				campo4.setText(String.valueOf(cod));
				salvo = true;
				JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
				}
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
						cadastro[i][j + 5] = " ";
						cadastro[i][j + 6] = " ";
						cadastro[i][j + 7] = " ";
						cadastro[i][j + 8] = " ";
						
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

				excluir.setEnabled(true);
				
				
				buscarPosicao(0);

				
				
				
				ok = new JButton("OK");
				ok.setBounds(10, 310, 100, 20);
				ok.setVisible(true);
				painel4.add(ok);

				if (posicao == 0 && quantidadeCliente() == 0) {
					ok.setEnabled(false);

				}

				voltar = new JButton("Voltar");
				voltar.setBounds(140, 310, 100, 20);
				voltar.setVisible(true);
				painel4.add(voltar);

				exibirRegistros();
				acoesDaTelaOk();
				

			}
		});

		editar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				editar.setEnabled(false);
				salvar.setEnabled(true);
				
				campo1.setEnabled(true);
				campo2.setEnabled(true);
				campo3.setEnabled(true);
				telefone.setEnabled(true);
				telefone2.setEnabled(true);
				telefone3.setEnabled(true);
				telefone4.setEnabled(true);
				telefone5.setEnabled(true);

			}
		});
	}

	static int quantidadeCliente() {
		int qtde = 0;
		for (int q = 0; q < 100; q++) {
			for (int w = 0; w < 9; w++) {
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
					
					excluir.setEnabled(true);

					campo4.setText((String) tabela.getValueAt(t, 0));
					campo1.setText((String) tabela.getValueAt(t, 1));
					campo2.setText((String) tabela.getValueAt(t, 2));
					campo3.setText((String) tabela.getValueAt(t, 3));
					telefone.setText((String) tabela.getValueAt(t, 4));
					telefone2.setText((String) tabela.getValueAt(t, 5));
					telefone3.setText((String) tabela.getValueAt(t, 6));
					telefone4.setText((String) tabela.getValueAt(t, 7));
					telefone5.setText((String) tabela.getValueAt(t, 8));
					

					posicao = Integer.parseInt(((String)tabela.getValueAt(t, 0)));

				} else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione um registro para continuar!");
				}

			}
		});

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				janela4.dispose();
				telaCadastro();
			}
		});

	}

	static void buscarPosicao(int n) {
		String dados = cadastro[n][0];
	
		if (!dados.equals(" ")&&(n < 100)){
			
			buscarPosicao(n + 1);
			
		} else {
			posicao = n;
		}

	}

	static void exibirRegistros() {

		int k = quantidadeCliente();
		
		
		String[] dados = new String[9];

		for (int i = 0; i < k; i++) {

			for (int j = 0; j < 9; j++) {

				if (!cadastro[i][j].equals(" ") && j == 0) {

					dados[0] = cadastro[i][0];
					dados[1] = cadastro[i][1];
					dados[2] = cadastro[i][2];
					dados[3] = cadastro[i][3];
					dados[4] = cadastro[i][4];
					dados[5] = cadastro[i][5];
					dados[6] = cadastro[i][6];
					dados[7] = cadastro[i][7];
					dados[8] = cadastro[i][8];
					tabela2.addRow(dados);
					
				}

			}

		}

	}

	static void salvarRegistro() {
		
		buscarPosicao(0);
		i = posicao;
		
		j = 0;
		cadastro[i][j] = campo4.getText();
		cadastro[i][j + 1] = campo1.getText();
		cadastro[i][j + 2] = campo2.getText();
		cadastro[i][j + 3] = campo3.getText();
		cadastro[i][j + 4] = telefone.getText();
		cadastro[i][j + 5] = telefone2.getText();
		cadastro[i][j + 6] = telefone3.getText();
		cadastro[i][j + 7] = telefone4.getText();
		cadastro[i][j + 8] = telefone5.getText();
		
		i++;

	}

	static void iniciarMatriz() {

		for (int f = 0; f < 100; f++) {

			for (int w = 0; w < 9; w++) {

				cadastro[f][w] = " ";
			}

		}

	}
}
