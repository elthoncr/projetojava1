package cursojava.mediaAluno;

public class principal {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*Condições lógicas com IF e ELSE */
		if (media >= 7) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 4 && media <= 6) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado! Nota: " + media);
		}

		/* Operadores ternários são para micro validações*/

		String saidaResultado = media >= 7 ? "Aluno Aprovado" : "Aluno Reprovado";

		System.out.println(saidaResultado);

		/* Operadores lógicos aninhadas: São operações dentro de operações */

		if (media >= 5) {
			if (media >= 7) {
				if (media >= 9) {
					System.out.println("Aluno aprovado direto - Parabens " + media);
				} else {
					System.out.println("Aluno está aprovado direto" + media);
				}
			} else {
				System.out.println("Aluno está em recuperação" + media);
			}
		}
		
		
		/* SWITCH CASE: OPERAÇÕES EXATAS */
		
		int dia = 1;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7: 
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Dia da Semana inválido.");
			break;
		}
		
	}

}
