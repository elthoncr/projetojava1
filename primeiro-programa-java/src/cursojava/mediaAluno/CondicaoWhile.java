package cursojava.mediaAluno;

public class CondicaoWhile {

	/* Main � um m�todo auto executavel em Java */
	public static void main(String[] args) {
		
		int numero = 0;
		
		while (numero <= 10) { //Verifica e depois executa o c�digo.
			
			System.out.println("O n�mero atual �: " + numero);
			numero++;
		}
		
		/*--------------------------------*/
		
		//Estrutura de repeti��o que primeiro executa e depois verifica.
		
		int numero2 = 0;
		do {
			System.out.println("O n�mero atual �: " + numero);
			numero++;
		} while(numero2 <= 6);
		
	}

}
