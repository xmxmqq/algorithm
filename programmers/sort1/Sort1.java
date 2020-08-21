import java.util.ArrayList;
import java.util.Arrays;

class Sort1 {
    public static void main(String args[]){

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = 	{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        for (int j  : solution(array, commands)) {
            System.out.println(j);
        }
        
    }
    public static int[] getSliceOfArray(int[] arr, int start, int end) 
    { 
        
        // Get the slice of the Array 
        int[] slice = new int[end - start]; 

        // Copy elements of arr to slice 
        for (int i = 0; i < slice.length; i++) { 
            slice[i] = arr[start + i]; 
        } 

        // return the slice 
        return slice; 
    } 
    static public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        
        for(int[] command : commands){
            int[] slicedArray = getSliceOfArray(array, command[0]-1, command[1]);
            
            Arrays.sort(slicedArray);
            answerList.add(slicedArray[command[2]-1]);
        }
        
        int[] answer = new int[answerList.size()];
        int size = 0;
        for (int i : answerList) {
            answer[size] = i;
            size++;
        }

        return answer;
    }
}