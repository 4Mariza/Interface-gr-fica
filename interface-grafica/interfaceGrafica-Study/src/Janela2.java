import java.awt.Color;

import javax.swing.JFrame;

public class Janela2 extends JFrame {

	public Janela2() {
		setTitle("Interface Gráfica - Segundo Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 400);
		getContentPane().setBackground(Color.lightGray);
		setVisible(true);
	}
}
