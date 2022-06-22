package cursojava.mediaAluno;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		/* Estrutura de repeti��o FOR */
		
		for (int numero = 0; numero <= 10; numero++) {
			System.out.println("N�mero atual �: " + numero);
		}

		/* Estrutura de repeti��o FOR com Break (Parada) */
		
		for (int numero = 10; numero >=0; numero --) {
			if (numero == 7) {
				System.out.println("Obaaa, encontrei o n�mero 7.");
				System.out.println("Estou parando de executar....");
				break;
			}
		}
		
		/* Estrutura de repeti��o FOR e Continue */
		
		for (int numero = 0; numero <= 10; numero ++) {
			if (numero == 7 || numero == 6 || numero == 9) {
				System.out.println("Obaaa, encontrei o n�mero:" + numero);
				System.out.println("Estou continuando a execu��o....");
				continue;
			}
			
			System.out.println("Processando la�o de repeti��o");
			
		}
	}

}
