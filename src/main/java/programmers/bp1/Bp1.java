package programmers;

import java.util.ArrayList;

class Bp1 {
    public static void main(String args[]){
        int[] answers = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
       
        for(int i : solution(answers) )
            System.out.println("good student : " + i);
    }
    public static int[] solution(int[] answers) {
        
        
        int bigScore = 0;

        int[][] s = {   
                        {1, 2, 3, 4, 5}, 
                        {2, 1, 2, 3, 2, 4, 2, 5}, 
                        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
                    };

        int[] scores = new int[3];
        
        int[] index = new int[3];

        for (int i : answers) {
            // System.out.println(i);
            
            for(int j = 0 ; j < 3 ; j++){
                
                if(index[j] == s[j].length)
                    index[j] = 0;
                if(s[j][index[j]] == i)
                    scores[j]++;
                index[j]++;
            }

        }

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        
        for (int score : scores) {
            if(score >= bigScore)
                bigScore = score;
        }
        
        System.out.println("big score : " + bigScore);

        ArrayList<Integer> scoreList = new ArrayList<>();

        for(int i = 0 ; i < 3 ; i++){
            if(scores[i] == bigScore)
                scoreList.add(i+1);
        }

        int[] answer = new int[scoreList.size()];
    
        int size = 0;
        for(int score : scoreList){
            answer[size] = score; 
            size++;
        }
        return answer;



    }
}