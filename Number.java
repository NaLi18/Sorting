public class Number
{
  //Properties declare
  int number;
  Number next;
  Number prev;
  /*
   * The constructor
   * @param name
   */
  public Number(int data){
    this.next = null;
    this.number = data;
    this.prev = null;
  }
  /*
   * The non-argument constructor
   */
  public Number(){
    this.number = 0;
    this.next = null;
    this.prev = null;
  }
  /*
   * The setNext method which set the nextNumber
   * @param node
   */
  public void setNext(Number node){ 
    this.next = node;
  }
  /*
   * The setPrev method which set the nextNumber
   * @param node
   */
  public void setPrev(Number node){ 
    this.prev = node;
  }
  /*
   * The getNext method return the next node
   * @return 
   */
  public Number getNext(){
    return this.next;
  }
   /*
   * The getPrev method return the next node
   * @return 
   */
  public Number getPrev(){
    return this.prev;
  }
 
  /*
   * The getValue method return the value of node
   * @return 
   */
  public int getValue(){
    return this.number;
  }
  /*
   * The setValue method set the value of node
   * @param x the number save in the node 
   */
  public void setValue(int data){
    this.number = data;
  }
  /*
   * The print method display the value of the node 
   */
  public void print(){
    System.out.println(this.number + " ");
  }
}