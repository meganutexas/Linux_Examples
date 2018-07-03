import java.util.Scanner;
class NeedsInput {
	public static void main(String[] args) {
		System.out.println("I will print out the input given to me on argument per line");

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
	}
}
