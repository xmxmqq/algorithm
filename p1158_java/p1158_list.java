import java.util.*;
class Main{
    public static void main(String args[]){
        int N=0, K=0;
        int index=-1;
        String ans="<";
        List<Integer> jsp = new ArrayList();
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        N = Integer.parseInt(scanner.next());
        K = Integer.parseInt(scanner.next());

        for(int i = 1 ; i < N+1 ; i++){
            jsp.add(i);
        }

        while(!jsp.isEmpty()){
            for(int i = 0; i < K ; i++){
                index++;
                if(index == jsp.size())
                    index = 0;
            }
            
            result.append(Integer.toString(jsp.get(index))+", ");
            jsp.remove(index);

            index--;


        }

        ans += result.toString();

        System.out.println(ans.substring(0,ans.length()-2)+">");
        scanner.close();

    }
}