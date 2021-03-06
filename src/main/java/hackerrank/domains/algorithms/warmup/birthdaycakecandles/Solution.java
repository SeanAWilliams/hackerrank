package hackerrank.domains.algorithms.warmup.birthdaycakecandles;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the birthdayCakeCandles function below.
	protected static int birthdayCakeCandles(int[] ar) {
		int currentMax =ar[0];
		HashMap<Integer, Integer> candleHeights= new HashMap<Integer, Integer>();
		for (int candle: ar ) {
			// keep track of tallest candle
			if (currentMax < candle){
				currentMax = candle;
			}
			// if hash contains candle height, increment the count. if not create the input.
			if (candleHeights.containsKey(candle)) {
				candleHeights.put(candle, candleHeights.get(candle) + 1);
			} else {
				candleHeights.put(candle, 1);
			}
		}
		// return the tallest
		return candleHeights.get(currentMax);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = birthdayCakeCandles(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

