public class LinkedList{
  //Declare appropriate variables.
  private Number root;
  private int size;
  
// The default constructor
  public LinkedList(){
    root = null;
    size = 0;
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
  
//The add method that add the new node to the list(fornt, middle, end)
  public void add(String str){
    //Creat a new Number object that has the value of the str
    Number newNumber = new Number(str);
    
    //Check the list is empty or not
      if(this.isEmpty()){
        this.root = newNumber;
      }
      
      //add to the fornt of node list
      else{
        newNumber.setNext(root);
        this.root = newNumber;
      }
      //increment the size 
      size++;
  }
  
  //The insert method that insert a node in the list in alphabetical order 
  public void insert(String str){
    Number newNumber = new Number(str);
    Number temp = root;
    if(this.isEmpty()){
        this.root = newNumber;
      }
    else
    {
      while(temp.getValue().compareTo(str)<0 && temp.getNext() != null)
          temp = temp.getNext();
      size++;
      if(temp.getNext()==null){
        temp.setNext(newNumber);
        newNumber.setPrev(temp);
      }
      else{
        newNumber.setNext(temp);
        temp.getPrev().setNext(newNumber);
        newNumber.setPrev(temp.getPrev());
        temp.setPrev(newNumber);
      }
  }
  }

  //The found method that find a node that matches a String
  public Number found(String str){
     Number temp = null;
    if(isEmpty()){
      System.out.println("The list is empty");
      return null;
    }
    else{
      temp = root;
      while(temp.getNext()!= null&& temp.getValue().compareTo(str) != 0){ 
        temp = temp.getNext();
      }
      if(temp.getNext() == null){
        System.out.println("the " +str+ " didn't exsit in the list");
        temp = null;
      }
      else
        System.out.println("Found "+ str +" in the list");
    }
    return temp;
    }
  
  //The remove method that delete a node from the list. 
  public void remove(Number node){
     Number temp1 = node.getNext();
    Number temp2 = node.getPrev();
    temp1.setPrev(temp2);
    temp2.setNext(temp1);
    size--;
  }
  
  // The destory method that delete/destroy the list
  public void destory(){
    root = null;
    size = 0;
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