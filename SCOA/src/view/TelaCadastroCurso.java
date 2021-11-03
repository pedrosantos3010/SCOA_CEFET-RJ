package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import controller.CursoController;

import javax.swing.JTextArea;

public class TelaCadastroCurso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfTipo;
	private JSpinner spPeriodos;
	private JTextArea taDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCurso frame = new TelaCadastroCurso();
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
	public TelaCadastroCurso() throws ParseException{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Cadastrar Curso");
		setResizable(false);
		setBounds(100, 100, 1024, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarCurso = new JLabel("Cadastrar Curso");
		lblCadastrarCurso.setForeground(new Color(31, 58, 104));
		lblCadastrarCurso.setIcon(new ImageIcon(TelaCadastroCurso.class.getResource("/images/_007f97-removebg-preview100.png")));
		lblCadastrarCurso.setBounds(10, 11, 998, 70);
		contentPane.add(lblCadastrarCurso);
		lblCadastrarCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarCurso.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JPanel panelCadastroCurso = new JPanel();
		panelCadastroCurso.setBorder(new LineBorder(new Color(31, 58, 104), 2, true));
		panelCadastroCurso.setBounds(10, 87, 998, 474);
		contentPane.add(panelCadastroCurso);
		panelCadastroCurso.setLayout(null);
		
		JLabel lblNomeCadastroCurso = new JLabel("Nome:");
		lblNomeCadastroCurso.setForeground(new Color (122, 97, 171));
		lblNomeCadastroCurso.setBackground(new Color(31, 58, 104));
		lblNomeCadastroCurso.setBounds(10, 11, 53, 20);
		panelCadastroCurso.add(lblNomeCadastroCurso);
		lblNomeCadastroCurso.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNomeCadastroCurso.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeCadastroCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		tfNome = new JTextField();
		tfNome.setBounds(73, 13, 915, 20);
		panelCadastroCurso.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblTipoCadastroCurso = new JLabel("Tipo:");
		lblTipoCadastroCurso.setForeground(new Color (122, 97, 171));
		lblTipoCadastroCurso.setBackground(new Color(31, 58, 104));
		lblTipoCadastroCurso.setBounds(10, 42, 60, 20);
		panelCadastroCurso.add(lblTipoCadastroCurso);
		lblTipoCadastroCurso.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipoCadastroCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTipoCadastroCurso.setAlignmentX(0.5f);
		
		tfTipo = new JTextField();
		tfTipo.setBounds(73, 44, 915, 20);
		panelCadastroCurso.add(tfTipo);
		tfTipo.setColumns(10);
		
		JLabel lblQtdPeriodosCadastroCurso = new JLabel("Qtd de Per\u00EDodos:");
		lblQtdPeriodosCadastroCurso.setForeground(new Color (122, 97, 171));
		lblQtdPeriodosCadastroCurso.setBackground(new Color(31, 58, 104));
		lblQtdPeriodosCadastroCurso.setBounds(10, 73, 136, 20);
		panelCadastroCurso.add(lblQtdPeriodosCadastroCurso);
		lblQtdPeriodosCadastroCurso.setHorizontalAlignment(SwingConstants.LEFT);
		lblQtdPeriodosCadastroCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQtdPeriodosCadastroCurso.setAlignmentX(0.5f);
		
		spPeriodos = new JSpinner();
		spPeriodos.setBounds(156, 75, 40, 20);
		panelCadastroCurso.add(spPeriodos);
		
		JLabel lblDescricaoCadastroCurso = new JLabel("Descri\u00E7\u00E3o:");
		lblDescricaoCadastroCurso.setForeground(new Color (122, 97, 171));
		lblDescricaoCadastroCurso.setBackground(new Color(31, 58, 104));
		lblDescricaoCadastroCurso.setBounds(10, 104, 120, 20);
		panelCadastroCurso.add(lblDescricaoCadastroCurso);
		lblDescricaoCadastroCurso.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescricaoCadastroCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDescricaoCadastroCurso.setAlignmentX(0.5f);
		
		JButton btnLimparCadastroCurso = new JButton("Limpar");
		btnLimparCadastroCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimparCadastroCurso.setBackground(new Color (122, 97, 171));
		btnLimparCadastroCurso.setForeground(new Color(31, 58, 104));
		btnLimparCadastroCurso.setBounds(504, 413, 480, 50);
		panelCadastroCurso.add(btnLimparCadastroCurso);
		btnLimparCadastroCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnCadastrarCurso = new JButton("Cadastrar");
		btnCadastrarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int periodos = Integer.parseInt(spPeriodos.getValue().toString());
				String nome = tfNome.getText();
				String tipo = tfTipo.getText();
				String descricao = taDescricao.getText();
				
				try{
					CursoController controller = new CursoController();
					controller.cadastrarCurso(periodos, nome, tipo, descricao);
					
					limpar();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCadastrarCurso.setBackground(new Color (122, 97, 171));
		btnCadastrarCurso.setForeground(new Color(31, 58, 104));
		btnCadastrarCurso.setBounds(12, 413, 480, 50);
		panelCadastroCurso.add(btnCadastrarCurso);
		btnCadastrarCurso.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		taDescricao = new JTextArea();
		taDescricao.setBounds(10, 135, 978, 267);
		panelCadastroCurso.add(taDescricao);
		taDescricao.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
	}
	
	public void limpar(){
		spPeriodos.setValue(0);
		tfNome.setText("");
		tfTipo.setText("");
		taDescricao.setText("");
	}
	
}
