import java.util.LinkedList;

/**
 * 2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 * Это задание повышенной сложности, для решения задачи потребуется создать
 * класс-обертку над LinkedList, например:
 * 
 * class MyQueue {
 * private LinkedList elements = new LinkedList();
 * 
 * public MyQueue() { }
 * public MyQueue(LinkedList linkedList) {
 * this.elements = linkedList;
 * }
 * 
 * .........
 * 
 * }
 */
public class task2 {
    public static void main(String[] args) {
        int[] list = { 2, 5, 9, 4, 5, 6, 3 };
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer item : list) {
            linkedList.add(item);
        }
        System.out.println(linkedList);

        enqueue(linkedList, 9);
        System.out.println(linkedList);

        System.out.println(dequeue(linkedList));
        System.out.println(linkedList);

        System.out.println(first(linkedList));
    }

    public static void enqueue(LinkedList<Integer> list, int num){
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list){
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list){
        int num = 0;
        num = list.get(0);
        return num;
    }
}
