import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main5 {
  public static void main(String args[])throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    String input = br.readLine();
    int[] older = new int[1];
    int[] visit = new int[100001];
    older[0] = Integer.parseInt(input.split(" ")[0]);
    int younger = Integer.parseInt(input.split(" ")[1]);

    if(older[0] >= younger)
      System.out.println(older[0] - younger);
    else
      find(older, younger, visit);

    
  }

  static void find(int[] older, int younger, int[] visit) {
    Queue<Integer> q = new LinkedList<>();
    q.add(older[0]);
    visit[older[0]] = 1;

    while (!q.isEmpty()) {
      int temp = q.poll();

      for (int i = 0; i < 3; i++) {
        int next;

        if (i == 0) {
          next = temp + 1;
        } else if (i == 1) {
          next = temp - 1;
        } else {
          next = temp * 2;
        }

        if (next == younger) {
          System.out.println(visit[temp]);
          return;
        }

        if (next >= 0 && next < visit.length && visit[next] == 0) {
          q.add(next);
          visit[next] = visit[temp] + 1;
        }
      }
    }
  }

}