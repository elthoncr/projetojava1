package cursojava.mediaAluno;

import javax.swing.JOptionPane;

public class EntradaDeDadosJava {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de Carros: ");
		String pessoas = JOptionPane.showInputDialog("Digite a quantidade de Pessoas: ");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"Divis�o para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros");
		} else {
			System.out.println("N�o quis ver o resultado.");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"O resto da divis�o �: " + resto + " carros");
		} else {
			System.out.println("N�o quis ver o resultado.");
		}
		
		System.out.println(carros);

	}

}
