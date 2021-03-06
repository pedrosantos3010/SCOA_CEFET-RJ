
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.ProfessorController;
import controller.TurmaController;
import model.Professor;
import model.Turma;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.ArrayList;

public class TelaTurmas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField tfBusca;
	private ArrayList<Turma> turmas;
	private JButton btnAvaliação;
	private JButton btnExcluir;
	private JButton btnNewButton;
	private JButton btnAlterar;
	private JLabel lblTurmas;
	private JButton btnconsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTurmas frame = new TelaTurmas();
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
	/**
	 * Launch the application. @ -31,12 +59,178 @@ public class TelaTurrmas
	 * extends JFrame { Create the frame.
	 */
	public TelaTurmas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				//carregarTable(-1);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("SCOA - Turmas");
		setResizable(false);
		setBounds(100, 100, 1024, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		lblTurmas = new JLabel("Turmas");
		lblTurmas.setHorizontalAlignment(SwingConstants.LEFT);
		lblTurmas.setForeground(new Color(31, 58, 104));
		lblTurmas
				.setIcon(new ImageIcon(TelaCadastroTurma.class.getResource("/images/_007f97-removebg-preview100.png")));
		lblTurmas.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTurmas.setBounds(10, 11, 998, 57);
		contentPane.add(lblTurmas);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 121, 998, 439);
		contentPane.add(scrollPane);

		table = new JTable();		
		table.setModel(new DefaultTableModel(new Object[][] { { null, null }, }, new String[] { "ID", "Turma" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] { false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(477);
		scrollPane.setViewportView(table);

		btnNewButton = new JButton("Nova Turma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					TelaCadastroTurma tela = new TelaCadastroTurma();
					tela.povoarComboBox();
					dispose();
					tela.setVisible(true);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(10, 89, 152, 23);
		contentPane.add(btnNewButton);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int clicou = table.getSelectedRow();
				if (clicou >= 0) {
					// JOptionPane.showMessageDialog(null, "clicou " +
					// turmas.get(clicou).getNome_usuario() + " na linha " +
					// clicou);
					try {
						TelaCadastroTurma tela = new TelaCadastroTurma();
						TurmaController controllerT = new TurmaController();
						Turma turma = controllerT.buscarTurma(turmas.get(clicou).getIdTurma());
						 //JOptionPane.showMessageDialog(null,"enviou codigo" + turma.getId_turma() + "e periodo" + turma.getPeriodo_turma());
						tela.povoarComboBox();
						tela.carregarValores(turma);
						tela.carregarTable(turma.getIdTurma());
						dispose();
						tela.setVisible(true);

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum selecionado.");
				}
			}
		});
		btnAlterar.setBounds(172, 89, 152, 23);
		contentPane.add(btnAlterar);

		tfBusca = new JTextField();
		tfBusca.setBounds(637, 90, 272, 20);
		contentPane.add(tfBusca);
		tfBusca.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				int linhas = table.getRowCount();
				int indiceLocalizado = -1;
				for (int i = 0; i < linhas; i++) {		
					if (tfBusca.getText().equals(dtm.getValueAt(i, 1).toString())) {
						indiceLocalizado = i;
					}
					//JOptionPane.showMessageDialog(null, "Comparou " + tfBusca.getText() + " com: " + dtm.getValueAt(i, 1));
				}
				if (indiceLocalizado < 0)
					JOptionPane.showMessageDialog(null, "Não encontrado.", "Erro na busca.",
							JOptionPane.INFORMATION_MESSAGE);
				else
					table.setRowSelectionInterval(indiceLocalizado, indiceLocalizado);

			}
		});
		btnBuscar.setBounds(919, 89, 89, 23);
		contentPane.add(btnBuscar);

		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int clicou = table.getSelectedRow();
				if (clicou >= 0) {
					int rs = JOptionPane.showConfirmDialog(null, "Excluir " + turmas.get(clicou).getNome(),
							"Atenção", JOptionPane.YES_NO_OPTION);
					if (rs == JOptionPane.YES_OPTION) {
						try {
							TurmaController controllerT = new TurmaController();
							Turma turma = controllerT.buscarTurma(turmas.get(clicou).getIdTurma());
							boolean status = controllerT.excluirTurma(turma.getIdTurma());
							if (status == true) {
								JOptionPane.showMessageDialog(null, "Removida com sucesso!");
							}
						} catch (Exception ex) {
							JOptionPane.showMessageDialog(null, "ERRO!", ex.getLocalizedMessage(),
									JOptionPane.ERROR_MESSAGE);
						}
					}
				} else
					JOptionPane.showMessageDialog(null, "Nenhum selecionado.");

			}
		});
		btnExcluir.setBounds(334, 89, 152, 23);
		contentPane.add(btnExcluir);
		
		btnAvaliação = new JButton("Lançar Avaliação");
		btnAvaliação.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = turmas.get(table.getSelectedRow()).getIdTurma();
				try {
					TelaCadastroAvaliacao tela = new TelaCadastroAvaliacao();
					tela.carregarValores(id);
					tela.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnAvaliação.setBounds(10, 87, 152, 23);
		//contentPane.add(btnAvaliação);
		
		btnconsultar = new JButton("Ver avaliações");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if (table.getSelectedRow() >= 0) {
					TelaAvaliacoes tela = new TelaAvaliacoes();
					tela.carregarTableAv(turmas.get(table.getSelectedRow()).getIdTurma());
					tela.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Nenhuma selecionada!");
				}
			}
		});
		btnconsultar.setBounds(172, 87, 152, 23);
		//contentPane.add(btnconsultar);
		
		
	}

	public void carregarTable(int id) {
		DefaultTableModel tablemodel = (DefaultTableModel) table.getModel();
		tablemodel.setRowCount(0);
		TurmaController controllerT = new TurmaController();

		try {
			turmas = controllerT.listarTurmas(id);
			turmas.forEach((Turma turma) -> {
				tablemodel.addRow(new Object[] { turma.getIdTurma(), turma.getNome() });
			});
			table.setModel(tablemodel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void TelaTurmasProf(int id){
		ProfessorController controller = new ProfessorController();
		try {
			Professor prof = controller.buscarProfessor(id);
			carregarTable(prof.getId_professor());
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		contentPane.remove(btnAlterar);
		contentPane.remove(btnExcluir);
		contentPane.remove(btnNewButton);
		contentPane.add(btnAvaliação);
		contentPane.add(btnconsultar);
		lblTurmas.setText("Minhas Turmas");
	}

}
