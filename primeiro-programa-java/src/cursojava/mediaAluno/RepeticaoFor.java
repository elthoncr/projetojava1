package cursojava.mediaAluno;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		/* Estrutura de repetição FOR */
		
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("Número atual é: " + numero);
		}

		/* Estrutura de repetição FOR com Break (Parada) */
		
		for (int numero = 10; numero >=0; numero --) {
			if (numero == 7) {
				System.out.println("Obaaa, encontrei o número 7.");
				System.out.println("Estou parando de executar....");
				break;
			}
		}
		
		/* Estrutura de repetição FOR e Continue */
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 7 || numero == 6 || numero == 9) {
				System.out.println("Obaaa, encontrei o número:" + numero);
				System.out.println("Estou continuando a execução....");
				continue;
			}
			
			System.out.println("Processando laço de repetição");
			
		}
	}

}
