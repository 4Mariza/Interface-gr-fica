import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
	

	// criação dos botões
	private JButton btn1 = new JButton("0");
	private JButton btn2 = new JButton("1");
	private JButton btn3 = new JButton("2");
	private JButton btn4 = new JButton("3");
	private JButton btn5 = new JButton("4");
	private JButton btn6 = new JButton("5");
	private JButton btn7 = new JButton("6");
	private JButton btn8 = new JButton("7");
	private JButton btn9 = new JButton("8");
	private JButton btn10 = new JButton("9");
	private JButton soma = new JButton("+");
	private JButton igual = new JButton("=");
	private JButton subtracao = new JButton("-");
	private JButton multiplicacao = new JButton("x");
	private JButton divisao = new JButton("/");
	
	 private JTextField visor = new JTextField();
	
	
	public Calculadora() {
		btn1.addActionListener(this);
		
		setLayout(null);
		btn1.setBounds(180, 340, 90, 50);
		btn2.setBounds(60, 270, 90, 50);
		btn3.setBounds(180, 270, 90, 50);
		btn4.setBounds(300, 270, 90, 50);
		btn5.setBounds(60, 200, 90, 50);
		btn6.setBounds(180, 200, 90, 50);
		btn7.setBounds(300, 200, 90, 50);
		btn8.setBounds(60, 130, 90, 50);
		btn9.setBounds(180, 130, 90, 50);
		btn10.setBounds(300, 130, 90, 50);
		
		igual.setBounds(420, 340, 90, 50);
		soma.setBounds(420, 270, 90, 50);
		subtracao.setBounds(420, 200, 90, 50);
		multiplicacao.setBounds(420, 130, 90, 50);
		divisao.setBounds(420, 60, 90, 50);
		
		visor.setBounds(60, 60 , 330, 50);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn10);
		add(soma);
		add(igual);
		add(subtracao);
		add(multiplicacao);
		add(divisao);
		add(visor);
		
		setTitle("Calculadora Gráfica");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550, 490);
		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			visor.setText(btn1.getText());
		}
	}
}
