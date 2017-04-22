public class LinkedList{
  //Declare appropriate variables.
  private Number root;
  private int size =0;
  
// The default constructor
  public LinkedList(){
    root = null;
  }
  
//The setRoot method that set the first node of the list
  public void setRoot(Number first){
    this.root = first;
    this.size = 1;
  }
  
//The getRoot method that return the first node's value of the list.
  public Number getRoot(){
    return this.root;
  }
  
  public void add(int number){
    //Creat a new Number object that has the value of the str
    Number newNumber = new Number(number);
    //Check the list is empty or not
      if(this.isEmpty()){
        this.root = newNumber;
      }
      
      //add to the fornt of node list
      else{
        newNumber.setNext(root);
        root.setPrev(newNumber);
        this.root = newNumber;
      }
      //increment the size 
      size++;
  }
  /**
   * The switchNumber method swap the position of the two nodes
   * @param data1
   * @param data2
   */
  public void switchNumbers(Number data1, Number data2){
    if(data1.getPrev() == null){
      data1.setNext(data2.getNext());
      data2.setNext(data1);
      data1.setPrev(data2);
      root = data2;
    }
    else{
      Number temp = data1.getPrev();
      temp.setNext(data2);
      data1.setNext(data2.getNext());
      data2.setNext(data1);
      data2.setPrev(temp);
      data1.setPrev(data2);
    }
  }
  public void bubbleSort(){
    boolean swap = false;
    Number temp = root;
    Number temp1 = root.getNext();
    while(!swap){
    for(int i= 0; i<size; i++){
      if(temp.getValue() > temp1.getValue()){
        switchNumbers(temp, temp1);
        swap = true;
      }
      else{
        swap = false;
      }
        temp = temp1;
        temp1 = temp1.getNext();
    }
  }
  }
  // The destory method that delete/destroy the list
  public void destory(){
    root = null;
    size = 0;
  }
  //The pop method return and delete the top node of the list
  public Number pop() {
    if (this.isEmpty())
      return null;
    Number temp = this.root;
    this.root = this.root.getNext();
    temp.setNext(null);
    this.size--;
    return temp;
  }
  
  //The forward method that traverse the list forwards and print
  public void print(){
     Number temp = root;
     if(isEmpty()){
       System.out.println("The list is empty");
     }
     else{
       while(temp.getNext()!= null){
        temp.print();
        temp = temp.getNext();
     }
     temp.print();
     System.out.println("");
     }
  }
  
  
  // return the size of the list
  public int size(){
    return this.size;
  }
  
  //Flag the isEmpty or not
  private boolean isEmpty(){
    return this.root==null;
  }  
}