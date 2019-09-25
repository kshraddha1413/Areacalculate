import java.util.Scanner;

public class areaCalculate {

	public static void main(String[] args) {
		String shapeName = null;
		double pi = 3.14, aC, aR;
		int r, l, w;
		System.out.println("enter shape");
		Scanner sc = new Scanner(System.in);
		shapeName = sc.nextLine();
		
		switch (shapeName) {
		case ("circle"):
			System.out.println("Enter radius\n");
			r = sc.nextInt();
			aC = pi * r * r;
			System.out.println("area of circle:" + aC);
			break;
		case ("rectangle"):
			System.out.println("Enter length \n");
			l = sc.nextInt();
			System.out.println("Enter width \n");
			w = sc.nextInt();
			aR = l * w;
			System.out.println("area of rectangle:" + aR);
			break;

		default:
			System.out.println("This shape is not vailable");

		}
		sc.close();
	}

}