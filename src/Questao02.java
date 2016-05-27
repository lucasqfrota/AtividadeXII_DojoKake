import java.util.*;

public class Questao02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("tamanho da matriz quadrada: ");
		int n = scanner.nextInt();
		int[][] matriz = new int[n][n];
		
		preencherImprimirMatriz(matriz);
	}


	static void preencherImprimirMatriz(int matriz[][]) {
		
		// preencher matriz
		int cont = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = cont;
				cont++;
			}
		}
		
		// imprimir em forma tabular:
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("%d\t",matriz[i][j]);
			}
			System.out.println("");
		}
		int x = matriz.length*2;
		
		int vetor[] = new int[x];
		
		for (int i = 0; i < vetor.length; i++) {
			for(int j=0;j<matriz.length;j++){
				if(i==j){
					vetor[j]=matriz[i][j];
				} else if(i+j==matriz.length-1){
					vetor[j+matriz.length]=matriz[i][j];
				}
			}
		}
		for(int pp:vetor){
			System.out.println(pp);
		}
	}
}
