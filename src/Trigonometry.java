import java.util.Scanner;
public class Trigonometry {

    // TODO: Create 'public static double sine(double angle)'
	public static double sine(double angle){

		double sine=Math.sin(angle);
		return sine;

	}

    // TODO: Create 'public static double cosine(double angle)'

	public static double cosine(double angle){

		double cosine=Math.cos(angle);
		return cosine;

	}

    
        // TODO: Read angle
        // TODO: Call sine() and cosine()
        // TODO: Print results in the required format
    
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		double a= sc.nextDouble();

		double angle= a*Math.PI/180;

		double sine= sine(angle);
		double cosine= cosine(angle);

		System.out.println("Sine: "+sine);
		System.out.println("Cosine: "+cosine);

	}
}
