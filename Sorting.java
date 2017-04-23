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
    System.out.println("The original list of the random numbers:");
    list.print();
    list.bubbleSort();
    System.out.println("The list after sorted:");
    System.out.println("TheSize:" + list.size());
    list.print();
  }
}