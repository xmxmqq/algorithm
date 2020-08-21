
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		final Stack<String> stack = new Stack<>();
		ArrayList<String> list = new ArrayList();
		

		for(int i = input.length - 1 ; i >= 0 ; i--){
			stack.push(input[i]);
		}
		
		for(int i = 0 ; i < input.length - 1 ; i ++){
			
		}
	}
}
