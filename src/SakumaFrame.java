import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SakumaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SakumaFrame frame = new SakumaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SakumaFrame() {
		setTitle("Picas Sistēma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 485, 280);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 201, 177));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Picērija Šermando");
		lblNewLabel.setBackground(new Color(0, 108, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(223, 0, 28));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 23));
		lblNewLabel.setBounds(0, 30, 485, 30);
		contentPane.add(lblNewLabel);
		
		JButton pasutitPicasBtn = new JButton("Pasūtīt picas");
		pasutitPicasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sutisana sutijums = new Sutisana();
				sutijums.setVisible(true);
				SakumaFrame.this.dispose();
			}
		});
		pasutitPicasBtn.setForeground(new Color(90, 149, 0));
		pasutitPicasBtn.setBackground(new Color(208, 186, 149));
		pasutitPicasBtn.setFont(new Font("Segoe UI", Font.BOLD, 16));
		pasutitPicasBtn.setBounds(175, 99, 137, 30);
		contentPane.add(pasutitPicasBtn);
		
		JButton apskatPasutBtn = new JButton("Apskatīt pasūtījumus");
		apskatPasutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pasutijumi pasutijums = new Pasutijumi();
				pasutijums.setVisible(true); 
				SakumaFrame.this.dispose();
			}
		});
		apskatPasutBtn.setForeground(new Color(90, 149, 0));
		apskatPasutBtn.setFont(new Font("Segoe UI", Font.BOLD, 16));
		apskatPasutBtn.setBackground(new Color(208, 186, 149));
		apskatPasutBtn.setBounds(135, 140, 215, 30);
		contentPane.add(apskatPasutBtn);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 469, 241);
		Image back = new ImageIcon(this.getClass().getResource("/Images/pizza_race.gif")).getImage();
		background.setIcon(new ImageIcon(back));
		contentPane.add(background);
	}
}
