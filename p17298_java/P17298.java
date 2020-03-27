import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        StringBuilder result = new StringBuilder();
        Stack<Integer> A = new Stack<Integer>();
        Stack<Integer> right_num = new Stack<Integer>();
        Stack<Integer> left_num = new Stack<Integer>();
        int N;
        int EOF=-1;
        

        N = Integer.parseInt(br.readLine());

        
        StringTokenizer tk = new StringTokenizer(br.readLine());


        for(int i = 0 ; i < N ; i++){ // 스텍에 값 저장
            
            A.push(Integer.parseInt(tk.nextToken()));

        }
        

        for(int i = 0 ; i < N ; i++){//수열의 길이만큼 반복한다
            
            int target = A.pop();// 스택에서 수열을 꺼냄
            

            EOF = -1;
            while(!right_num.isEmpty()){//target의 오른쪽 수를 저장할 스택이 빌때까지
                int rn = right_num.pop();//오른쪽 수를 스택에서 꺼낸다
                left_num.push(rn);
                if(target < rn){
                    EOF = rn;
                    break;
                }
            }
            while(!left_num.isEmpty()){
                right_num.push(left_num.pop());//꺼냈던 수를 다시 넣어줌
            }

            result.insert(0,EOF+" ");
            
            right_num.push(target);
        }




        System.out.println(result.toString());


        
    }
}