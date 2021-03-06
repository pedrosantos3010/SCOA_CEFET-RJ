package view;


import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import controller.ChamadosController;
import controller.UsuarioController;
import model.Chamados;
import model.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaChamados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JButton btnfiltrar;
	private JButton btnNewButton;
	private JButton btnNovo;
	private JLabel lbl1;
	private JComboBox<String> cbFiltro;
	private ArrayList<Chamados> chamados;
	private ArrayList<Usuario> atendentes;
	private int idusuario;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaChamados frame = new TelaChamados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	/**
	 * Create the frame.
	 */
	
	public TelaChamados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
								
				//carregarTable(-1,-1);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Cadastrar Aluno");
		setResizable(false);
		setBounds(100, 100, 1024, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		lbl1 = new JLabel("Atender chamados");
		lbl1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl1.setForeground(new Color(31, 58, 104));
		lbl1
				.setIcon(new ImageIcon(TelaCadastroAluno.class.getResource("/images/_007f97-removebg-preview100.png")));
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lbl1.setBounds(10, 11, 998, 57);
		contentPane.add(lbl1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 121, 998, 439);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Numero", "Titulo", "Solicitante", "Status", "Atendente"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(199);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(219);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Atender");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Chamados ch = new Chamados();
				ch = chamados.get(table.getSelectedRow());
				try {
					AbrirChamados tela = new AbrirChamados();
					tela.carregarcombobox();
					tela.carregarvalor(ch);
					tela.carregarEdit(idusuario);					
					tela.setVisible(true);
					dispose();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(170, 87, 152, 23);
		contentPane.add(btnNewButton);

		btnfiltrar = new JButton("Filtrar");
		btnfiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = cbFiltro.getSelectedIndex()-1;
				carregarTable(id,-1);
			
			}
		});
		btnfiltrar.setBounds(919, 89, 89, 23);
		contentPane.add(btnfiltrar);
		
		cbFiltro = new JComboBox<String>();
		cbFiltro.setModel(new DefaultComboBoxModel<String>(new String[] {"Todos", "Aberto", "Em atendimento"}));
		cbFiltro.setBounds(672, 90, 237, 20);
		contentPane.add(cbFiltro);
		
		btnNovo = new JButton("Abrir novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AbrirChamados tela;
				try {
					tela = new AbrirChamados();					
					tela.setVisible(true);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		});
		btnNovo.setBounds(10, 87, 152, 23);
		contentPane.add(btnNovo);
	}

	void carregarTable(int id, int idUser) {
		UsuarioController controllerU = new UsuarioController();
		try {
			atendentes = controllerU.listarUsuario(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DefaultTableModel tablemodel = (DefaultTableModel) table.getModel();
		tablemodel.setRowCount(0);
		ChamadosController controller = new ChamadosController();

		try {
			chamados = controller.listarChamados(id,idUser);
			chamados.forEach((Chamados ch) -> { 		
				tablemodel.addRow(new Object[] {ch.getIdchamado(),ch.getTitulo(),ch.getUsuario().getNome_usuario(),verifica(ch.getStatus()), atendente(ch.getIdAtendente())});
			});
			table.setModel(tablemodel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String atendente(int id){
		String string = "" ;
		if (id > 0){
			for (Usuario atendente : atendentes) {
				if (atendente.getId_usuario() == id) {
					string = atendente.getNome_usuario();
				}
			}
			
		}
		return string;
	}
	
	
	public String verifica(int status){
		String string = "Aberto";
		switch (status){
			case 1:
				string = "Em atendimento"; break;
			case 2:	
				string = "Finalizado"; break;
		}
		return string;
	}
	
	public void ViewAluno(int tipo, int id){
		contentPane.remove(btnfiltrar);
		contentPane.remove(btnNovo);
		contentPane.remove(btnNewButton);
		contentPane.remove(cbFiltro);
		
		if (tipo == 2 ){
			lbl1.setText("Historico");
			carregarTable(2, id);
		} else {
			lbl1.setText("Meus chamados");
			carregarTable(-1, id);
		}
				
	} 
	
	public void historico(){
		contentPane.remove(btnfiltrar);
		contentPane.remove(btnNovo);
		contentPane.remove(btnNewButton);
		contentPane.remove(cbFiltro);		
		lbl1.setText("Historico de chamados");
		carregarTable(2, -1);
		
				
	} 
	
	
	
}


