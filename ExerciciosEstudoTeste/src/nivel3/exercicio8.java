package nivel3;

import java.util.Random;
import java.util.Scanner;

public class exercicio8 {

	public exercicio8() {
		// TODO Auto-generated constructor stub

		// TODO Auto-generated method stub
		Random r= new Random();
		boolean continua=true;
		int pontos=0;
		int valor=r.nextInt(20);
		int valorAnt=valor;
		do{
		
			String opcao;
			System.out.println(valorAnt);
			System.out.println("O valor seguinte é acima ou abaixo de "+valorAnt+"?");
			opcao = new Scanner(System.in).next();
			do{
				valor=r.nextInt(20);
			}while(valor==valorAnt);
			
			
			if(opcao.equals("c")){
				if(valor> valorAnt){
					System.out.println("Acertou " +valor+ " e maior que " +valorAnt);
					pontos++;
				}else{
					System.out.println("Errou " +valor+ " e menor que " +valorAnt);
					break;
				}
			}else if(opcao.equals("b")){
				if(valor< valorAnt){
					System.out.println("Acertou " +valor+ " e menor que " +valorAnt);
					pontos++;
				}else{
					System.out.println("Errou " +valor+ " e maior que " +valorAnt);
					break;
				}
			}
			valorAnt=valor;
		}while(true);
		
		System.out.println("Obteve "+pontos+" pontos");
	}	
}