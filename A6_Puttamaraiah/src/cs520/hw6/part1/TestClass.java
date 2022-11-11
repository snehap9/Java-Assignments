package cs520.hw6.part1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class TestClass {

	public static void main(String[] args) {
		InputStreamReader inputStream = null;
		BufferedReader reader = null;

		try {
			String page = "http://norvig.com/big.txt";
			URL urlObject = new URL(page);

			// Reading the data
			StringBuffer buffer = new StringBuffer();
			String inputLine;
			inputStream = new InputStreamReader(urlObject.openStream());
			reader = new BufferedReader(inputStream);
			while ((inputLine = reader.readLine()) != null) {
				// converting data to lower case and appending it to the StringBuffer variable
				buffer.append(inputLine.toLowerCase());

			}

			SharedResults sharedResults = new SharedResults();
			LongTask longTaskObjects[] = new LongTask[26];
			char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

			for (int i = 0; i < longTaskObjects.length; i++) {
				longTaskObjects[i] = new LongTask(sharedResults, buffer, alphabet[i]);
				longTaskObjects[i].start();
			}
			for (int i = 0; i < longTaskObjects.length; i++) {
				longTaskObjects[i].join();
			}

			int sum = sharedResults.getResult();
			System.out.println(sum);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
