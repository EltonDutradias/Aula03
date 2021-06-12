import java.util.Scanner;

public class ExercicioDrone2 {
	
        public static void main(String[] args) {
				Scanner leitor = new Scanner (System.in); 
				double lixo1, lixo2, lixo3; 
				System.out.println("Digite o peso do primeiro lixo"); 
				lixo1 = leitor.nextDouble(); 
				System.out.println("Digite o peso do segundo lixo"); 
				lixo2 = leitor.nextDouble(); 
				System.out.println("Digite o peso do terceiro lixo"); 
				lixo3 = leitor.nextDouble();
         if(lixo1<lixo2 && lixo1 < lixo3){   
        	 System.out.println("Carregar primeiro lixo");          
        	 }else if(lixo2<lixo1 && lixo2 < lixo3){   
            	 System.out.println("Carregar segundo lixo");          
            	 }else if(lixo3<lixo1 && lixo3 < lixo3) { 
            		 System.out.println("Carregar terceiro lixo");
            	 }else { 
            		 System.out.println("Não foi possivel determinar apenas 1 lixo como o menor!");
            	 }
         leitor.close();
         
	}

}
