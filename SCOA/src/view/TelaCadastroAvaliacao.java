package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextArea;

public class TelaCadastroAvaliacao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAvaliacao frame = new TelaCadastroAvaliacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public TelaCadastroAvaliacao() throws ParseException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Cadastrar Avaliacao");
		setResizable(false);
		setBounds(100, 100, 1024, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarAvaliacao = new JLabel("Cadastrar Avalia\u00E7\u00E3o");
		lblCadastrarAvaliacao.setForeground(new Color(31, 58, 104));
		lblCadastrarAvaliacao.setIcon(new ImageIcon(TelaCadastroAvaliacao.class.getResource("/images/_007f97-removebg-preview100.png")));
		lblCadastrarAvaliacao.setBounds(10, 11, 998, 70);
		contentPane.add(lblCadastrarAvaliacao);
		lblCadastrarAvaliacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JPanel panelCadastroAvaliacao = new JPanel();
		panelCadastroAvaliacao.setBorder(new LineBorder(new Color(31, 58, 104), 2, true));
		panelCadastroAvaliacao.setBounds(10, 87, 998, 474);
		contentPane.add(panelCadastroAvaliacao);
		panelCadastroAvaliacao.setLayout(null);
		
		JButton btnLimparCadastroAvaliacao = new JButton("Limpar");
		btnLimparCadastroAvaliacao.setBackground(new Color (122, 97, 171));
		btnLimparCadastroAvaliacao.setForeground(new Color(31, 58, 104));
		btnLimparCadastroAvaliacao.setBounds(504, 413, 480, 50);
		panelCadastroAvaliacao.add(btnLimparCadastroAvaliacao);
		btnLimparCadastroAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnCadastrarAvaliacao = new JButton("Cadastrar");
		btnCadastrarAvaliacao.setBackground(new Color (122, 97, 171));
		btnCadastrarAvaliacao.setForeground(new Color(31, 58, 104));
		btnCadastrarAvaliacao.setBounds(12, 413, 480, 50);
		panelCadastroAvaliacao.add(btnCadastrarAvaliacao);
		btnCadastrarAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblTurmaCadastroAvaliacao = new JLabel("Turma:");
		lblTurmaCadastroAvaliacao.setHorizontalAlignment(SwingConstants.LEFT);
		lblTurmaCadastroAvaliacao.setForeground(new Color(122, 97, 171));
		lblTurmaCadastroAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTurmaCadastroAvaliacao.setBackground(new Color(31, 58, 104));
		lblTurmaCadastroAvaliacao.setAlignmentX(0.5f);
		lblTurmaCadastroAvaliacao.setBounds(12, 11, 59, 20);
		panelCadastroAvaliacao.add(lblTurmaCadastroAvaliacao);
		
		JComboBox<String> comboBoxTurmaCadastroAvaliacao = new JComboBox<String>();
		comboBoxTurmaCadastroAvaliacao.setBounds(81, 13, 907, 20);
		panelCadastroAvaliacao.add(comboBoxTurmaCadastroAvaliacao);
		
		JLabel lblAlunoCadastroAvaliacao = new JLabel("Aluno:");
		lblAlunoCadastroAvaliacao.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlunoCadastroAvaliacao.setForeground(new Color(122, 97, 171));
		lblAlunoCadastroAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlunoCadastroAvaliacao.setBackground(new Color(31, 58, 104));
		lblAlunoCadastroAvaliacao.setAlignmentX(0.5f);
		lblAlunoCadastroAvaliacao.setBounds(12, 42, 53, 20);
		panelCadastroAvaliacao.add(lblAlunoCadastroAvaliacao);
		
		JComboBox<String> comboBoxAlunoCadastroAvaliacao = new JComboBox<String>();
		comboBoxAlunoCadastroAvaliacao.setBounds(75, 44, 913, 20);
		panelCadastroAvaliacao.add(comboBoxAlunoCadastroAvaliacao);
		
		JLabel lblDataCadastroAvaliacao = new JLabel("Data Avalia\u00E7\u00E3o:");
		lblDataCadastroAvaliacao.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataCadastroAvaliacao.setForeground(new Color(122, 97, 171));
		lblDataCadastroAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDataCadastroAvaliacao.setBackground(new Color(31, 58, 104));
		lblDataCadastroAvaliacao.setAlignmentX(0.5f);
		lblDataCadastroAvaliacao.setBounds(12, 73, 129, 20);
		panelCadastroAvaliacao.add(lblDataCadastroAvaliacao);
		
		JFormattedTextField formattedTextFieldDataCadastroMetasPrazos = new JFormattedTextField();
		formattedTextFieldDataCadastroMetasPrazos.setBounds(151, 75, 70, 20);
		panelCadastroAvaliacao.add(formattedTextFieldDataCadastroMetasPrazos);
		formattedTextFieldDataCadastroMetasPrazos.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
		
		JLabel lblNotaTotalCadastroAvaliacao = new JLabel("Nota Total:");
		lblNotaTotalCadastroAvaliacao.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotaTotalCadastroAvaliacao.setForeground(new Color(122, 97, 171));
		lblNotaTotalCadastroAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNotaTotalCadastroAvaliacao.setBackground(new Color(31, 58, 104));
		lblNotaTotalCadastroAvaliacao.setAlignmentX(0.5f);
		lblNotaTotalCadastroAvaliacao.setBounds(12, 104, 93, 20);
		panelCadastroAvaliacao.add(lblNotaTotalCadastroAvaliacao);
		
		JSpinner spinnerNotaTotalCadastroAvaliacao = new JSpinner();
		spinnerNotaTotalCadastroAvaliacao.setBounds(115, 106, 40, 20);
		panelCadastroAvaliacao.add(spinnerNotaTotalCadastroAvaliacao);
		
		JLabel lblNotaObtidaCadastroAvaliacao = new JLabel("Nota Obtida:");
		lblNotaObtidaCadastroAvaliacao.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotaObtidaCadastroAvaliacao.setForeground(new Color(122, 97, 171));
		lblNotaObtidaCadastroAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNotaObtidaCadastroAvaliacao.setBackground(new Color(31, 58, 104));
		lblNotaObtidaCadastroAvaliacao.setAlignmentX(0.5f);
		lblNotaObtidaCadastroAvaliacao.setBounds(12, 135, 104, 20);
		panelCadastroAvaliacao.add(lblNotaObtidaCadastroAvaliacao);
		
		JSpinner spinnerNotaObtidaCadastroAvaliacao = new JSpinner();
		spinnerNotaObtidaCadastroAvaliacao.setBounds(125, 137, 40, 20);
		panelCadastroAvaliacao.add(spinnerNotaObtidaCadastroAvaliacao);
		
		JLabel lblNotaDescricaoCadastroAvaliacao = new JLabel("Descri\u00E7\u00E3o:");
		lblNotaDescricaoCadastroAvaliacao.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotaDescricaoCadastroAvaliacao.setForeground(new Color(122, 97, 171));
		lblNotaDescricaoCadastroAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNotaDescricaoCadastroAvaliacao.setBackground(new Color(31, 58, 104));
		lblNotaDescricaoCadastroAvaliacao.setAlignmentX(0.5f);
		lblNotaDescricaoCadastroAvaliacao.setBounds(12, 166, 84, 20);
		panelCadastroAvaliacao.add(lblNotaDescricaoCadastroAvaliacao);
		
		JTextArea textAreaDescricaoCadastroAvaliacao = new JTextArea();
		textAreaDescricaoCadastroAvaliacao.setBounds(12, 197, 976, 205);
		panelCadastroAvaliacao.add(textAreaDescricaoCadastroAvaliacao);
		textAreaDescricaoCadastroAvaliacao.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
	}
}