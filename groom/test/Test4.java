import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main4{
  public static void main(String args[])throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    
    
    int N = Integer.parseInt(br.readLine());
    String[][] diamondStr = new String[(N * 2) -1][N];
  
    int answer = 0;

    for(int i = 0 ; i < diamondStr.length ; i++) {
      diamondStr[i] = br.readLine().split(" ");
    }

    answer += Integer.parseInt(diamondStr[0][0]) + Integer.parseInt(diamondStr[(N * 2) - 2][0]);
    
    for(int i = 1 ; i < diamondStr.length - 2 ; i++) {
      for(int j = 0 ; j < )
    }



    for(int i = 0 ; i < diamondStr.length ; i++) {
      for (String s : diamondStr[i]) {
        System.out.print(" " + s + " ");
      }
      System.out.println();
    }
  }



}