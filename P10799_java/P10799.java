import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
     
        
        String str = br.readLine();
        int laser=0;
        int stick=0;
        int set=0;
        int result=0;


        for(int i = 1; i < str.length() ; i++){
            
            if(str.charAt(i) == '('){ // ( 일때
                if(str.charAt(i-1) == '('){
                    stick++;
                }
                set++;
            }
            else{ // ) 일때

                if(str.charAt(i-1) == '('){
                    laser++;
                }
                set--;
            }

            if(set == 0){
                
                System.out.println(laser);
                System.out.println(stick);
                laser = 0;
                stick = 0;
            }


        }

    }
}