package proposedExercises.topic2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CircumferenceCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		System.out.println("Programa para calcular:"
				+ "\n- superficie, "
				+ "\n- volumen "
				+ "\n- longitud "
				+ "\nde una circunferencia basada en su radio.\n");
		System.out.print("Introduce el valor del radio de la circunferencia: ");
		
		//Variable zone
		float pi = (float)Math.PI;
		float radius = sc.nextFloat();
		float length = 2*pi*radius;
		float volume = 1.33f*pi*radius;
		float surface = pi*radius;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		System.out.println("El valor de la superficie es: "+df.format(surface)+"cm");
		System.out.println("El valor del volumen es: "+df.format(volume)+"cm");
		System.out.println("El valor de la longitud es: "+df.format(length)+"cm");
		sc.close();
	}
}
