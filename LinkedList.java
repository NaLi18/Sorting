public class LinkedList{
  //Declare appropriate variables.
  private Number root;
  private Number endNumber;
  private int size;
  
// The default constructor
  public LinkedList(){
    root = null;
    endNumber = null;
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
  public void add(int index, String str){
    //Creat a new Number object that has the value of the str
    Number newNumber = new Number(str);
    
    //Check the index is in the range of the list
    if(index > this.size)
      //print a error message
      System.out.println("Index" + index + "doesn't exist");
    
    else {
      //Check the list is empty or not
      if(this.isEmpty()){
        this.root = newNumber;
        this.endNumber = root;
      }
      
      //add to the fornt of node list
      else if (index == 0) {
        newNumber.setNext(root);
        root.setPrev(newNumber);
        this.root = newNumber;
      }
      
      //add to the end of node list
      else if(index == this.size){
        Number currentNumber = this.getEnd();
        currentNumber.setNext(newNumber);
        newNumber.setPrev(currentNumber);
        endNumber = newNumber;
      }
      
      //add to the middle of node list
      else{
        Number temp = this.root;
        for(int i = 0; i < index - 1; i++) {
          temp = temp.getNext();
        }
        Number temp2 = temp.getNext();
        temp.setNext(newNumber);
        newNumber.setPrev(temp);
        newNumber.setNext(temp2);
        temp2.setPrev(newNumber); 
      }
      //increment the size 
      size++;
  }
  }
  
  //The insert method that insert a node in the list in alphabetical order 
  public void insert(String str){
    Number newNumber = new Number(str);
    Number temp = root;
    if(this.isEmpty()){
        this.root = newNumber;
        this.endNumber = root;
      }
    else
    {
      while(temp.getValue().compareTo(str)<0 && temp.getNext() != null)
          temp = temp.getNext();
      size++;
      if(temp.getNext()==null){
        temp.setNext(newNumber);
        newNumber.setPrev(temp);
        endNumber= newNumber;
      }
      else{
        newNumber.setNext(temp);
        temp.getPrev().setNext(newNumber);
        newNumber.setPrev(temp.getPrev());
        temp.setPrev(newNumber);
      }
  }
  }
  
  //The getEnd method that return the last node of the list
  public Number getEnd(){
    Number temp = root;
    while(temp.getNext()!= null)
      temp = temp .getNext();
    endNumber = temp;
    return endNumber;
  }
  
  //The found method that find a node that matches a String
  public Number found(String str){
     Number temp = null;
    if(isEmpty()){
      System.out.println("The list is empty");
      return null;
    }
    else if(endNumber.getValue().equals(str)){
      temp = endNumber;
      System.out.println("Found "+ str +" in the end of list");
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
    endNumber = null;
    size = 0;
  }
  
  //The forward method that traverse the list forwards and print
  public void forward(){
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
  
  //The backward method that traverse the list backwards and print
  public void backward(){
    Number temp = endNumber;
    if(isEmpty()){
      System.out.println("The list is empty");
    }
    else{
      while(temp.getPrev()!= null){
        temp.print();
        temp = temp.getPrev();
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