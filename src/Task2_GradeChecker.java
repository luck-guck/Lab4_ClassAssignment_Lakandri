public class Task2_GradeChecker {


    public static void main(String[] args) {

    int score = 85;

    // 1. Validate the score first
        if (score < 0 || score > 100) {
        System.out.println("Invalid score.");
    }
    // 2. Check for letter grades if validation passes
        else if (score >= 90) {
        System.out.println("Grade: A");
    } else if (score >= 80) {
        System.out.println("Grade: B");
    } else if (score >= 70) {
        System.out.println("Grade: C");
    } else if (score >= 60) {
        System.out.println("Grade: D");
    } else {
        System.out.println("Grade: F");
    }
}
}
