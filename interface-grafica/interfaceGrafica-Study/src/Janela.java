import java.awt.Color;
import javax.swing.JFrame;

public class Janela {

	public Janela () {
		JFrame form = new JFrame();
		form.setTitle("Interface Gráfica - Primeiro Form");
		form.setSize(450, 400);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setResizable(false);
		form.setLocationRelativeTo(null);
		form.getContentPane().setBackground(Color.orange);
		form.setVisible(true);
	}
}
