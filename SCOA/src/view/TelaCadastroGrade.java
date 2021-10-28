package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controller.GradeController;
import dao.CursoDao;
import model.Curso;
import model.Grade;
import model.GradeDisciplina;

public class TelaCadastroGrade extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSpinner spAnoGrade;
	private JTextField tfMatriculaGrade;
	private JComboBox<Curso> cbCurso;
	int codigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroGrade frame = new TelaCadastroGrade();
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
	public TelaCadastroGrade() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Cadastrar Grade");
		setResizable(false);
		setBounds(100, 100, 1024, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastrarGrade = new JLabel("Cadastrar Grade");
		lblCadastrarGrade.setForeground(new Color(31, 58, 104));
		lblCadastrarGrade
				.setIcon(new ImageIcon(TelaCadastroGrade.class.getResource("/images/_007f97-removebg-preview100.png")));
		lblCadastrarGrade.setBounds(10, 11, 998, 70);
		contentPane.add(lblCadastrarGrade);
		lblCadastrarGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarGrade.setFont(new Font("Tahoma", Font.BOLD, 40));

		JPanel panelCadastroGrade = new JPanel();
		panelCadastroGrade.setBorder(new LineBorder(new Color(31, 58, 104), 2, true));
		panelCadastroGrade.setBounds(10, 87, 998, 474);
		contentPane.add(panelCadastroGrade);
		panelCadastroGrade.setLayout(null);

		JButton btnLimparCadastroGrade = new JButton("Limpar");
		btnLimparCadastroGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimparCadastroGrade.setBackground(new Color(122, 97, 171));
		btnLimparCadastroGrade.setForeground(new Color(31, 58, 104));
		btnLimparCadastroGrade.setBounds(683, 413, 301, 50);
		panelCadastroGrade.add(btnLimparCadastroGrade);
		btnLimparCadastroGrade.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnSalvarGrade = new JButton("Salvar");
		btnSalvarGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int anograde = Integer.parseInt(spAnoGrade.getValue().toString());
				String matriculagrade = tfMatriculaGrade.getText();
				int idcurso = ((Curso) cbCurso.getSelectedItem()).getId_curso();
				try {
					GradeController controller = new GradeController();
					boolean status = false;
					if (codigo == 0) {
						status = controller.cadastrarGrade(idcurso, anograde, matriculagrade);
					} else {
						status = controller.alterarGrade(codigo, idcurso, anograde, matriculagrade);
					}
					if (status == true) {
						JOptionPane.showMessageDialog(null, "Opera��o realizada com sucesso!");
						TelaGrades tela = new TelaGrades();
						dispose();
						tela.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null,
								"Falhou, verifique se os campos est�o preenchidos corretamente.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSalvarGrade.setBackground(new Color(122, 97, 171));
		btnSalvarGrade.setForeground(new Color(31, 58, 104));
		btnSalvarGrade.setBounds(12, 413, 301, 50);
		panelCadastroGrade.add(btnSalvarGrade);
		btnSalvarGrade.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnvoltar = new JButton("Voltar");
		btnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaGrades tela = new TelaGrades();
				dispose();
				tela.setVisible(true);
			}
		});
		btnvoltar.setForeground(new Color(31, 58, 104));
		btnvoltar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnvoltar.setBackground(new Color(122, 97, 171));
		btnvoltar.setBounds(350, 413, 301, 50);
		panelCadastroGrade.add(btnvoltar);
		
		JLabel lblAnoGradeCadastroTurma = new JLabel("Ano:");
		lblAnoGradeCadastroTurma.setForeground(new Color(122, 97, 171));
		lblAnoGradeCadastroTurma.setBackground(new Color(31, 58, 104));
		lblAnoGradeCadastroTurma.setBounds(10, 11, 38, 20);
		panelCadastroGrade.add(lblAnoGradeCadastroTurma);
		lblAnoGradeCadastroTurma.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblAnoGradeCadastroTurma.setHorizontalAlignment(SwingConstants.LEFT);
		lblAnoGradeCadastroTurma.setFont(new Font("Tahoma", Font.BOLD, 16));

		spAnoGrade = new JSpinner();
		spAnoGrade.setBounds(58, 13, 58, 20);
		panelCadastroGrade.add(spAnoGrade);
		
		JLabel lblMatriculaGradeGradeCadastroTurma = new JLabel("Matr\u00EDcula:");
		lblMatriculaGradeGradeCadastroTurma.setHorizontalAlignment(SwingConstants.LEFT);
		lblMatriculaGradeGradeCadastroTurma.setForeground(new Color(122, 97, 171));
		lblMatriculaGradeGradeCadastroTurma.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMatriculaGradeGradeCadastroTurma.setBackground(new Color(31, 58, 104));
		lblMatriculaGradeGradeCadastroTurma.setAlignmentX(0.5f);
		lblMatriculaGradeGradeCadastroTurma.setBounds(12, 42, 82, 20);
		panelCadastroGrade.add(lblMatriculaGradeGradeCadastroTurma);
		
		tfMatriculaGrade = new JTextField();
		tfMatriculaGrade.setBounds(104, 44, 884, 20);
		panelCadastroGrade.add(tfMatriculaGrade);
		tfMatriculaGrade.setColumns(10);
		
		JLabel lblCursoGradeCadastroTurma = new JLabel("Curso:");
		lblCursoGradeCadastroTurma.setHorizontalAlignment(SwingConstants.LEFT);
		lblCursoGradeCadastroTurma.setForeground(new Color(122, 97, 171));
		lblCursoGradeCadastroTurma.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCursoGradeCadastroTurma.setBackground(new Color(31, 58, 104));
		lblCursoGradeCadastroTurma.setAlignmentX(0.5f);
		lblCursoGradeCadastroTurma.setBounds(12, 73, 52, 20);
		panelCadastroGrade.add(lblCursoGradeCadastroTurma);
		
		cbCurso = new JComboBox<Curso>();
		cbCurso.setBounds(74, 75, 916, 20);
		panelCadastroGrade.add(cbCurso);

	}
	
	public void limpar() {
		spAnoGrade.setValue(0);
		tfMatriculaGrade.setText("");
		cbCurso.setSelectedIndex(0);
	}

	public void carregarValores(Grade grade) {
		spAnoGrade.setValue(grade.getAnoGrade());
		tfMatriculaGrade.setText(grade.getMatriculaGrade());
		cbCurso.setSelectedItem(grade.getIdCurso());
		codigo = grade.getIdGrade();
	}
	
	public void povoarComboBox() throws Exception{
		CursoDao cursodao = new CursoDao();
		for (Curso curso: cursodao.listarCursos()){
			cbCurso.addItem(curso);
		}
	}
}