import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
    
double num = 0;
double f = 0;

    System.out.println("Digite um Número");
    num = ler.nextDouble();
    
      f=num;
        
while (num > 1){
  f = f *(num-1); num--;
                    }
  System.out.println(f);
    }
}