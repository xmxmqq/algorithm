import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
        while(true){

        
        String str = br.readLine();
       
        List<String> list = new ArrayList<String>();
        Long[] jub = new Long[str.length()];    
        for(int i = 0 ; i < str.length() ; i++){

            // 접미사 문자열 나누기
            list.add(str.substring(i)+" ".repeat(i));
            
            // 해당 문자열의 순서를 계산할 배열
            jub[i] = 0l;
            
            // 순서계산
            // 문자에 숫자와 자릿수 값을 곱한다.
            for(int j = 0 ; j < list.get(i).length() ; j++){
                char c = list.get(i).charAt(j);
                if(c == ' ')
                    jub[i] += (long)(Math.pow(27,  (str.length() - j)));
                    
                else
                    jub[i] += (c - 95) * (long)(Math.pow(27,  (str.length() - j))); 

            }
            
            
        }

        // for(int i = 0 ; i < str.length() ; i++){
        //     System.out.println(list.get(i) + ":" + jub[i]);
        // }

            System.out.println(list.get(0) + ":" + jub[0]);
        }


    }
}