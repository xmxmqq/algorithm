import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int h = 0;
    public static void main(String args[]) throws NumberFormatException, IOException {
       

        int[] array = {1,2,3,4};
        int[] darray = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};

        // pick(darray, 0, darray.length, 3);
        pick(darray, 0, darray.length, 6);
        System.out.println(h);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // depth 는 현재 트리구조에서 어떤 깊이에서 교환작업을 하고있는지에 대한 변수이다
    // n은 총 배열안에 들어있는 숫자를 뜻.

    // k는 몇개를 뽑아내서 순열을 만들것인지.

    // https://gorakgarak.tistory.com/522 [먹거리 만드는 열정맨 고락가락]

    static void pick(int[] numberArray, int depth, int n, int k) {
        if (depth == k) {
            for (int i = k ; i >= 0 ; i--) {
                System.out.print(" " + numberArray[i] + " ");
            }
            System.out.println();
            h++;
            return;
        }
        for (int i = depth; i < n; i++) {
            swap(numberArray, i, depth);
            pick(numberArray, depth + 1, n, k);
            swap(numberArray, i, depth);
        }

    }

}
