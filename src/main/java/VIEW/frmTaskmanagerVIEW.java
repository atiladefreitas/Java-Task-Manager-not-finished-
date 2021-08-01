package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Choice;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class frmTaskmanagerVIEW extends JFrame {

	private JPanel contentPane;
	private JTextField fieldTitulo;
	private JTextField fieldDeadline;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTaskmanagerVIEW frame = new frmTaskmanagerVIEW();
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
	public frmTaskmanagerVIEW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Título:");
		lblTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitulo.setBounds(10, 11, 72, 14);
		contentPane.add(lblTitulo);
		
		fieldTitulo = new JTextField();
		fieldTitulo.setBounds(92, 8, 303, 20);
		contentPane.add(fieldTitulo);
		fieldTitulo.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescricao.setBounds(10, 47, 72, 14);
		contentPane.add(lblDescricao);
		
		JLabel lblResponsavel = new JLabel("Responsável:");
		lblResponsavel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResponsavel.setBounds(10, 140, 72, 14);
		contentPane.add(lblResponsavel);
		
		JTextArea fieldDescricao = new JTextArea();
		fieldDescricao.setBounds(92, 47, 303, 67);
		contentPane.add(fieldDescricao);
		
		JLabel lblPrioridade = new JLabel("Prioridade:");
		lblPrioridade.setBackground(new Color(240, 240, 240));
		lblPrioridade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrioridade.setBounds(216, 140, 72, 14);
		contentPane.add(lblPrioridade);
		
		JLabel lblDeadline = new JLabel("Deadline:");
		lblDeadline.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeadline.setBounds(10, 184, 72, 14);
		contentPane.add(lblDeadline);
		
		Choice choicePrioridade = new Choice();
		choicePrioridade.setBounds(298, 134, 97, 20);
		contentPane.add(choicePrioridade);
		
		Choice choiceResponsavel = new Choice();
		choiceResponsavel.setBounds(92, 134, 97, 20);
		contentPane.add(choiceResponsavel);
		
		fieldDeadline = new JTextField();
		fieldDeadline.setBounds(92, 181, 86, 20);
		contentPane.add(fieldDeadline);
		fieldDeadline.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String titulo, descricao;
				
				titulo = fieldTitulo.getText();
				descricao = fieldDescricao.getText();
				
				TaskmanagerDTO objtaskmanagerdto = new TaskmanagerDTO();
				objtaskmanagerdto.set
			} 
		});
		btnCadastrar.setBounds(306, 227, 89, 23);
		contentPane.add(btnCadastrar);
	}
}
