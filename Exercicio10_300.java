import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int ano =0;
        
        System.out.println("Digite um ano para saber se é Bissexto");
        ano = ler.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " É Ano Bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " É Ano Bissexto.");
        } else{
            System.out.println(ano + " Não é Ano Bissexto");
        }
    }
}