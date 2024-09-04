public class Human{

  public String name;

  public Human () {
    System.out.println("I am the private constructor.");
  }

  public Human (String newName){
    this();
    name = newName;
  }
  
  public void setName (String newName) {
    name = newName;
  }
  

  public String getName(){
    return name;
  }
}