import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
/**
 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
 который вернет “перевернутый” список.
 */
public class task1 {
    public static void main(String[] args) {
        LinkedList<String> deque1 = new LinkedList<String>();
        deque1.add("String-1");
        deque1.add("String-2");
        deque1.add("String-3");
        System.out.println(deque1);

        LinkedList<String> deque2 = new LinkedList<String>();
        for (String str : deque1) {
            deque2.push(str);
        }
        System.out.print(deque2);
    }
}