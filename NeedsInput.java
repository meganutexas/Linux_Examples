class NeedsInput {
	public static void main(String[] args) {
		System.out.println("I will print out the input given to me on argument per line");
		for (String arg: args) {
			System.out.println(arg);
		}
	}
}
