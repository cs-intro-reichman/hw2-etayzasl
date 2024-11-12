public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		boolean verbose = args[1].equals("v"); 

		for (int i = 1; i <= seed; i++) {
			int current = i;
			int count = 0;

			while (current != 1 || count == 0) {
				if (verbose) System.out.print(current + " "); 

				count++;

				if (current % 2 == 0) current = current / 2;
				else current = 3 * current + 1;
			}

			if (verbose) {
				System.out.println("1 (" + (count + 1) + ")"); 
			}
		}

		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
