public class testFile {
  public testFile() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    testFile test = new testFile();
    
    System.out.println(test);
  }
}