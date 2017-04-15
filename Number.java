public class Number
{
  String str;
  Number next;
  /*
   * The constructor
   * @param name
   */
  public Number(String name){
    this.next = null;
    this.str = name;
  }
  /*
   * The non-argument constructor
   */
  public Number(){
    this.str = null;
    this.next = null;
  }
  /*
   * The setNext method which set the nextNumber
   * @param node
   */
  public void setNext(Number node){ 
    this.next = node;
  }
  /*
   * The getNext method return the next node
   * @return 
   */
  public Number getNext(){
    return this.next;
  }
 
  /*
   * The getValue method return the value of node
   * @return 
   */
  public String getValue(){
    return this.str;
  }
  /*
   * The setValue method set the value of node
   * @param x the string save in the node 
   */
  public void setValue(String x){
    this.str = x;
  }
  /*
   * The print method display the value of the node 
   */
  public void print(){
    System.out.println(this.str + " ");
  }
}