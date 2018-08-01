package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class CadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldAlergias;
	private JTextField textFieldEmail;
	private JTextField textFieldCPF;
	private JTextField textFieldTelefoneM;
	private JTextField textFieldTelefoneF;
	private JTextField textFieldLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroAluno() {
		setTitle("Cadastro Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDados = new JMenu("Dados");
		menuBar.add(mnDados);
		
		JMenuItem mntmInformaesPessoais = new JMenuItem("Informa\u00E7\u00F5es Pessoais");
		mnDados.add(mntmInformaesPessoais);
		
		JMenu mnNotas = new JMenu("Notas");
		mnDados.add(mnNotas);
		
		JMenuItem mntmAnoAtual = new JMenuItem("2017");
		mnNotas.add(mntmAnoAtual);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(46, 29, 86, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(10, 32, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil :");
		lblEstadoCivil.setBounds(244, 130, 62, 14);
		contentPane.add(lblEstadoCivil);
		
		textFieldAlergias = new JTextField();
		textFieldAlergias.setBounds(293, 29, 131, 49);
		contentPane.add(textFieldAlergias);
		textFieldAlergias.setColumns(10);
		
		JLabel lblAlergias = new JLabel("Alergias :");
		lblAlergias.setBounds(244, 32, 46, 14);
		contentPane.add(lblAlergias);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setBounds(244, 99, 46, 14);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(293, 96, 131, 20);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setBounds(10, 64, 46, 14);
		contentPane.add(lblCpf);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(46, 60, 86, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblTelefoneMvel = new JLabel("Telefone M\u00F3vel :");
		lblTelefoneMvel.setBounds(10, 135, 86, 14);
		contentPane.add(lblTelefoneMvel);
		
		textFieldTelefoneM = new JTextField();
		textFieldTelefoneM.setBounds(101, 132, 86, 20);
		contentPane.add(textFieldTelefoneM);
		textFieldTelefoneM.setColumns(10);
		
		JLabel lblTelefoneFixo = new JLabel("Telefone Fixo :");
		lblTelefoneFixo.setBounds(10, 160, 72, 14);
		contentPane.add(lblTelefoneFixo);
		
		textFieldTelefoneF = new JTextField();
		textFieldTelefoneF.setBounds(101, 157, 86, 20);
		contentPane.add(textFieldTelefoneF);
		textFieldTelefoneF.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setBounds(10, 89, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(46, 85, 109, 23);
		contentPane.add(rdbtnFeminino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(46, 110, 109, 23);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnSolteiroa = new JRadioButton("Solteiro(a)");
		rdbtnSolteiroa.setBounds(312, 126, 109, 23);
		contentPane.add(rdbtnSolteiroa);
		
		JRadioButton rdbtnCasadoa = new JRadioButton("Casado(a)");
		rdbtnCasadoa.setBounds(312, 154, 109, 23);
		contentPane.add(rdbtnCasadoa);
		
		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setBounds(10, 192, 46, 14);
		contentPane.add(lblLogin);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(46, 189, 86, 20);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(143, 206, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(312, 206, 89, 23);
		contentPane.add(btnSalvar);
	}
}
