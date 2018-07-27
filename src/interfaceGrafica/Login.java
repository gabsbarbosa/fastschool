package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Panel;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsurio;
	private JPasswordField passwordField_Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setFont(new Font("Segoe Print", Font.BOLD, 14));
		setType(Type.POPUP);
		setTitle("FASTSCHOOL - Gerenciamento de institui\u00E7\u00F5es de ensino");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		
		JInternalFrame internalFrame = new JInternalFrame("");
		internalFrame.getContentPane().setFont(UIManager.getFont("Label.font"));
		internalFrame.setBounds(101, 68, 240, 153);
		internalFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		internalFrame.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(188, 143, 143)));
		internalFrame.getContentPane().setBackground(new Color(135, 206, 235));
		internalFrame.getContentPane().setForeground(Color.BLACK);
		internalFrame.setVisible(true);
		contentPane.setLayout(null);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio :");
		lblUsurio.setForeground(new Color(47, 79, 79));
		lblUsurio.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblUsurio.setBounds(42, 42, 55, 14);
		internalFrame.getContentPane().add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha :");
		lblSenha.setForeground(new Color(47, 79, 79));
		lblSenha.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblSenha.setBounds(52, 67, 43, 14);
		internalFrame.getContentPane().add(lblSenha);
		
		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setBounds(96, 64, 86, 20);
		internalFrame.getContentPane().add(passwordField_Senha);
		passwordField_Senha.setDropMode(DropMode.ON);
		
		txtUsurio = new JTextField();
		txtUsurio.setBounds(96, 39, 86, 20);
		internalFrame.getContentPane().add(txtUsurio);
		txtUsurio.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsurio.setForeground(Color.GRAY);
		txtUsurio.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JProgressBar progressBar_Login = new JProgressBar();
		progressBar_Login.setBounds(151, 232, 146, 18);
		contentPane.add(progressBar_Login);
		btnEntrar.setForeground(new Color(25, 25, 112));
		btnEntrar.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnEntrar.setBounds(96, 89, 78, 23);
		internalFrame.getContentPane().add(btnEntrar);
		contentPane.add(internalFrame);
		
		progressBar_Login.setVisible(false);
	}
}
