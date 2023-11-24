import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela3 extends JFrame {
	JButton botao1 = new JButton("Continuar");
	JButton botao2 = new JButton("Sair");

	public Janela3() {
		// criação dos botões
		setLayout(null);
		botao1.setBounds(50, 300, 100, 30);
		botao2.setBounds(280, 300, 100, 30);
		add(botao1);
		add(botao2);

		// criacao do Frame
		setTitle("Interface Gráfica - Terceiro Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 400);
		getContentPane().setBackground(Color.pink);
		setLocationRelativeTo(null);
		setVisible(true);

	}
}
