import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(final String args[]) throws IOException {
        String str;
        String order;
        int order_num;
        final Scanner scanner = new Scanner(System.in);

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        
        final Stack<Character> f_stack = new Stack<>();
        final Stack<Character> b_stack = new Stack<>();

        

        str = br.readLine(); // 문자열 입력
 
        for(int i = 0 ; i < str.length();i++){ // 리스트에 문자열을 추가하면서 커서를 옮긴다
            f_stack.push(str.charAt(i));
        }
        
        System.out.println(str);
   
    }
}