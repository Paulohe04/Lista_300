import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dia =0;
    int mes =0;

                System.out.println("Digite um Mês");
        mes = ler.nextInt();
    
        System.out.println("Digite um Dia");
        dia = ler.nextInt();
    
    if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31)
    {
      System.out.println("Data Válida: "+ dia + "/" + mes);
    }
    
	    else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)
          {
      System.out.println("Data Válida: "+ dia + "/" + mes);
    }		

  	    else if ((mes == 2) && dia <= 28)
          {
      System.out.println("Data Válida: "+ dia + "/" + mes);
    }	
          
else { System.out.println("Data Inválida");}

	}

}