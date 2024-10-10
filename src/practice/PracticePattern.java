package practice;

public class PracticePattern {
	public static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("*");
			}
			for (int col = 1; col <= n - row; col++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int space = row > n ? row - n : n - row;
			int col = row > n ? 2 * n - row : row;
			int col1 = row > n ? 2 * n - row - 1 : row - 1;

			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= col; c++) {
				System.out.print("*");
			}
			for (int c1 = 1; c1 <= col1; c1++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern9(int n) {
		for (int row = 1; row <= 2 * n; row++) {

			int space = row > n ? row - n - 1 : n - row;

			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			int col1 = row > n ? 2 * n - row + 1 : row;

			for (int c1 = 1; c1 <= col1; c1++) {
				System.out.print("*");
			}
			int col2 = row > n ? 2 * n - row : row - 1;
			for (int c2 = 1; c2 <= col2; c2++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void pattern10(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int space = row > n ? 2 * n - row : row - 1;
			int col1 = row > n ? row - n : n - row + 1;
			int col2 = row > n ? row - n - 1 : n - row;

			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			for (int c1 = 1; c1 <= col1; c1++) {
				System.out.print("*");
			}
			for (int c2 = 1; c2 <= col2; c2++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		pattern10(5);
	}

}
