import java.util.Scanner;
public class Media {

	public static double calcula_media(double num1, double num2, double num3) {
		return (num1 + num2 + num3)/3;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Digite 3 notas: ");
		double num1 = reader.nextDouble();
		double num2 = reader.nextDouble();
		double num3 = reader.nextDouble();
		double resultado = calcula_media(num1, num2, num3);
		
		System.out.printf("A media do Aluno é %.1f", resultado);

		reader.close();
	}
}