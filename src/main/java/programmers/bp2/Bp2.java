import java.util.ArrayList;
import java.util.HashSet;


class Bp2 {
    public static void main(String args[]){

        String numbers = "17";
        System.out.println(solution(numbers));
       
    }

    static boolean isPrime(int number) {
        if(number == 0 ) return false;

        if(number == 1) return false;

        if(number == 2) return true;

        for(int i = 2 ; i < number ; i++){
            // System.out.println(number % i );
            if(number % i == 0)
                return false;
        }

        return true;

    }
    
    static void pick(HashSet<Integer> primeNumberSet, int[] numberArray, int depth, int n , int k) {
        if (depth == k) {
            String setString = "";
            for(int i = 0 ; i < k ; i++){
                setString += numberArray[i];
                // System.out.print(numberArray[i]);
            }
            int setInteger = Integer.parseInt(setString);
            if(isPrime(setInteger))
                primeNumberSet.add(setInteger);
            // System.out.println("\n" + setInteger + " is prime : " + isPrime(setInteger));
            return; 
        } 
        for (int i = depth; i < n; i++) { 
            swap(numberArray, i, depth);
            pick(primeNumberSet, numberArray, depth + 1, n, k); 
            swap(numberArray, i, depth); 
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int solution(String numbers) {

        int answer = 0;

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        HashSet<Integer> primeNumberSet = new HashSet<Integer>();

        for(int i = 0 ; i < numbers.length() ; i++) {
            numberList.add(Character.getNumericValue(numbers.charAt(i)));
        }

        int size = 0;
        int[] numberArray = new int[numberList.size()];
        for (int i : numberList) {
            numberArray[size++] = i;
            
        }

        for(int i = 1 ; i < numberArray.length+1 ; i++)
            pick(primeNumberSet, numberArray, 0, numberArray.length, i);

        // for (int i : primeNumberSet) {
        //     System.out.println(i);
        // }

        return primeNumberSet.size();

    
        
        
    }
}