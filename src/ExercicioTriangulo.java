import java.util.Scanner; 

public class ExercicioTriangulo {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in); 
	double ladoa, ladob, ladoc; 
	System.out.println("Digite a medida do lado a da figura"); 
	ladoa = leitor.nextDouble();
	System.out.println("Digite a medida do lado b da figura"); 
	ladob = leitor.nextDouble();
	System.out.println("Digite a medida do lado c da figura"); 
	ladoc = leitor.nextDouble(); 
	//2� etapa: validar seo tipo de tri�ngulo existe
      
	if ((ladoa + ladob > ladoc) && (ladob + ladoc > ladoa) && (ladoa + ladoc > ladob)) {
		System.out.println("O tri�ngulo existe"); 
		//3� etapa: validar tipo do tri�ngulo 
		if(ladoa == ladob && ladoa == ladoc) { 
			System.out.println("O tri�ngulo � equilatero");
		}else if (ladoa != ladob && ladoa != ladoc && ladob != ladoc) { 
			System.out.println("");
		}
		}else {
		System.out.println("O tri�ngulo n�o existe");
		} 
	
	   leitor.close();
	}
     
}
