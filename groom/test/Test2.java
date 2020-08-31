import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
     

    int N = Integer.parseInt(input);

    int answer = 0;

    for (int i = 1; i <= N; i++) {
      String stringNum = String.valueOf(i);
      

      for (int j = 0; j < stringNum.length();j++) {
          char clap = stringNum.charAt(j);
          
          if (clap == '3' || clap == '6' || clap == '9') {
              answer++;
              
          }
      }
      
    }
    
    

    System.out.println(answer);
  

	}
}