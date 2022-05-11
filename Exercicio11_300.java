import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1 =0;
    int num2 =0;
        
        System.out.println("Digite o Primeiro Número");
        num1 = ler.nextInt();

            System.out.println("Digite o Segundo Número");
        num2 = ler.nextInt();
        
        if(num1 %2 !=0 && num2 %2 !=0)
        {
            System.out.println("Os dois números são ímpares e a soma é: " + (num1+num2));
          
        } else if(num1 %2 ==0 && num2 %2 ==0)
        {
            System.out.println("Os dois números são Pares e o Produto é: " + (num1*num2));
          
        }
        else {
          if(num1 %2 !=0)
          {
            System.out.println(" O número ìmpar é: " + num1);}
          else {
            System.out.println(" O número ìmpar é: " + num2);}
        }
    }
}