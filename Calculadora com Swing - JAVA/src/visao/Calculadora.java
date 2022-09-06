package br.com.clayton.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora () {
		
		organizarLayout();
		
//		setUndecorated(true);  //Essa fun��o exclue a barra padr�o das aplica��es windons onde tem os bot�es fechar, minimizar e max
		setSize(300, 380);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(rootPane);
		setVisible(true);
		
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
