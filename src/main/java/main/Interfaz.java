package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class Interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 759, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrAMisFamiliares = new JTextArea();
		txtrAMisFamiliares.setFont(new Font("Courier New", Font.PLAIN, 17));
		txtrAMisFamiliares.setText("A mis familiares mayores les gustaba burlarse de mí en las bodas, \r\ndiciendo que sería el siguiente. \r\nPero dejaron de hacerlo cuando empecé a hacer lo mismo en los funerales.\r\n\r\nMi abuelo decía que los jóvenes dependemos demasiado de la tecnología. \r\nAsí que la desconecté de la máquina de respiración asistida.\r\n\r\n¿Cuál es la diferencia entre una pizza y un niño?\r\nLa pizza no chilla cuando la metes en el horno.\r\n\r\nDoctor, ¿tendré cura?\r\nPor supuesto, cura, misa y funeral.\r\n\r\nEl humor negro es como los esclavos, hoy en día pocos tienen.");
		txtrAMisFamiliares.setBounds(10, 10, 725, 284);
		frame.getContentPane().add(txtrAMisFamiliares);
		
		JButton btnNewButton = new JButton("Si, un 10");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(48, 353, 148, 51);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Te han parecido graciosos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(248, 304, 242, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Muchisimo, te pondre un 10");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(379, 353, 333, 51);
		frame.getContentPane().add(btnNewButton_1);
	}
}
