public class testFile {

  int number;

  public testFile(int initialNumber) {
    number = initialNumber;
    System.out.println("The initial number is " +number);
    if (number > 0) {
      System.out.println("This is a positive number!");
    } else if (number < 0) {
      System.out.println("Starting out with a negative balance, huh?");
    } else {
      System.out.println("How'd you get here?");
    }
  }

  public void doubleNumber() {
    int newNumber = number * 2;
    number = newNumber;
    System.out.println("The new number is "+number);
  }

  public void halfNumber() {
    if (number < 0) {
      System.out.println("This is a negative number! We can't halve this!");
      return;
    }
    int newNumber = number / 2;
    number = newNumber;
    System.out.println("The new number is "+number);
  }

  public int addNumber(int amountToAdd) {
    int oldNumber = number;
    int newNumber = number + amountToAdd;
    number = newNumber;
    System.out.println("The new number is "+number);
    if (oldNumber < 0 && newNumber >= 0){
      System.out.println("You're no longer in debt!");
    }
    return amountToAdd;
  }

// main method
  public static void main(String[] args) {
    testFile testNumber = new testFile(100);

    testNumber.doubleNumber();
    testNumber.halfNumber();
    testNumber.addNumber(500);

    testFile newTest = new testFile(-20);
    newTest.halfNumber();
    newTest.addNumber(500);
  }
}