import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
int numero = 0;

    System.out.println("Digite um Número");
    numero = ler.nextInt();
    
boolean ehPrimo = true;
for (int j = 2; j < numero && ehPrimo == true; j++) 
{
            if (numero % j == 0)
                ehPrimo = false;
        }
    if (ehPrimo){
      System.out.println("O número é Primo"); 
    }
    else   {
       System.out.println("O número não é Primo");
    }  
			}
        }