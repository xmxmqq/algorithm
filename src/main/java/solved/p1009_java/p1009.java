package solved.p1009_java;

import java.util.Scanner;

class Main {
    public static void main(String args[]){
        int T = 0;
        int a = 0;
        int b = 0;
   
        Scanner scanner = new Scanner(System.in);
        T = Integer.parseInt(scanner.next());
        
        for(int i = 0 ; i < T ; i++){
            a = Integer.parseInt(scanner.next());
            b = Integer.parseInt(scanner.next());
            int cum = 0;
            int ans = 0;
        
            if(a % 10 == 0){
                System.out.println(10);
            }
            else if(a % 10 == 1){
                System.out.println(1);
            }
            else if(a % 10 == 2){ // 2 4 8 6 2
                cum = b % 4;

                if(cum == 1)
                    ans = 2;
                else if(cum == 2)
                    ans = 4;
                else if(cum == 3)
                    ans = 8;
                else
                    ans = 6;
                
                System.out.println(ans);
                
            }
            else if(a % 10 == 3){ // 3 9 7 1 3
                cum = b % 4;

                if(cum == 1)
                    ans = 3;
                else if(cum == 2)
                    ans = 9;
                else if(cum == 3)
                    ans = 7;
                else
                    ans = 1;

                System.out.println(ans);
            }
            else if(a % 10 == 4){ // 4 6 4 6
                cum = b % 2;
                
                if(cum == 1)
                    ans = 4;
                else
                    ans = 6;
                System.out.println(ans);
            }
            else if(a % 10 == 5){ // 5 5 5

                System.out.println(5);
            }
            else if(a % 10 == 6){ // 6 6 

                System.out.println(6);
            }
            else if(a % 10 == 7){ // 7 9 3 1 7

                cum = b % 4;

                if(cum == 1)
                    ans = 7;
                else if(cum == 2)
                    ans = 9;
                else if(cum == 3)
                    ans = 3;
                else
                    ans = 1;

                System.out.println(ans);
            }
            else if(a % 10 == 8){ // 8 4 2 6 8 

                cum = b % 4;

                if(cum == 1)
                    ans = 8;
                else if(cum == 2)
                    ans = 4;
                else if(cum == 3)
                    ans = 2;
                else
                    ans = 6;


                System.out.println(ans);
            }
            else if(a % 10 == 9){ // 9 1 9
                cum = b % 2;
                
                if(cum == 1)
                    ans = 9;
                else
                    ans = 1;
                System.out.println(ans);
            }
            
        }

    }
}