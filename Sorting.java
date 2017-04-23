import java.util.Random;
public class Sorting{
  public static void main(String[] args){
    Random rand = new Random();
    LinkedList list = new LinkedList();
    list.add(rand.nextInt(100));
    list.add(rand.nextInt(100));
    list.add(rand.nextInt(100));
    list.add(rand.nextInt(100));
    list.add(rand.nextInt(100));
    list.add(rand.nextInt(100));
    list.add(rand.nextInt(100));
    list.add(rand.nextInt(100));
    list.print();
    list.bubbleSort();
    list.print();
  }
}