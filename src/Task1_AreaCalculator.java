public class Task1_AreaCalculator {
    public static void main(String[] args) {
        double radius = 8;
        double area = 0;
        double circumference = 0;
        double Pie = 3.14;

        area = Pie * (radius*radius);
        circumference = 2 * Pie * radius;

        System.out.println("The area is " + area );
        System.out.println( " The circumference is " + circumference);
        }
    }


