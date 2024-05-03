import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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
		contentPane.setBackground(new Color(70, 70, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Picērija Šermando");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(170, 170, 180));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(161, 32, 137, 14);
		contentPane.add(lblNewLabel);
		
		JButton pasutitPicasBtn = new JButton("Pasūtīt picas");
		pasutitPicasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sutisana sutijums = new Sutisana();
				sutijums.setVisible(true);
				SakumaFrame.this.dispose();
			}
		});
		pasutitPicasBtn.setForeground(new Color(180, 180, 180));
		pasutitPicasBtn.setBackground(new Color(50, 50, 50));
		pasutitPicasBtn.setFont(new Font("Segoe UI", Font.BOLD, 12));
		pasutitPicasBtn.setBounds(105, 146, 106, 23);
		contentPane.add(pasutitPicasBtn);
		
		JButton apskatPasutBtn = new JButton("Apskatīt pasūtījumus");
		apskatPasutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pasutijumi pasutijums = new Pasutijumi();
				pasutijums.setVisible(true); 
				SakumaFrame.this.dispose();
			}
		});
		apskatPasutBtn.setForeground(new Color(180, 180, 180));
		apskatPasutBtn.setFont(new Font("Segoe UI", Font.BOLD, 12));
		apskatPasutBtn.setBackground(new Color(50, 50, 50));
		apskatPasutBtn.setBounds(234, 146, 154, 23);
		contentPane.add(apskatPasutBtn);
	}
}
