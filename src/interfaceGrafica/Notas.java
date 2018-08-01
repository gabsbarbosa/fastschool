package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Notas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUnidadeI;
	private JTextField textFieldUnidade2;
	private JTextField textFieldUnidade3;
	private JTextField textFieldUnidade4;
	private JTextField textFieldNomeAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notas frame = new Notas();
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
	public Notas() {
		setTitle("Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unidade I :");
		lblNewLabel.setBounds(23, 63, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Unidade II :");
		lblNewLabel_1.setBounds(23, 98, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Unidade III :");
		lblNewLabel_2.setBounds(217, 63, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Unidade IV :");
		lblNewLabel_3.setBounds(217, 98, 61, 14);
		contentPane.add(lblNewLabel_3);
		
		textFieldUnidadeI = new JTextField();
		textFieldUnidadeI.setBounds(78, 60, 86, 20);
		contentPane.add(textFieldUnidadeI);
		textFieldUnidadeI.setColumns(10);
		
		textFieldUnidade2 = new JTextField();
		textFieldUnidade2.setBounds(88, 95, 86, 20);
		contentPane.add(textFieldUnidade2);
		textFieldUnidade2.setColumns(10);
		
		textFieldUnidade3 = new JTextField();
		textFieldUnidade3.setBounds(284, 60, 86, 20);
		contentPane.add(textFieldUnidade3);
		textFieldUnidade3.setColumns(10);
		
		textFieldUnidade4 = new JTextField();
		textFieldUnidade4.setBounds(284, 95, 86, 20);
		contentPane.add(textFieldUnidade4);
		textFieldUnidade4.setColumns(10);
		
		JButton btnNewButtonEditar = new JButton("Editar");
		btnNewButtonEditar.setBounds(78, 184, 89, 23);
		contentPane.add(btnNewButtonEditar);
		
		JButton btnNewButtonSalvar = new JButton("Salvar");
		btnNewButtonSalvar.setBounds(217, 184, 89, 23);
		contentPane.add(btnNewButtonSalvar);
		
		textFieldNomeAluno = new JTextField();
		textFieldNomeAluno.setBounds(78, 11, 292, 20);
		contentPane.add(textFieldNomeAluno);
		textFieldNomeAluno.setColumns(10);
	}

}
