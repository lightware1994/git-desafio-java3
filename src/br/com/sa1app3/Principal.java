package br.com.sa1app3;

import javax.swing.JOptionPane;

import br.com.sa1aplicacao3.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double valor;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe, Grupo Empresarial");
		
		valor=Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de aviões: "));
		
		Pessoa cbo = new Pessoa();
		
		JOptionPane.showMessageDialog(null, cbo.acentos(17)*valor);
		
	}

}
