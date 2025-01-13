package janela;

import java.util.Random;
import java.awt.event.*;

import javax.swing.*;

public class RolagemDado extends JPanel {
	public RolagemDado(Janela janela) {
		
		Random dados = new Random();
		JButton d20 = new JButton("D20");
		JButton d6 = new JButton("D6");
		JButton d4 = new JButton("D4");
		
	
		d20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = dados.nextInt(1,20);
				JOptionPane.showMessageDialog(janela,new JLabel("resultado:"+resultado));			
	}
			
	});
		d6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = dados.nextInt(1,6);
				JOptionPane.showMessageDialog(janela,new JLabel("resultado:"+resultado));
	}
			
	});
		d4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = dados.nextInt(1,4);
				JOptionPane.showMessageDialog(janela,new JLabel("resultado:"+resultado));
	}
			
	});
		add(d20);
		add(d6);
		add(d4);
	}
	
}
