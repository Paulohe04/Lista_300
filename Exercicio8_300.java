import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade =0;
		       
        System.out.println("Digite a Idade");
        idade = ler.nextInt();
	
        
        if( idade <16) {
          System.out.println("Não Pode Votar");
            }
          
          else if( (idade >=16 && idade <18) || (idade>65)) {
          System.out.println("Voto Facultativo");
            }
            
        else{
			System.out.println("Voto Obrigatório");
		}
	}

}