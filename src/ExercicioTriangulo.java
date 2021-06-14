import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double ladoa, ladob, ladoc; 
		String existe = "O triângulo existe e ele é ";
		System.out.println("Digite a medida do lado a da figura");
		ladoa = leitor.nextDouble();
		System.out.println("Digite a medida do lado b da figura");
		ladob = leitor.nextDouble();
		System.out.println("Digite a medida do lado c da figura");
		ladoc = leitor.nextDouble();
		// 2° etapa: validar seo tipo de triângulo existe

		if((ladoa + ladob > ladoc) && (ladob + ladoc > ladoa) && (ladoa + ladoc > ladob)) {  
		        //3° etapa validar o tipo 
		        if(ladoa == ladob && ladoa == ladoc) { 
		        	System.out.println(existe + "equilátero!");
		        }else if (ladoa != ladob && ladoa!= ladoc && ladob!= ladoc) { 
		        	System.out.println(existe + "escaleno!");
		        }else { 
		        	System.out.println(existe + "isóceles!");
		        }
		} else { 
			System.out.println("O triêngulo não existe!");
		}
		  leitor.close();
		} 
}