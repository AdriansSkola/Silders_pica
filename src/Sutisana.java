import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Sutisana extends JFrame {

	private static final long serialVersionUID = 1L;
	public double  picasIzm = 0, Piedevas = 0, Piegade = 0, Merce = 0, Cena;
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
					Sutisana frame = new Sutisana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*
	 * krāsas:
	 * #E4B455
	 * #AF672D
	 * #886839
	 * #58483A
	 * #597718
	 * #770D15
	 * #D3B786
	 */

	public Sutisana() {
		setTitle("Picas Sistēma");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 70, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ButtonGroup picasIzmers = new ButtonGroup();
		ButtonGroup picasMerces = new ButtonGroup();
		ButtonGroup esanasVieta = new ButtonGroup();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel piedevasLabel = new JLabel("Picas piedevas");
		piedevasLabel.setForeground(new Color(170, 170, 180));
		piedevasLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		piedevasLabel.setBounds(296, 26, 111, 14);
		contentPane.add(piedevasLabel);
		
		JLabel picasMercLabel = new JLabel("Picas mērces");
		picasMercLabel.setForeground(new Color(170, 170, 180));
		picasMercLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		picasMercLabel.setBounds(514, 26, 103, 14);
		contentPane.add(picasMercLabel);
		
		JRadioButton merceKecups = new JRadioButton("Kečups | 1,00€");
		merceKecups.setBackground(new Color(70, 70, 70));
		merceKecups.setForeground(new Color(180, 180, 180));
		merceKecups.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		merceKecups.setBounds(514, 47, 103, 23);
		picasMerces.add(merceKecups);
		merceKecups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(merceKecups.isSelected()) {
					Merce = 1.00;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(merceKecups);
		
		JRadioButton merceBBQ = new JRadioButton("BBQ  | 1,00€");
		merceBBQ.setBackground(new Color(70, 70, 70));
		merceBBQ.setForeground(new Color(180, 180, 180));
		merceBBQ.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		merceBBQ.setBounds(514, 73, 93, 23);
		picasMerces.add(merceBBQ);
		merceBBQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(merceBBQ.isSelected()) {
					Merce = 1.00;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(merceBBQ);
		
		JRadioButton merceMajon = new JRadioButton("Majonēze  | 1,00€");
		merceMajon.setBackground(new Color(70, 70, 70));
		merceMajon.setForeground(new Color(180, 180, 180));
		merceMajon.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		merceMajon.setBounds(514, 99, 120, 23);
		picasMerces.add(merceMajon);
		merceMajon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(merceMajon.isSelected()) {
					Merce = 1.00;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(merceMajon);
		
		JCheckBox skinkisPap = new JCheckBox("Šķiņķis");
		skinkisPap.setBackground(new Color(70, 70, 70));
		skinkisPap.setForeground(new Color(180, 180, 180));
		skinkisPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		skinkisPap.setBounds(274, 73, 81, 23);
		skinkisPap.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(skinkisPap.isSelected()) {
					Piedevas = Piedevas + 0.50;
				} else {
					Piedevas = Piedevas - 0.50;
				}
			CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
			}
		});
		contentPane.add(skinkisPap);
		
		JCheckBox siersPap = new JCheckBox("Siers");
		siersPap.setBackground(new Color(70, 70, 70));
		siersPap.setForeground(new Color(180, 180, 180));
		siersPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		siersPap.setBounds(274, 99, 81, 23);
		siersPap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(siersPap.isSelected()) {
						Piedevas = Piedevas + 0.50;
					} else {
						Piedevas = Piedevas - 0.50;
					}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(siersPap);
		
		JCheckBox ananassPap = new JCheckBox("Ananass");
		ananassPap.setBackground(new Color(70, 70, 70));
		ananassPap.setForeground(new Color(180, 180, 180));
		ananassPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		ananassPap.setBounds(274, 125, 81, 23);
		ananassPap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ananassPap.isSelected()) {
						Piedevas = Piedevas + 0.50;
					} else {
						Piedevas = Piedevas - 0.50;
					}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(ananassPap);
		
		JCheckBox pepperoniPap = new JCheckBox("Pepperoni");
		pepperoniPap.setBackground(new Color(70, 70, 70));
		pepperoniPap.setForeground(new Color(180, 180, 180));
		pepperoniPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		pepperoniPap.setBounds(357, 73, 81, 23);
		pepperoniPap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pepperoniPap.isSelected()) {
						Piedevas = Piedevas + 0.50;
					} else {
						Piedevas = Piedevas - 0.50;
					}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(pepperoniPap);
		
		JCheckBox bekonsPap = new JCheckBox("Bekons");
		bekonsPap.setBackground(new Color(70, 70, 70));
		bekonsPap.setForeground(new Color(180, 180, 180));
		bekonsPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		bekonsPap.setBounds(357, 98, 81, 23);
		bekonsPap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bekonsPap.isSelected()) {
						Piedevas = Piedevas + 0.50;
					} else {
						Piedevas = Piedevas - 0.50;
					}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(bekonsPap);

		JCheckBox senesPap = new JCheckBox("Sēnes");
		senesPap.setForeground(new Color(180, 180, 180));
		senesPap.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		senesPap.setBackground(new Color(70, 70, 70));
		senesPap.setBounds(357, 125, 81, 23);
		senesPap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(senesPap.isSelected()) {
						Piedevas = Piedevas + 0.50;
					} else {
						Piedevas = Piedevas - 0.50;
					}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(senesPap);
		
		CenaBOX = new JTextField();
		CenaBOX.setText("0,00€");
		CenaBOX.setForeground(new Color(180, 180, 180));
		CenaBOX.setBackground(new Color(50, 50, 50));
		CenaBOX.setEditable(false);
		CenaBOX.setBounds(613, 352, 58, 20);
		contentPane.add(CenaBOX);
		CenaBOX.setColumns(10);
		
		JLabel cenaLabel = new JLabel("Cena:");
		cenaLabel.setForeground(new Color(255, 128, 0));
		cenaLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		cenaLabel.setBounds(562, 353, 46, 14);
		contentPane.add(cenaLabel);
		
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
		telNR.setText("+371");
		telNR.setForeground(new Color(180, 180, 180));
		telNR.setBackground(new Color(50, 50, 50));
		telNR.setColumns(10);
		telNR.setBounds(116, 352, 103, 20);
		contentPane.add(telNR);
		
		JLabel vietaLabel = new JLabel("Ēšanas vieta");
		vietaLabel.setForeground(new Color(170, 170, 180));
		vietaLabel.setBackground(new Color(150, 150, 150));
		vietaLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		vietaLabel.setBounds(514, 148, 97, 14);
		contentPane.add(vietaLabel);
		
		JRadioButton uzVietas = new JRadioButton("Uz vietas");
		uzVietas.setBackground(new Color(70, 70, 70));
		uzVietas.setForeground(new Color(180, 180, 180));
		uzVietas.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		uzVietas.setBounds(514, 195, 109, 23);
		esanasVieta.add(uzVietas);
		uzVietas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(uzVietas.isSelected()) {
					Piegade = 0;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(uzVietas);
		JRadioButton piegUzMajam = new JRadioButton("Piegāde uz mājām +1,99€");
		piegUzMajam.setBackground(new Color(70, 70, 70));
		piegUzMajam.setForeground(new Color(180, 180, 180));
		piegUzMajam.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		piegUzMajam.setBounds(514, 169, 161, 23);
		JRadioButton lidziNemsana = new JRadioButton("Līdzi");
		lidziNemsana.setBackground(new Color(70, 70, 70));
		lidziNemsana.setForeground(new Color(180, 180, 180));
		lidziNemsana.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lidziNemsana.setBounds(514, 169, 109, 23);
		esanasVieta.add(lidziNemsana);
		lidziNemsana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lidziNemsana.isSelected()) {
					Piegade = 0;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(lidziNemsana);
		
		JRadioButton piegUzMajam1 = new JRadioButton("Piegāde uz mājām  | 2,00€");
		piegUzMajam1.setBackground(new Color(70, 70, 70));
		piegUzMajam1.setForeground(new Color(180, 180, 180));
		piegUzMajam1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		piegUzMajam1.setBounds(514, 220, 161, 23);
		esanasVieta.add(piegUzMajam1);
		piegUzMajam1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(piegUzMajam1.isSelected()) {
					Piegade = 2.00;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(piegUzMajam1);
		
		JLabel izmeruLabel = new JLabel("Picas izmērs");
		izmeruLabel.setForeground(new Color(170, 170, 180));
		izmeruLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		izmeruLabel.setBackground(new Color(150, 150, 150));
		izmeruLabel.setBounds(37, 27, 97, 14);
		contentPane.add(izmeruLabel);
		
		JRadioButton mazPica = new JRadioButton("S (mazā pica) | 6,50€");
		mazPica.setForeground(new Color(180, 180, 180));
		mazPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mazPica.setBackground(new Color(70, 70, 70));
		mazPica.setBounds(25, 48, 131, 23);
		picasIzmers.add(mazPica);
		mazPica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mazPica.isSelected()) {
					picasIzm = 6.50;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(mazPica);
		
		JRadioButton vidPica = new JRadioButton("M (vidējā pica) | 8,50€");
		vidPica.setForeground(new Color(180, 180, 180));
		vidPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		vidPica.setBackground(new Color(70, 70, 70));
		vidPica.setBounds(25, 74, 139, 23);
		picasIzmers.add(vidPica);
		vidPica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vidPica.isSelected()) {
					picasIzm = 8.50;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(vidPica);
		
		JRadioButton lielPica = new JRadioButton("L (lielā pica) | 10,50€");
		lielPica.setForeground(new Color(180, 180, 180));
		lielPica.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lielPica.setBackground(new Color(70, 70, 70));
		lielPica.setBounds(25, 100, 131, 23);
		picasIzmers.add(lielPica);
		lielPica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lielPica.isSelected()) {
					picasIzm = 10.50;
				}
				CenaBOX.setText(String.format("%.2f",(picasIzm+Piedevas+Merce+Piegade))+"€");
				}
			});
		contentPane.add(lielPica);
		
		JTextPane orderLogs = new JTextPane();
		orderLogs.setEditable(false);
		orderLogs.setText("Pica: Lauku pica\r\nIzmērs: S\r\nPapildus piedevas: Siers\r\nĒšanas vieta: Uz vietas\r\n\r\nVārds: Adrians\r\nUzvārds: Šilders\r\nAdrese: Pils iela 15\r\nTelefona nr: 22201245\r\nCena: 8,98€");
		orderLogs.setForeground(new Color(180, 180, 180));
		orderLogs.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		orderLogs.setBackground(new Color(50, 50, 50));
		orderLogs.setBounds(239, 197, 256, 168);
		contentPane.add(orderLogs);
		
		JButton btnApstiprintPastjumu = new JButton("Iesniegt pasūtījumu");
		btnApstiprintPastjumu.setForeground(new Color(180, 180, 180));
		btnApstiprintPastjumu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnApstiprintPastjumu.setBackground(new Color(50, 50, 50));
		btnApstiprintPastjumu.setBounds(514, 318, 157, 23);
		contentPane.add(btnApstiprintPastjumu);
		
		JLabel katraPiedeva = new JLabel("Katra piedeva: +0,50€");
		katraPiedeva.setForeground(new Color(170, 170, 180));
		katraPiedeva.setFont(new Font("Tahoma", Font.BOLD, 12));
		katraPiedeva.setBounds(284, 50, 170, 14);
		contentPane.add(katraPiedeva);
		
		JLabel picasIzm = new JLabel("");
		picasIzm.setBounds(37, 140, 103, 103);
		//Image image = new ImageIcon(this.getClass().getResource("/Images/test.png")).getImage();
		//picasIzm.setIcon(new ImageIcon(image));
		contentPane.add(picasIzm);
		
		JButton btnAtpakaUzSkumu = new JButton("Atpakaļ uz sākumu");
		btnAtpakaUzSkumu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SakumaFrame sakumaFrame = new SakumaFrame();
				sakumaFrame.setVisible(true); 
				Sutisana.this.dispose();
			}
		});
		btnAtpakaUzSkumu.setForeground(new Color(180, 180, 180));
		btnAtpakaUzSkumu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAtpakaUzSkumu.setBackground(new Color(50, 50, 50));
		btnAtpakaUzSkumu.setBounds(531, 290, 139, 23);
		contentPane.add(btnAtpakaUzSkumu);
		
		mazPica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Image image = new ImageIcon(this.getClass().getResource("/Images/pizza_maz.png")).getImage();
				picasIzm.setIcon(new ImageIcon(image));
			}
		});
		
		vidPica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Image image = new ImageIcon(this.getClass().getResource("/Images/pizza_vid.png")).getImage();
				picasIzm.setIcon(new ImageIcon(image));
			}
		});
		
		lielPica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Image image = new ImageIcon(this.getClass().getResource("/Images/pizza_liela.png")).getImage();
				picasIzm.setIcon(new ImageIcon(image));
			}
		});
	}
}
