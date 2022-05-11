import java.util.Scanner;

public class Exercicio1_300 {

		public static void main (String[] args) {
			
			float notas[]= new float[10];
			float somaTotal=0;
			float media=0;
			
			Scanner ler = new Scanner (System.in);
			
			for(int x=0; x<notas.length;  x++) {
				System.out.println("Digite Uma Nota");
				
				notas[x]=ler.nextFloat();
				somaTotal += notas[x];
				}
			media = somaTotal/notas.length;
			
			System.out.println("A Média da Turma é: "+ media);

		}
}