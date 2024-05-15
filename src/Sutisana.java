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

	public Sutisana() {
		setTitle("Picas Sistēma");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 201, 177));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ButtonGroup picasIzmers = new ButtonGroup();
		ButtonGroup picasMerces = new ButtonGroup();
		ButtonGroup esanasVieta = new ButtonGroup();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton merceKecups = new JRadioButton("Kečups | 1,00€");
		merceKecups.setBackground(new Color(208, 186, 149));
		merceKecups.setForeground(new Color(90, 149, 0));
		merceKecups.setFont(new Font("Segoe UI", Font.BOLD, 13));
		merceKecups.setBounds(514, 47, 126, 23);
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
		merceBBQ.setBackground(new Color(208, 186, 149));
		merceBBQ.setForeground(new Color(90, 149, 0));
		merceBBQ.setFont(new Font("Segoe UI", Font.BOLD, 13));
		merceBBQ.setBounds(514, 73, 126, 23);
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
		merceMajon.setBackground(new Color(208, 186, 149));
		merceMajon.setForeground(new Color(90, 149, 0));
		merceMajon.setFont(new Font("Segoe UI", Font.BOLD, 13));
		merceMajon.setBounds(514, 99, 139, 23);
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
		skinkisPap.setBackground(new Color(208, 186, 149));
		skinkisPap.setForeground(new Color(90, 149, 0));
		skinkisPap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		skinkisPap.setBounds(263, 73, 81, 23);
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
		siersPap.setBackground(new Color(208, 186, 149));
		siersPap.setForeground(new Color(90, 149, 0));
		siersPap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		siersPap.setBounds(263, 99, 81, 23);
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
		ananassPap.setBackground(new Color(208, 186, 149));
		ananassPap.setForeground(new Color(90, 149, 0));
		ananassPap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		ananassPap.setBounds(263, 125, 81, 23);
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
		pepperoniPap.setBackground(new Color(208, 186, 149));
		pepperoniPap.setForeground(new Color(90, 149, 0));
		pepperoniPap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		pepperoniPap.setBounds(346, 73, 93, 23);
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
		bekonsPap.setBackground(new Color(208, 186, 149));
		bekonsPap.setForeground(new Color(90, 149, 0));
		bekonsPap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		bekonsPap.setBounds(346, 98, 81, 23);
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
		senesPap.setForeground(new Color(90, 149, 0));
		senesPap.setFont(new Font("Segoe UI", Font.BOLD, 13));
		senesPap.setBackground(new Color(208, 186, 149));
		senesPap.setBounds(346, 125, 81, 23);
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
		CenaBOX.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CenaBOX.setText("0,00€");
		CenaBOX.setForeground(new Color(90, 149, 0));
		CenaBOX.setBackground(new Color(208, 186, 149));
		CenaBOX.setEditable(false);
		CenaBOX.setBounds(595, 352, 58, 20);
		contentPane.add(CenaBOX);
		CenaBOX.setColumns(10);
		
		JLabel cenaLabel = new JLabel("Cena:");
		cenaLabel.setForeground(new Color(211, 82, 1));
		cenaLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		cenaLabel.setBounds(544, 353, 46, 14);
		contentPane.add(cenaLabel);
		
		JLabel vardsLabel = new JLabel("Vārds:");
		vardsLabel.setForeground(new Color(0, 108, 50));
		vardsLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		vardsLabel.setBounds(25, 262, 46, 14);
		contentPane.add(vardsLabel);
		
		vards = new JTextField();
		vards.setFont(new Font("Segoe UI", Font.BOLD, 12));
		vards.setForeground(new Color(90, 149, 0));
		vards.setBackground(new Color(208, 186, 149));
		vards.setColumns(10);
		vards.setBounds(76, 261, 103, 20);
		contentPane.add(vards);
		
		JLabel uzvardsLabel = new JLabel("Uzvārds:");
		uzvardsLabel.setForeground(new Color(0, 108, 50));
		uzvardsLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		uzvardsLabel.setBounds(25, 293, 58, 14);
		contentPane.add(uzvardsLabel);
		
		uzvards = new JTextField();
		uzvards.setFont(new Font("Segoe UI", Font.BOLD, 12));
		uzvards.setForeground(new Color(90, 149, 0));
		uzvards.setBackground(new Color(208, 186, 149));
		uzvards.setColumns(10);
		uzvards.setBounds(93, 292, 86, 20);
		contentPane.add(uzvards);
		
		JLabel adreseLabel = new JLabel("Adrese:");
		adreseLabel.setForeground(new Color(0, 108, 50));
		adreseLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		adreseLabel.setBounds(25, 321, 58, 14);
		contentPane.add(adreseLabel);
		
		Adrese = new JTextField();
		Adrese.setFont(new Font("Segoe UI", Font.BOLD, 12));
		Adrese.setForeground(new Color(90, 149, 0));
		Adrese.setBackground(new Color(208, 186, 149));
		Adrese.setColumns(10);
		Adrese.setBounds(93, 320, 126, 20);
		contentPane.add(Adrese);
		
		JLabel telNrLabel = new JLabel("Telefona nr.");
		telNrLabel.setForeground(new Color(0, 108, 50));
		telNrLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		telNrLabel.setBounds(25, 353, 81, 14);
		contentPane.add(telNrLabel);
		
		telNR = new JTextField() {
			private static final long serialVersionUID = 1L;

			@Override
		    public void replaceSelection(String text) {
				// Var tikai ciparus un plusiņu
		        if (!text.matches("[0-9+]")) {
		            return;
		        }
		        // 12 Simbolu garums
		        if (telNR.getText().length() >= 12) {
		            return;
		        }
		        // Aizstāj tekstu
		        super.replaceSelection(text);
		    }
		};

		telNR.setFont(new Font("Segoe UI", Font.BOLD, 12));
		telNR.setText("+371");
		telNR.setForeground(new Color(90, 149, 0));
		telNR.setBackground(new Color(208, 186, 149));
		telNR.setColumns(10);
		telNR.setBounds(116, 352, 103, 20);
		contentPane.add(telNR);

		
		JRadioButton uzVietas = new JRadioButton("Uz vietas");
		uzVietas.setBackground(new Color(208, 186, 149));
		uzVietas.setForeground(new Color(90, 149, 0));
		uzVietas.setFont(new Font("Segoe UI", Font.BOLD, 13));
		uzVietas.setBounds(514, 195, 94, 23);
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
		lidziNemsana.setBackground(new Color(208, 186, 149));
		lidziNemsana.setForeground(new Color(90, 149, 0));
		lidziNemsana.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lidziNemsana.setBounds(514, 169, 71, 23);
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
		
		JRadioButton piegUzMajam1 = new JRadioButton("Uz mājām  | 2,00€");
		piegUzMajam1.setBackground(new Color(208, 186, 149));
		piegUzMajam1.setForeground(new Color(90, 149, 0));
		piegUzMajam1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		piegUzMajam1.setBounds(514, 220, 139, 23);
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
		
		JRadioButton mazPica = new JRadioButton("S (mazā pica) | 6,50€");
		mazPica.setForeground(new Color(90, 149, 0));
		mazPica.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mazPica.setBackground(new Color(208, 186, 149));
		mazPica.setBounds(25, 54, 154, 23);
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
		vidPica.setForeground(new Color(90, 149, 0));
		vidPica.setFont(new Font("Segoe UI", Font.BOLD, 13));
		vidPica.setBackground(new Color(208, 186, 149));
		vidPica.setBounds(25, 80, 170, 23);
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
		lielPica.setForeground(new Color(90, 149, 0));
		lielPica.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lielPica.setBackground(new Color(208, 186, 149));
		lielPica.setBounds(25, 104, 154, 23);
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
		
		JButton btnApstiprintPastjumu = new JButton("Iesniegt pasūtījumu");
		btnApstiprintPastjumu.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String picasIzmStr = "";
		        if (mazPica.isSelected()) {
		            picasIzmStr = "S (mazā pica) | 6,50€";
		        } else if (vidPica.isSelected()) {
		            picasIzmStr = "M (vidējā pica) | 8,50€";
		        } else if (lielPica.isSelected()) {
		            picasIzmStr = "L (lielā pica) | 10,50€";
		        }

		        String piedevasStr = "";
		        if (skinkisPap.isSelected()) {
		            piedevasStr += "Šķiņķis, ";
		        }
		        if (siersPap.isSelected()) {
		            piedevasStr += "Siers, ";
		        }
		        if (pepperoniPap.isSelected()) {
		        	piedevasStr += "Pepperoni, ";
		        }
		        if (bekonsPap.isSelected()) {
		        	piedevasStr += "Bekons, ";
		        }
		        if (ananassPap.isSelected()) {
		        	piedevasStr += "Ananass, ";
		        }
		        if (senesPap.isSelected()) {
		        	piedevasStr += "Sēnes, ";
		        }

		        String merceStr = "";
		        if (merceKecups.isSelected()) {
		            merceStr = "Kečups | 1,00€";
		        } else if (merceBBQ.isSelected()) {
		            merceStr = "BBQ | 1,00€";
		        } else if (merceMajon.isSelected()) {
		            merceStr = "Majonēze | 1,00€";
		        }

		        String esanasVietaStr = "";
		        if (uzVietas.isSelected()) {
		            esanasVietaStr = "Uz vietas | 0,00€";
		        } else if (lidziNemsana.isSelected()) {
		            esanasVietaStr = "Līdzi | 0,00€";
		        } else if (piegUzMajam1.isSelected()) {
		            esanasVietaStr = "Piegāde uz mājām | 2,00€";
		        }
		        
		        Silders_pica pasutijums = new Silders_pica(vards.getText(), uzvards.getText(), Adrese.getText(), telNR.getText(), Double.parseDouble(CenaBOX.getText().replace("€", "").replace(",", ".")), picasIzmStr, piedevasStr, merceStr, esanasVietaStr);
		        pasutijums.saglPasutijumu();
		    }
		});

		btnApstiprintPastjumu.setForeground(new Color(0, 108, 50));
		btnApstiprintPastjumu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnApstiprintPastjumu.setBackground(new Color(208, 186, 149));
		btnApstiprintPastjumu.setBounds(496, 318, 157, 23);
		contentPane.add(btnApstiprintPastjumu);
		
		JLabel katraPiedeva = new JLabel("Katra piedeva: +0,50€");
		katraPiedeva.setForeground(new Color(0, 108, 50));
		katraPiedeva.setFont(new Font("Tahoma", Font.BOLD, 12));
		katraPiedeva.setBounds(273, 51, 170, 14);
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
		btnAtpakaUzSkumu.setForeground(new Color(0, 108, 50));
		btnAtpakaUzSkumu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAtpakaUzSkumu.setBackground(new Color(208, 186, 149));
		btnAtpakaUzSkumu.setBounds(513, 290, 139, 23);
		contentPane.add(btnAtpakaUzSkumu);
		
		JLabel Background = new JLabel("");
		Background.setBounds(247, 166, 226, 206);
		Image back = new ImageIcon(this.getClass().getResource("/Images/dancing_pizza.gif")).getImage();
		Background.setIcon(new ImageIcon(back));
		contentPane.add(Background);
		
		RoundedPanel izmPanel = new RoundedPanel(20);
		izmPanel.setBackground(new Color(208, 186, 149));
		izmPanel.setBounds(17, 22, 181, 115);
		contentPane.add(izmPanel);
		
				
				JLabel izmeruLabel = new JLabel("Picas izmērs");
				izmPanel.add(izmeruLabel);
				izmeruLabel.setForeground(new Color(0, 108, 50));
				izmeruLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
				izmeruLabel.setBackground(new Color(150, 150, 150));
		
		RoundedPanel piedevasPanel = new RoundedPanel(20);
		piedevasPanel.setBackground(new Color(208, 186, 149));
		piedevasPanel.setBounds(254, 22, 186, 137);
		contentPane.add(piedevasPanel);
		
		JLabel piedevasLabel = new JLabel("Picas piedevas");
		piedevasPanel.add(piedevasLabel);
		piedevasLabel.setForeground(new Color(0, 108, 50));
		piedevasLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		RoundedPanel mercesPanel = new RoundedPanel(20);
		mercesPanel.setBackground(new Color(208, 186, 149));
		mercesPanel.setBounds(500, 22, 157, 108);
		contentPane.add(mercesPanel);
		
		JLabel picasMercLabel = new JLabel("Picas mērces");
		mercesPanel.add(picasMercLabel);
		picasMercLabel.setForeground(new Color(0, 108, 50));
		picasMercLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		RoundedPanel vietaPanel = new RoundedPanel(20);
		vietaPanel.setBackground(new Color(208, 186, 149));
		vietaPanel.setBounds(500, 139, 157, 115);
		contentPane.add(vietaPanel);
		
		JLabel vietaLabel = new JLabel("Ēšanas vieta");
		vietaPanel.add(vietaLabel);
		vietaLabel.setForeground(new Color(0, 108, 50));
		vietaLabel.setBackground(new Color(150, 150, 150));
		vietaLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
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
