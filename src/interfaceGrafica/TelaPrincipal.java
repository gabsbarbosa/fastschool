package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		mnNewMenu.add(mnCadastro);
		
		JMenuItem mntmAdministrador = new JMenuItem("Administrador");
		mnCadastro.add(mntmAdministrador);
		
		JMenuItem mntmProfessor = new JMenuItem("Professor");
		mnCadastro.add(mntmProfessor);
		
		JMenuItem mntmAluno = new JMenuItem("Aluno");
		mnCadastro.add(mntmAluno);
		
		JMenuItem mntmTurma = new JMenuItem("Turma");
		mnCadastro.add(mntmTurma);
		
		JMenuItem mntmDisciplina = new JMenuItem("Disciplina");
		mnCadastro.add(mntmDisciplina);
		
		JMenu mnConsulta = new JMenu("Consulta");
		mnNewMenu.add(mnConsulta);
		
		JMenuItem mntmAdministrador_1 = new JMenuItem("Administrador");
		mnConsulta.add(mntmAdministrador_1);
		
		JMenuItem mntmProfessor_1 = new JMenuItem("Professor");
		mnConsulta.add(mntmProfessor_1);
		
		JMenuItem mntmAluno_1 = new JMenuItem("Aluno");
		mnConsulta.add(mntmAluno_1);
		
		JMenuItem mntmTurma_1 = new JMenuItem("Turma");
		mnConsulta.add(mntmTurma_1);
		
		JMenuItem mntmDisciplina_1 = new JMenuItem("Disciplina");
		mnConsulta.add(mntmDisciplina_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane MuralGeral = new JTextPane();
		MuralGeral.setBounds(38, 25, 361, 182);
		contentPane.add(MuralGeral);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
