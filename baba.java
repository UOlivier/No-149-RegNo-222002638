// java program that display three weeks and its days
class Main {
  public static void main(String[] args) {
     
    // initialize the variables

    int weeks = 3;
    int days = 7;

    // outer loop print weeks

    for (int i = 1; i <= weeks; ++i) {
      System.out.println("Week: " + i);

        // inner loop prints days
 
      for (int j = 1; j <= days; ++j) {
        System.out.println("  Day: " + j);
      }
    }
  }
}