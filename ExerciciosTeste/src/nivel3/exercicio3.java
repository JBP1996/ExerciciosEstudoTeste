package nivel3;

import java.util.Random;

public class exercicio3 {
	
	public exercicio3() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] numero = new int[20];
		int[] contar = new int[9];
		Random r= new Random();
		for(int i=0;i<numero.length;i++){
			numero[i]=r.nextInt(9)+1;
			System.out.println("Valores array posicao " +i+" = "+ numero[i]+"\n");
			
			switch(numero[i]){
				case 1: contar[0]++; break;
				case 2: contar[1]++; break;
				case 3: contar[2]++; break;
				case 4: contar[3]++; break;
				case 5: contar[4]++; break;
				case 6: contar[5]++; break;
				case 7: contar[6]++; break;
				case 8: contar[7]++; break;
				case 9: contar[8]++; break;
			
			}
		}
		
		for(int x=0; x < contar.length;x++){
			System.out.println(x+1+" = "+ contar[x]+"x");
		}
	}

}
