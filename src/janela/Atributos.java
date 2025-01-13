package janela;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Atributos extends JPanel{
	public Atributos(Janela janela) {
		//atributos
		int sforca = 0;
		int smagia = 0;
		int sdefesa = 0;
		int sagil = 0;
		JLabel forcat = new JLabel("Força:"+sforca);
		JLabel magiat = new JLabel("Magia:"+smagia);
		JLabel defesat = new JLabel("Defesa:"+sdefesa);
		JLabel agilt = new JLabel("Força:"+sagil);
		
		//editar atributos
		JButton editarFicha = new JButton("Editar ficha");
		JTextField forca = new JTextField(2);
		JTextField magia = new JTextField(2);
		JTextField defesa = new JTextField(2);
		JTextField agilidade = new JTextField(2);
		//teste de atributos
		Random dados = new Random();
		JButton testForca = new JButton("teste");
		JButton testMagia = new JButton("teste");
		JButton testDefesa = new JButton("teste");
		JButton testAgil = new JButton("teste");
		//eventos 
		testForca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				int resultado = (dados.nextInt(1,20)+sforca);
				JOptionPane.showMessageDialog(janela,new JLabel("resultado:"+resultado));					
	}
			
	});
		
		testMagia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = (dados.nextInt(1,20)+smagia);
				JOptionPane.showMessageDialog(janela,new JLabel("resultado:"+resultado));		
	}
			
	});
		testDefesa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = (dados.nextInt(20)+sdefesa);
				JOptionPane.showMessageDialog(janela,new JLabel("resultado:"+resultado));	
						
	}
			
	});
		testAgil.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = (dados.nextInt(20)+sagil);
				JOptionPane.showMessageDialog(janela,new JLabel("resultado:"+resultado));					
	}
			
	});
		editarFicha.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				
				removeAll();
				add(forcat);
				add(forca);
				add(magiat);
				add(magia);
				add(defesat);
				add(defesa);
				add(agilt);
				add(agilidade);
			}
		});
		
		add(forcat);
		add(testForca);
		add(magiat);
		add(testMagia);
		add(defesat);
		add(testDefesa);
		add(agilt);
		add(testAgil);
		
		add(editarFicha);
		
		
			
		
			
		
		
		
		
		
		
	}
	
}
