package exercicios3;

import java.util.Scanner;

public class MediaPonderada {
	public static float Media(float a, float b, float c, float d, float e, float f) {
		return (a*d) + (b*e) + (c*f)/3;
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		float N1 = myObj.nextFloat();
		float N2 = myObj.nextFloat();
		float N3 = myObj.nextFloat();
		float P1 = myObj.nextFloat();
		float P2 = myObj.nextFloat();
		float P3 = myObj.nextFloat();
		
		
		float MP = Media (N1, N2, N3, P1, P2, P3);
		System.out.println("A media ponderada eh: "+ MP);
	}
}
