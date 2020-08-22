import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main3{
  public static void main(String args[])throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    StringBuilder result = new StringBuilder();

    String[] competitorTeamStr= br.readLine().split(" ");
		String[] vunoTeamStr = br.readLine().split(" ");
    int[] answer = new int[1];
		int[] competitorTeamInteger = new int[5];
		int[] vunoTeamInteger = new int[5];


		for(int i = 0 ; i < 5 ; i++) {
      competitorTeamInteger[i] = Integer.parseInt(competitorTeamStr[i]);
      vunoTeamInteger[i] = Integer.parseInt(vunoTeamStr[i]);
    }
    

    pick(answer, vunoTeamInteger, competitorTeamInteger, 0, 5, 5);
    
    System.out.println(answer[0]);
  }


  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  
  static void pick(int[] answer, int[] vunoTeamInteger, int[] competitorTeamInteger, int depth, int n , int k) {
    if (depth == k) {
      int sum = 0;
        for(int i = 0 ; i < 5 ; i++) {
          // System.out.print(vunoTeamInteger[i] + " vs " + competitorTeamInteger[i]);
          // System.out.println();
          if(vunoTeamInteger[i] >= competitorTeamInteger[i])
            sum++;
        }
        if(sum > answer[0])
          answer[0] = sum;
        // System.out.println();
        return; 
    } 
    for (int i = depth; i < n; i++) { 
        swap(vunoTeamInteger, i, depth);
        pick(answer, vunoTeamInteger, competitorTeamInteger, depth + 1, n, k); 
        swap(vunoTeamInteger, i, depth); 
    }

  }



}
