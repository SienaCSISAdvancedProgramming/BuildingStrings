/**
 * A comparison of building a long String by using String concatenation
 * with the use of the StringBuilder class.
 * 
 * @author Jim Teresco
 *         Siena College, CSIS 225
 * @version Spring 2022
 */

public class BuildingStrings {

	/**
	 * Main method to build large strings by concatenation and with
	 * a StringBuilder, comparing the efficiencies.
	 * 
	 * @param args[0] the length of the String to construct, must be
	 *                a positive integer.
	 * 
	 */
	public static void main(String args[]) {

		if (args.length != 1) {
			System.err.println("Usage: java BuildingStrings n");
			System.exit(1);
		}

		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.err.println("Parameter must be a positive integer.");
			System.exit(1);
		}

		if (n <= 0) {
			System.err.println("Parameter must be a positive integer.");
			System.exit(1);
		}

		// string concatenation version
		long start = System.currentTimeMillis();
		String ans1 = "";
		for (int i = 0; i < n; i++) {
			ans1 += (i % 10);
		}
		long elapsed = System.currentTimeMillis() - start;
		System.out.println("Concatenated " + n + " times, length: " + ans1.length() + ", time: " + elapsed);

		// StringBuilder version
		start = System.currentTimeMillis();
		StringBuilder ans2build = new StringBuilder();
		for (int i = 0; i < n; i++) {
			ans2build.append(i % 10);
		}
		String ans2 = ans2build.toString();
		elapsed = System.currentTimeMillis() - start;
		System.out.println("Appended " + n + " times, length: " + ans2.length() + ", time: " + elapsed);
	}
}
