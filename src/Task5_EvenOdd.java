public class Task5_EvenOdd {
    public static void main(String[] args) {
        int testNumber = 7;
        String result = checkEvenOdd(testNumber);
        System.out.println("The number " + testNumber + " is " + result + ".\n");

        // Bonus (+2): Test numbers 1 to 10 using a for loop
        System.out.println("--- Testing Numbers 1 to 10 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " is " + checkEvenOdd(i));
        }
    }

    // Method to check if a number is Even or Odd
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
