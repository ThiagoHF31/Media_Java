import java.util.Scanner;
public class MediaVetor {
	
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
            int i = 0;
            double[] media = new double[10];
            
            System.out.println("Digite as 10 notas: ");
            for(i = 0; i < 10; i++) {
            	System.out.print((i+1)+"ºNota: ");
            	media[i] = reader.nextDouble();
            }

            System.out.printf("A media dos valores é: %.2f", calculo_media(media, i));
        }
	}
	
	public static double calculo_media(double media[], int i) {
		double soma = 0;
		double resulmedia = 0;
		
		for( i = 0; i<10; i++) {
			soma += media[i];
		}

	 resulmedia = soma/10;
	 return resulmedia;
	}
}
	


