import java.util.Scanner;

public class Main {

		public static void main (String[] args) {
			
int valor = 0;
int resp = 0;
int valor2 = 0;
  
		Scanner ler = new Scanner (System.in);
			
System.out.println("Digite um Valor Inteiro"); 
      
	valor = ler.nextInt();       //ler o valor de entrada
  valor2 = valor;               //Valor Utilizado no println
      
while (valor > 0) {
resp *= 10;
resp += (valor % 10);
valor /= 10;
}
   System.out.println("O número digitado foi: " + valor2 + " E o seu inverso é: " + resp);
     }

		}