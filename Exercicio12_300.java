import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int nota =0;
        
        System.out.println("Digite a Nota");
        nota = ler.nextInt();
        
       switch(nota) {
			
			case 1:
				System.out.println("Péssima");
				break;
			
			case 2:
				System.out.println("Ruim");
				break;
				
			case 3:
				System.out.println("Regular");
				break;
           
      case 4:
				System.out.println("Boa");
				break;

      case 5:
				System.out.println("Ótima");
				break;
				
			default : System.out.println("Nota Inválida");
			
			}
		
        }
    }