import java.util.Scanner;

public class SalesTracking {

	public static void main(String[] args) {
		String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] monthlySales = {0,0,0,0,0,0,0,0,0,0,0,0};
		getSales(monthArray, monthlySales);
		displaySaleInfo(monthArray, monthlySales);
	}

	private static void displaySaleInfo(String[] monthArray, int[] monthlySales) {
		String totalSales = "Total sales: " + computeTotalSales(monthlySales);
		String averageSales = "Average sales: " + computeAverageSales(monthlySales);
		String highestMonth = "Highest month: " + computeHighestMonth(monthArray, monthlySales);
		String lowestMonth = "Lowest month: " + computeLowestMonth(monthArray, monthlySales);
		String highestSales = "Highest sales: " + computeHighestSales(monthlySales);
		String lowestSales = "Lowest sales: " + computeLowestSales(monthlySales);
		System.out.println(totalSales);
		System.out.println(averageSales);
		System.out.println(highestSales);
		System.out.println(lowestSales);
		System.out.println(highestMonth);
		System.out.println(lowestMonth);
	}

	private static String computeHighestMonth(String[] monthArray, int[] monthlySales) {
		int i = 0;
		int choice = 0;
		while (i < 12) {
			if (monthlySales[i] == computeHighestSales(monthlySales)) {
				choice = i;
			}
			i++;
		}
		return monthArray[choice];
	}

	private static String computeLowestMonth(String[] monthArray, int[] monthlySales) {
		int i = 0;
		int choice = 0;
		while (i < 12) {
			if (monthlySales[i] == computeLowestSales(monthlySales)) {
				choice = i;
			}
			i++;
		}
		return monthArray[choice];
	}

	private static int computeLowestSales(int[] monthlySales) {
		int v1 = Math.min(monthlySales[0], monthlySales[1]);
		int v2 = Math.min(monthlySales[2], monthlySales[3]);
		int v3 = Math.min(monthlySales[4], monthlySales[5]);
		int v4 = Math.min(monthlySales[6], monthlySales[7]);
		int v5 = Math.min(monthlySales[8], monthlySales[9]);
		int v6 = Math.min(monthlySales[10], monthlySales[11]);
		//round 2
		int v7 = Math.min(v1,v2);
		int v8 = Math.min(v3,v4);
		int v9 = Math.min(v5,v6);
		//round 3
		int v10 = Math.min(v7,v8);
		int v11 = Math.min(v9,v10);
	    return v11;
	}

	private static int computeHighestSales(int[] monthlySales) {
		int v1 = Math.max(monthlySales[0], monthlySales[1]);
		int v2 = Math.max(monthlySales[2], monthlySales[3]);
		int v3 = Math.max(monthlySales[4], monthlySales[5]);
		int v4 = Math.max(monthlySales[6], monthlySales[7]);
		int v5 = Math.max(monthlySales[8], monthlySales[9]);
		int v6 = Math.max(monthlySales[10], monthlySales[11]);
		//round 2
		int v7 = Math.max(v1,v2);
		int v8 = Math.max(v3,v4);
		int v9 = Math.max(v5,v6);
		//round 3
		int v10 = Math.max(v7,v8);
		int v11 = Math.max(v9,v10);
	    return v11;
	}

	private static int computeAverageSales(int[] monthlySales) {
		return computeTotalSales(monthlySales) / 12;
	}

	private static int computeTotalSales(int[] monthlySales) {
		return monthlySales[0] + monthlySales[1] + monthlySales[2] + monthlySales[3] + monthlySales[4] +
				monthlySales[5] + monthlySales[6] + monthlySales[7] + monthlySales[8] + monthlySales[9] +
				monthlySales[10] + monthlySales[11];
	}

	private static void getSales(String[] monthArray, int[] monthlySales) {
		int i = 0;
		try (Scanner in = new Scanner(System.in)) {
			while (i < 12) {
				System.out.println("Please enter sales for " + monthArray[i]);
				int input = in.nextInt();
				monthlySales[i] = input;//System.in.read();
				i++;
			}
		}
		i = 0;
		while (i < 12) {
			System.out.println(monthArray[i] + "'s monthly sales: " + monthlySales[i]);
			i++;
		}
		
	}

}
