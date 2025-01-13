package janela;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame{
	public Janela() {
		
		setSize(400,400);
		setTitle("RPG foda");
		setLayout(new GridLayout(1,222));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[]args) {
		
		Janela janela = new Janela();
		RolagemDado dados =  new RolagemDado(janela);
		Atributos atributos = new Atributos(janela);
		atributos.setLayout(new BoxLayout(atributos,BoxLayout.Y_AXIS));
		dados.setLayout(new BoxLayout(dados, BoxLayout.Y_AXIS));
		janela.add(atributos);
		janela.add(dados);
		janela.setVisible(true);
	}

}
