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
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"Divisão para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros");
		} else {
			System.out.println("Não quis ver o resultado.");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"O resto da divisão é: " + resto + " carros");
		} else {
			System.out.println("Não quis ver o resultado.");
		}
		
		System.out.println(carros);

	}

}
