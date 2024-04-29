import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CenaBOX;
	private JTextField vards;
	private JTextField uzvards;
	private JTextField Adrese;
	private JTextField telNR;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame() {
		setTitle("Picas Sistēma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 70, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Picas papildus piedevas");
		lblNewLabel.setForeground(new Color(170, 170, 180));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(464, 31, 184, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Picas veidi");
		lblNewLabel_1.setForeground(new Color(170, 170, 180));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(278, 31, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton laukuPica = new JRadioButton("Lauku pica");
		laukuPica.setBackground(new Color(70, 70, 70));
		laukuPica.setForeground(new Color(180, 180, 180));
		laukuPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		laukuPica.setBounds(195, 52, 93, 23);
		contentPane.add(laukuPica);
		
		JRadioButton havajuPica = new JRadioButton("Havaju pica");
		havajuPica.setBackground(new Color(70, 70, 70));
		havajuPica.setForeground(new Color(180, 180, 180));
		havajuPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		havajuPica.setBounds(195, 78, 93, 23);
		contentPane.add(havajuPica);
		
		JRadioButton debeskibaPica = new JRadioButton("Debešķīgā pica");
		debeskibaPica.setBackground(new Color(70, 70, 70));
		debeskibaPica.setForeground(new Color(180, 180, 180));
		debeskibaPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		debeskibaPica.setBounds(195, 104, 109, 23);
		contentPane.add(debeskibaPica);
		
		JRadioButton mafijaPica = new JRadioButton("Mafija pica");
		mafijaPica.setBackground(new Color(70, 70, 70));
		mafijaPica.setForeground(new Color(180, 180, 180));
		mafijaPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mafijaPica.setBounds(195, 130, 109, 23);
		contentPane.add(mafijaPica);
		
		JRadioButton senuPica = new JRadioButton("Sēņu pica");
		senuPica.setBackground(new Color(70, 70, 70));
		senuPica.setForeground(new Color(180, 180, 180));
		senuPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		senuPica.setBounds(195, 156, 109, 23);
		contentPane.add(senuPica);
		
		JCheckBox skinkisPap = new JCheckBox("Šķiņķis");
		skinkisPap.setBackground(new Color(70, 70, 70));
		skinkisPap.setForeground(new Color(180, 180, 180));
		skinkisPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		skinkisPap.setBounds(502, 52, 81, 23);
		contentPane.add(skinkisPap);
		
		JCheckBox siersPap = new JCheckBox("Siers");
		siersPap.setBackground(new Color(70, 70, 70));
		siersPap.setForeground(new Color(180, 180, 180));
		siersPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		siersPap.setBounds(502, 79, 81, 23);
		contentPane.add(siersPap);
		
		JCheckBox ananassPap = new JCheckBox("Ananass");
		ananassPap.setBackground(new Color(70, 70, 70));
		ananassPap.setForeground(new Color(180, 180, 180));
		ananassPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		ananassPap.setBounds(502, 105, 81, 23);
		contentPane.add(ananassPap);
		
		JCheckBox pepperoniPap = new JCheckBox("Pepperoni");
		pepperoniPap.setBackground(new Color(70, 70, 70));
		pepperoniPap.setForeground(new Color(180, 180, 180));
		pepperoniPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		pepperoniPap.setBounds(502, 131, 81, 23);
		contentPane.add(pepperoniPap);
		
		JCheckBox bekonsPap = new JCheckBox("Bekons");
		bekonsPap.setBackground(new Color(70, 70, 70));
		bekonsPap.setForeground(new Color(180, 180, 180));
		bekonsPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		bekonsPap.setBounds(502, 156, 81, 23);
		contentPane.add(bekonsPap);
		
		CenaBOX = new JTextField();
		CenaBOX.setForeground(new Color(180, 180, 180));
		CenaBOX.setBackground(new Color(50, 50, 50));
		CenaBOX.setEditable(false);
		CenaBOX.setBounds(613, 352, 58, 20);
		contentPane.add(CenaBOX);
		CenaBOX.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cena:");
		lblNewLabel_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(557, 353, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel vardsLabel = new JLabel("Vārds:");
		vardsLabel.setForeground(new Color(170, 170, 180));
		vardsLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		vardsLabel.setBounds(25, 262, 46, 14);
		contentPane.add(vardsLabel);
		
		vards = new JTextField();
		vards.setForeground(new Color(180, 180, 180));
		vards.setBackground(new Color(50, 50, 50));
		vards.setColumns(10);
		vards.setBounds(76, 261, 103, 20);
		contentPane.add(vards);
		
		JLabel uzvardsLabel = new JLabel("Uzvārds:");
		uzvardsLabel.setForeground(new Color(170, 170, 180));
		uzvardsLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		uzvardsLabel.setBounds(25, 293, 58, 14);
		contentPane.add(uzvardsLabel);
		
		uzvards = new JTextField();
		uzvards.setForeground(new Color(180, 180, 180));
		uzvards.setBackground(new Color(50, 50, 50));
		uzvards.setColumns(10);
		uzvards.setBounds(93, 292, 86, 20);
		contentPane.add(uzvards);
		
		JLabel adreseLabel = new JLabel("Adrese:");
		adreseLabel.setForeground(new Color(170, 170, 180));
		adreseLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		adreseLabel.setBounds(25, 321, 58, 14);
		contentPane.add(adreseLabel);
		
		Adrese = new JTextField();
		Adrese.setForeground(new Color(180, 180, 180));
		Adrese.setBackground(new Color(50, 50, 50));
		Adrese.setColumns(10);
		Adrese.setBounds(93, 320, 126, 20);
		contentPane.add(Adrese);
		
		JLabel telNrLabel = new JLabel("Telefona nr.");
		telNrLabel.setForeground(new Color(170, 170, 180));
		telNrLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		telNrLabel.setBounds(25, 353, 81, 14);
		contentPane.add(telNrLabel);
		
		telNR = new JTextField();
		telNR.setForeground(new Color(180, 180, 180));
		telNR.setBackground(new Color(50, 50, 50));
		telNR.setColumns(10);
		telNR.setBounds(116, 352, 103, 20);
		contentPane.add(telNR);
		
		JButton kvitsApst = new JButton("Apstrādāt kvīti");
		kvitsApst.setForeground(new Color(180, 180, 180));
		kvitsApst.setBackground(new Color(50, 50, 50));
		kvitsApst.setFont(new Font("Segoe UI", Font.BOLD, 12));
		kvitsApst.setBounds(545, 290, 126, 23);
		contentPane.add(kvitsApst);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ēšanas vieta");
		lblNewLabel_1_1.setForeground(new Color(170, 170, 180));
		lblNewLabel_1_1.setBackground(new Color(150, 150, 150));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(25, 31, 97, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton uzVietas = new JRadioButton("Uz vietas");
		uzVietas.setBackground(new Color(70, 70, 70));
		uzVietas.setForeground(new Color(180, 180, 180));
		uzVietas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		uzVietas.setBounds(25, 52, 109, 23);
		contentPane.add(uzVietas);
		
		JRadioButton lidziNemsana = new JRadioButton("Līdzi");
		lidziNemsana.setBackground(new Color(70, 70, 70));
		lidziNemsana.setForeground(new Color(180, 180, 180));
		lidziNemsana.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lidziNemsana.setBounds(25, 78, 109, 23);
		contentPane.add(lidziNemsana);
		
		JRadioButton piegUzMajam = new JRadioButton("Piegāde uz mājām | 1,99");
		piegUzMajam.setBackground(new Color(70, 70, 70));
		piegUzMajam.setForeground(new Color(180, 180, 180));
		piegUzMajam.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		piegUzMajam.setBounds(25, 104, 153, 23);
		contentPane.add(piegUzMajam);
		
		JLabel laukuCena = new JLabel("S = 6,99; M = 8.99, L = 10.99");
		laukuCena.setForeground(new Color(180, 180, 180));
		laukuCena.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		laukuCena.setBounds(303, 56, 153, 14);
		contentPane.add(laukuCena);
		
		JLabel havajuCena = new JLabel("S = 7,56; M = 8.75, L = 11.67");
		havajuCena.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		havajuCena.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		havajuCena.setBounds(303, 82, 153, 14);
		contentPane.add(havajuCena);
		
		JLabel debeskigaCena = new JLabel("S = 6,99; M = 8.99, L = 10.99");
		debeskigaCena.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		debeskigaCena.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		debeskigaCena.setBounds(303, 108, 153, 14);
		contentPane.add(debeskigaCena);
		
		JLabel mafijaCena = new JLabel("S = 6,99; M = 8.99, L = 10.99");
		mafijaCena.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		mafijaCena.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		mafijaCena.setBounds(303, 135, 153, 14);
		contentPane.add(mafijaCena);
		
		JLabel senuCena = new JLabel("S = 6,99; M = 8.99, L = 10.99");
		senuCena.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		senuCena.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		senuCena.setBounds(303, 161, 153, 14);
		contentPane.add(senuCena);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Picas izmērs");
		lblNewLabel_1_1_1.setForeground(new Color(170, 170, 180));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBackground(new Color(150, 150, 150));
		lblNewLabel_1_1_1.setBounds(25, 145, 97, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnSmazPica = new JRadioButton("S (mazā pica)");
		rdbtnSmazPica.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		rdbtnSmazPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		rdbtnSmazPica.setBackground(new Color(70, 70, 70));
		rdbtnSmazPica.setBounds(25, 166, 109, 23);
		contentPane.add(rdbtnSmazPica);
		
		JRadioButton rdbtnMvidjPica = new JRadioButton("M (vidējā pica)");
		rdbtnMvidjPica.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		rdbtnMvidjPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		rdbtnMvidjPica.setBackground(new Color(70, 70, 70));
		rdbtnMvidjPica.setBounds(25, 192, 109, 23);
		contentPane.add(rdbtnMvidjPica);
		
		JRadioButton rdbtnLlielPica = new JRadioButton("L (lielā pica)");
		rdbtnLlielPica.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		rdbtnLlielPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		rdbtnLlielPica.setBackground(new Color(70, 70, 70));
		rdbtnLlielPica.setBounds(25, 218, 153, 23);
		contentPane.add(rdbtnLlielPica);
		
		JTextPane orderLogs = new JTextPane();
		orderLogs.setText("Pica: Lauku pica\r\nIzmērs: S\r\nPapildus piedevas: Siers\r\nĒšanas vieta: Uz vietas\r\n\r\nVārds: Adrians\r\nUzvārds: Šilders\r\nAdrese: Pils iela 15\r\nTelefona nr: 22201245\r\nCena: 8,98€");
		orderLogs.setForeground(new Color(180, 180, 180));
		orderLogs.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		orderLogs.setBackground(new Color(50, 50, 50));
		orderLogs.setBounds(241, 206, 256, 166);
		contentPane.add(orderLogs);
		
		JButton btnApstiprintPastjumu = new JButton("Apstiprināt pasūtījumu");
		btnApstiprintPastjumu.setForeground(new Color(180, 180, 180));
		btnApstiprintPastjumu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnApstiprintPastjumu.setBackground(new Color(50, 50, 50));
		btnApstiprintPastjumu.setBounds(514, 318, 157, 23);
		contentPane.add(btnApstiprintPastjumu);
		
		JLabel laukuCena_1 = new JLabel("| 2,11€");
		laukuCena_1.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		laukuCena_1.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		laukuCena_1.setBounds(589, 56, 46, 14);
		contentPane.add(laukuCena_1);
		
		JLabel laukuCena_1_1 = new JLabel("| 1,54€");
		laukuCena_1_1.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		laukuCena_1_1.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		laukuCena_1_1.setBounds(589, 83, 46, 14);
		contentPane.add(laukuCena_1_1);
		
		JLabel laukuCena_1_2 = new JLabel("| 3,16€");
		laukuCena_1_2.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		laukuCena_1_2.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		laukuCena_1_2.setBounds(589, 109, 46, 14);
		contentPane.add(laukuCena_1_2);
		
		JLabel laukuCena_1_3 = new JLabel("| 2,45€");
		laukuCena_1_3.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		laukuCena_1_3.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		laukuCena_1_3.setBounds(589, 135, 46, 14);
		contentPane.add(laukuCena_1_3);
		
		JLabel laukuCena_1_3_1 = new JLabel("| 1.87€");
		laukuCena_1_3_1.setForeground(UIManager.getColor("InternalFrame.activeBorderColor"));
		laukuCena_1_3_1.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		laukuCena_1_3_1.setBounds(589, 161, 46, 14);
		contentPane.add(laukuCena_1_3_1);
	}
}
