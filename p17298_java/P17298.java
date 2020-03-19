import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        StringBuilder result = new StringBuilder();
        Stack<Integer> A = new Stack<Integer>();
        Stack<Integer> B = new Stack<Integer>();
        Stack<Integer> current = new Stack<Integer>();
        int N;
        int EOF=-1;
        

        N = Integer.parseInt(br.readLine());

        
        StringTokenizer tk = new StringTokenizer(br.readLine());


        for(int i = 0 ; i < N ; i++){ // 스텍에 값 저장
            
            A.push(Integer.parseInt(tk.nextToken()));

        }
        
        
        while(!A.isEmpty()){
            current = (Stack<Integer>) B.clone();

            int target = A.pop();

            EOF = -1;
            while(!current.isEmpty()){
                int current_num =   current.pop();

                if(current_num>target){
                    EOF = current_num;
                    break;
                }
                
                EOF = -1;
            }

            result.insert(0," "+EOF);
            B.push(target);


        }
        
        System.out.println(result.toString());


        
    }
}