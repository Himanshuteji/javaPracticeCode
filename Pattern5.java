class Pattern5 {

  public static void main(String[] args) {
    int rows = 5; // Number of rows for the pyramid

    for (int i = 1; i <= rows; i++) {
      // Printing leading spaces
      for (int j = rows - i; j > 0; j--) {
        System.out.print(" ");
      }

      // Printing stars
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = rows; i >= 1; i--) {
      // Printing leading spaces
      for (int j = rows - i; j > 0; j--) {
        System.out.print(" ");
      }

      // Printing stars
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
