import java.io.*;
import java.util.*;
import java.lang.*;

class Main1 {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] layers = new int[n];
		for(int i = 0 ; i < n ; i ++)
		{
			layers[i] = scanner.nextInt();
		}
		
    
    
		
		int answer = 0;
		
		
		for(int i = 1 ; i < layers.length ; i++) {
      answer += (layers[i-1] * layers[i]);

    }
		
		System.out.println(answer);
	}
}