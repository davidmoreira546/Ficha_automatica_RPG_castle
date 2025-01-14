package janela;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Atributos extends JPanel{
		
	    int sforca = 0;
	    int smagia = 0;
		int sdefesa = 0;
		int sagil = 0;
		
	public Atributos(Janela janela) {
		//atributos
		
		JPanel painel = new JPanel(new GridLayout(90,1));
		
		JLabel forcat = new JLabel("Força:"+sforca);
		JLabel magiat = new JLabel("Magia:"+smagia);
		JLabel defesat = new JLabel("Defesa:"+sdefesa);
		JLabel agilt = new JLabel("Força:"+sagil);
		
		
		//editar atributos
		JPanel painel2 = new JPanel(new GridLayout(90,1));
		JButton editarFicha = new JButton("Editar ficha");
		JButton salvar = new JButton("salvar");
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
				janela.revalidate();
				janela.repaint();
				add(painel2);
				janela.revalidate();
				janela.repaint();
			}
		});
		salvar.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					sforca += Integer.parseInt(forca.getText());
					smagia += Integer.parseInt(magia.getText());
					sdefesa += Integer.parseInt(defesa.getText());
					sagil += Integer.parseInt(agilidade.getText());
					forcat.setText("forca:"+sforca);
					magiat.setText("forca:"+smagia);
					defesat.setText("forca:"+sdefesa);
					agilt.setText("forca:"+sagil);
					removeAll();
					janela.revalidate();
					janela.repaint();
					add(painel);
					janela.revalidate();
					janela.repaint();
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(janela, "insira um valor");
				}
				
			}
		});
		
		//ediçao
		painel2.add(new JLabel("forca:"+sforca));
		painel2.add(forca);
		painel2.add(new JLabel("magia:"+smagia));
		painel2.add(magia);
		painel2.add(new JLabel("defesa:"+sdefesa));
		painel2.add(defesa);
		painel2.add(new JLabel("agilidade:"+sagil));
		painel2.add(agilidade);
		painel2.add(salvar);
		//ficha	
		painel.add(forcat);
		painel.add(testForca);
		painel.add(magiat);
		painel.add(testMagia);
		painel.add(defesat);
		painel.add(testDefesa);
		painel.add(agilt);
		painel.add(testAgil);
		painel.add(new JLabel());
		painel.add(editarFicha);
		
		add(painel);
		

	}
	
}
