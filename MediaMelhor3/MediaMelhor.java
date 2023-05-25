import java.util.Scanner;
public class MediaMelhor {
	
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
            int i = 0;
            double[] media = new double[10];
            
            System.out.println("Digite as 10 notas: ");
            for(i = 0; i < 10; i++) {
				do{
            		System.out.print((i+1)+"º Nota: ");
            		media[i] = reader.nextDouble();

					if(media[i] > 10 || media[i] < 0){
						System.out.println("\033[31mPor favor digite uma nota valida: \033[0m");
					}

				}while(media[i] > 10 || media[i] < 0);
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
