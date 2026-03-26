import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GuiGit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiGit frame = new GuiGit();
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
	public GuiGit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMaster = new JButton("Hola desde el master");
		btnMaster.setBounds(70, 89, 151, 23);
		contentPane.add(btnMaster);
		
		JButton btnNewButton = new JButton("empanedado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde la rama de alex");
			}
		});
		btnNewButton.setBounds(92, 149, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton BtnJosh = new JButton("Boton Josh");
		BtnJosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola esta es la rama de Josh");
			}
		});
		BtnJosh.setFont(new Font("STLiti", Font.PLAIN, 21));
		BtnJosh.setBounds(212, 150, 151, 42);
		contentPane.add(BtnJosh);
		
		JButton btnBotonNick = new JButton("Boton Nick");
		btnBotonNick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola esta es la rama de Nick");
			}
		});
		btnBotonNick.setBounds(275, 89, 88, 22);
		contentPane.add(btnBotonNick);
		
		
		

	}
}
