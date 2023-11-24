import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Janela4 extends JFrame implements ActionListener {
	JButton botao1 = new JButton("Mensagem 1");
	JButton botao2 = new JButton("Mensagem 2");
	JButton botao3 = new JButton("Sair");

	public Janela4() {
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);

		setLayout(null);
		botao1.setBounds(40, 300, 120, 30);
		botao2.setBounds(180, 300, 120, 30);
		botao3.setBounds(315, 300, 120, 30);
		add(botao1);
		add(botao2);
		add(botao3);

		setTitle("Interface Gráfica - Quarto Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		getContentPane().setBackground(Color.pink);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao1) {
			JOptionPane.showMessageDialog(null, "olaaa");
		}
		if (e.getSource() == botao2) {
			JOptionPane.showMessageDialog(null, "oiiii");
		}
		if (e.getSource() == botao3) {
			System.exit(0);
		}
	}

}
