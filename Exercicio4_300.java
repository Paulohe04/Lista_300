import java.util.Scanner;

public class Main {

		public static void main (String[] args) {
			
int valor = 0;
int hora = 0;
int minutos = 0;
int segundos = 0;
int resto = 0;

		Scanner ler = new Scanner (System.in);
			
System.out.println("Digite o Valor dos Segundos"); 
      
	valor = ler.nextInt();       //ler o valor de entrada
          
    hora = valor / 3600;
    resto = valor % 3600;
    minutos = resto / 60;
    segundos = resto % 60;
      
  System.out.println("O valor digitado corresponde a:" + hora +" Horas - " + minutos +" Minutos - e " + segundos + "Segundos.");

}

     }
