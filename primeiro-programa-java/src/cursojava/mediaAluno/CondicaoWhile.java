package cursojava.mediaAluno;

public class CondicaoWhile {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {
		
		int numero = 0;
		
		while (numero <= 10) { //Verifica e depois executa o código.
			
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		
		/*--------------------------------*/
		
		//Estrutura de repetição que primeiro executa e depois verifica.
		
		int numero2 = 0;
		do {
			System.out.println("O número atual é: " + numero);
			numero++;
		} while(numero2 <= 6);
		
	}

}
