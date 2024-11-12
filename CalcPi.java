// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		double pi = 0.0;
		for (int i = 0; i < n; i++) {
			double num = 1.0 / (1.0 + (i * 2.0));
			if (i % 2 == 0) {
				pi += num;
			}else{
				pi -= num;
			}
		}
		pi = pi * 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);
	}
}
