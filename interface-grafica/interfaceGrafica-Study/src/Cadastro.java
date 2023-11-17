import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Cadastro extends JFrame implements ActionListener {
	Calendar anoAtual = Calendar.getInstance();

	// criação dos botões
	JButton btnMensagem = new JButton("Mensagem");
	JButton btnLimparNome = new JButton("Limpar Campos");
	JButton btnSair = new JButton("Sair");

	// criação dos rotulos dos campos de texto
	JLabel labelNome = new JLabel("Nome");
	JLabel labelAnoNascimento = new JLabel("Ano de Nascimento");

	// criação dos campos de texto
	JTextField txtNome = new JTextField();
	JTextField txtAnoNascimento = new JTextField();

	public Cadastro() {
		btnMensagem.addActionListener(this);
		btnLimparNome.addActionListener(this);
		btnSair.addActionListener(this);

		setLayout(null);
		btnMensagem.setBounds(20, 300, 120, 30);
		btnLimparNome.setBounds(160, 300, 120, 30);
		btnSair.setBounds(300, 300, 120, 30);
		add(btnMensagem);
		add(btnLimparNome);
		add(btnSair);

		labelNome.setBounds(100, 50, 100, 20);
		labelAnoNascimento.setBounds(100, 100, 110, 20);
		add(labelNome);
		add(labelAnoNascimento);

		txtNome.setBounds(160, 50, 200, 30);
		txtAnoNascimento.setBounds(220, 100, 100, 30);
		add(txtNome);
		add(txtAnoNascimento);

		setTitle("Formulário 1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 400);
		getContentPane().setBackground(Color.pink);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMensagem) {
			int ano = anoAtual.get(Calendar.YEAR);
			int dataNascimento = Integer.parseInt(txtAnoNascimento.getText());

			if (!txtNome.getText().equals("") && !txtAnoNascimento.getText().equals("") && dataNascimento < ano) {

				String nome = txtNome.getText();
				int idade = anoAtual.get(Calendar.YEAR) - dataNascimento;
				JOptionPane.showMessageDialog(null, "Olá, " + nome + "\nSua idade é: " + idade);
			} else
				JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente.");
		}

		if (e.getSource() == btnLimparNome) {
			txtNome.setText("");
			txtAnoNascimento.setText("");
		}
		if (e.getSource() == btnSair) {
			System.exit(0);
		}
	}
}
