public class testFile {

  int number;

  public testFile(int initialNumber) {
    number = initialNumber;
    System.out.println("The initial number is " +number);
  }

  public void doubleNumber() {
    int newNumber = number * 2;
    number = newNumber;
    System.out.println("The new number is "+number);
  }

  public void halfNumber() {
    int newNumber = number / 2;
    number = newNumber;
    System.out.println("The new number is "+number);
  }

  public int addNumber(int amountToAdd) {
    int newNumber = number + amountToAdd;
    number = newNumber;
    System.out.println("The new number is "+number);
    return amountToAdd;
  }

// main method
  public static void main(String[] args) {
    testFile testNumber = new testFile(100);

    testNumber.doubleNumber();
    testNumber.halfNumber();
    testNumber.addNumber(500);

  }
}