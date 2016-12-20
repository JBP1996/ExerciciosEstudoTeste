package nivel3;

import java.util.Scanner;

public class exercicio10 {

	public exercicio10() {
		// TODO Auto-generated constructor stub
		int calculo=0;
		int numero=0;
		String operacao;
		
		System.out.println("Insira um numero");
		calculo= new Scanner(System.in).nextInt();
		
		do{
			System.out.println("Qual operacao deseja efetuar?");
			operacao= new Scanner(System.in).next();
			
			switch(operacao){
				
			case "+":{
				calculo+=numero; 
				break;
			}
			case "-":{
				calculo-=numero; 
				break;
			}
			case "*": case "x":{
				calculo*=numero; 
				break;
			}
			case "/": case ":":{
				calculo/=numero; 
				break;
			}
			case "0": break;
			
			}
			
			System.out.println("Insira um numero");
			numero= new Scanner(System.in).nextInt();
			
		}while(!operacao.equals(0));
	}

}
