import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Imc extends JFrame implements ActionListener {
	NumberFormat formatador = new DecimalFormat("0.00");

	JButton btnCalcular = new JButton("Calcular");
	JButton btnLimpar = new JButton("Limpar Campos");
	JButton btnSair = new JButton("Sair");

	JLabel labelPeso = new JLabel("Peso");
	JLabel labelAltura = new JLabel("Altura");

	JTextField txtPeso = new JTextField();
	JTextField txtAltura = new JTextField();

	public Imc() {
		btnCalcular.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnSair.addActionListener(this);

		setLayout(null);
		btnCalcular.setBounds(20, 300, 120, 30);
		btnLimpar.setBounds(160, 300, 120, 30);
		btnSair.setBounds(300, 300, 120, 30);
		add(btnCalcular);
		add(btnLimpar);
		add(btnSair);

		labelAltura.setBounds(100, 50, 100, 20);
		labelPeso.setBounds(100, 100, 110, 20);
		add(labelAltura);
		add(labelPeso);

		txtAltura.setBounds(160, 50, 200, 30);
		txtPeso.setBounds(160, 100, 200, 30);
		add(txtAltura);
		add(txtPeso);

		setTitle("Cálculo do IMC");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 400);
		getContentPane().setBackground(Color.pink);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalcular) {
			if (!txtAltura.getText().equals("") && !txtPeso.getText().equals("")) {
				double peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
				double altura = Double.parseDouble(txtAltura.getText().replace(",", "."));

				double imc = peso / (Math.pow(altura, 2));

				String status = "";
				if (imc < 18.5)
					status = "Abaixo do peso";
				if (imc < 24.9)
					status = "Peso ideal";
				if (imc < 29.9)
					status = "Levemente acima do peso";
				if (imc < 34.9)
					status = "Obesidade Grau I";
				if (imc < 39.9)
					status = "Obesidade Grau II";
				if (imc >= 40)
					status = "Obesidade Grau III";

				JOptionPane.showMessageDialog(null, "Seu imc é: " + formatador.format(imc) + "\nStatus: " + status);
			} else
				JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente.");
		}
		if (e.getSource() == btnLimpar) {
			txtAltura.setText("");
			txtPeso.setText("");
		}
		if (e.getSource() == btnSair)
			System.exit(0);
	}
}
