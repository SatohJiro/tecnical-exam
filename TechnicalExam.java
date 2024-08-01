

public class TechnicalExam {
    public static void main(String[] args) {
        // test function 1
        printNumbers1To10();

        // test function 2
        printNumbersWithAForEven();

        // test function 3
        printNumbersWithAorB();

        // test function 4
        printNumbersWithAorBorAB();

        // test function 5
        System.out.println(convertTo12HourFormat("17:29")); // Output: 5:29PM



    }

    //Test 1
    public static void printNumbers1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //Test 2
    public static void printNumbersWithAForEven() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println('a');
            } else {
                System.out.println(i);
            }
        }
    }

    //Test 3
    public static void printNumbersWithAorB() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println('a');
            } else if (i % 3 == 0) {
                System.out.println('b');
            } else {
                System.out.println(i);
            }
        }
    }

    //Test 4
    public static void printNumbersWithAorBorAB() {
        for (int i = 1; i <= 10; i++) {
            if (i % 6 == 0) {
                System.out.println("ab");
            } else if (i % 2 == 0) {
                System.out.println('a');
            } else if (i % 3 == 0) {
                System.out.println('b');
            } else {
                System.out.println(i);
            }
        }
    }

    //Test 5
    public static String convertTo12HourFormat(String time24) {
        String[] parts = time24.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        String period = hour >= 12 ? "PM" : "AM";
        hour = hour % 12;
        hour = hour == 0 ? 12 : hour;

        return String.format("%d:%02d%s", hour, minute, period);
    }
}