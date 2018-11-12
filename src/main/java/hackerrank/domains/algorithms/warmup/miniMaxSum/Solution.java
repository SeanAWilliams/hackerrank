package hackerrank.domains.algorithms.warmup.miniMaxSum;

import java.math.*;
import java.util.*;


public class Solution {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		BigInteger bigIntegerMin = BigInteger.valueOf(0);
		bigIntegerMin = addition(bigIntegerMin, arr[0]);
		bigIntegerMin = addition(bigIntegerMin, arr[1]);
		bigIntegerMin = addition(bigIntegerMin, arr[2]);
		bigIntegerMin = addition(bigIntegerMin, arr[3]);
		BigInteger bigIntegerMax = BigInteger.valueOf(0);
		bigIntegerMax = addition(bigIntegerMax, arr[1]);
		bigIntegerMax = addition(bigIntegerMax, arr[2]);
		bigIntegerMax = addition(bigIntegerMax, arr[3]);
		bigIntegerMax = addition(bigIntegerMax, arr[4]);

		System.out.println(bigIntegerMin.toString() + " " + bigIntegerMax.toString());

	}

	static BigInteger addition(BigInteger bigint, int number){
		 bigint = bigint.add(BigInteger.valueOf(number));
		return bigint;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}

