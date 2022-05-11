import java.util.Scanner;

public class Exercicio7_300 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC; //variável tipo Real
		       
        System.out.println("Primeiro lado do triângulo:");
        ladoA = ler.nextDouble();
		
        System.out.println("Segundo lado do triângulo:");
        ladoB = ler.nextDouble();
        
        System.out.println("Terceiro lado do triângulo:");
        ladoC = ler.nextDouble();
        
        if( ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
          System.out.println("É um triângulo");
            }
        else{ 
			System.out.println("Os lados fornecidos não caracterizam um triângulo");
		}
	}

}