import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pasutijumi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pasutijumi frame = new Pasutijumi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Pasutijumi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 70, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 22, 386, 196);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(180, 180, 180));
		textPane.setBackground(new Color(50, 50, 50));
		scrollPane.setViewportView(textPane);
		
		JButton btnDzstDatus = new JButton("Dzēst datus");
		btnDzstDatus.setForeground(new Color(180, 180, 180));
		btnDzstDatus.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnDzstDatus.setBackground(new Color(50, 50, 50));
		btnDzstDatus.setBounds(303, 227, 105, 23);
		contentPane.add(btnDzstDatus);
		
		JButton btnAtpaka = new JButton("Atpakaļ");
		btnAtpaka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SakumaFrame sakumaFrame = new SakumaFrame();
				sakumaFrame.setVisible(true); 
				Pasutijumi.this.dispose();
			}
		});
		btnAtpaka.setForeground(new Color(180, 180, 180));
		btnAtpaka.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAtpaka.setBackground(new Color(50, 50, 50));
		btnAtpaka.setBounds(22, 227, 81, 23);
		contentPane.add(btnAtpaka);
	}
}
