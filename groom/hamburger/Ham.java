import java.io.*;
import java.util.Arrays;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int buger = Integer.parseInt(input);
		String[] eattingTimeString = br.readLine().split(" ");
		String[] cockingTimeString = br.readLine().split(" ");

		int[] eattingTime = new int[buger];
		int[] cockingTime = new int[buger];


		for(int i = 0 ; i < buger ; i++) {
				eattingTime[i] = Integer.parseInt(eattingTimeString[i]);
				cockingTime[i] = Integer.parseInt(cockingTimeString[i]);
		}
		
		Arrays.sort(eattingTime);
		int answer = 0;
		for(int i : cockingTime) {
			answer += i;
		}
		
		System.out.println(answer + eattingTime[0]);

	}
}