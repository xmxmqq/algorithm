import java.util.Queue;
import java.util.LinkedList;

public class test {
    public static void main(String args[]){
        
        Queue<String> q = new LinkedList();

        q.offer("test1");
        q.offer("test2");

        System.out.println(q.peek());
        
        System.out.println(q.peek());
        
        System.out.println(q.peek());
    }
}