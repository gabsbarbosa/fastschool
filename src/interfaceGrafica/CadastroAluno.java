package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class CadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(58, 29, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(10, 32, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil :");
		lblEstadoCivil.setBounds(10, 74, 62, 14);
		contentPane.add(lblEstadoCivil);
		
		JCheckBox chckbxSolteiroa = new JCheckBox("Solteiro(a)");
		chckbxSolteiroa.setBounds(78, 70, 97, 23);
		contentPane.add(chckbxSolteiroa);
		
		JCheckBox chckbxCasadoa = new JCheckBox("Casado(a)");
		chckbxCasadoa.setBounds(78, 95, 97, 23);
		contentPane.add(chckbxCasadoa);
		
		textField_1 = new JTextField();
		textField_1.setBounds(293, 29, 131, 49);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAlergias = new JLabel("Alergias :");
		lblAlergias.setBounds(244, 32, 46, 14);
		contentPane.add(lblAlergias);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setBounds(244, 99, 46, 14);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(293, 96, 131, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
