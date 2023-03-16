 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// 1
	   


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть x: ");

        while (!scanner.hasNextDouble()){
            System.out.println("Ввеліть число!");
            scanner.next();
        }
        double x = scanner.nextDouble();

        System.out.print("Введіть y: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Введіть число!");
            scanner.next();
        }
        double y = scanner.nextDouble();

        while (x*y == 0){
            System.out.println("Введіть нові значення.");
            System.out.print("Введіть нове х: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Введіть число.");
                scanner.next();
            }
            x = scanner.nextDouble();

            System.out.print("Введіть новий у: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Введіть число.");
                scanner.next();
            }
            y = scanner.nextDouble();
        }

        double result1 = (1/(x*y)) + (1/((x*x)+(y*y)))*(x-y);
        System.out.println("Результат (вхідні дані дійсного типу, результат – дійсного): " + result1);

        int xInt = (int) x;
        int yInt = (int) y;
        double result2 = (1.0/(xInt*yInt)) + (1.0/((xInt*xInt)+(yInt*yInt)))*(xInt-yInt);
        System.out.println("Результат (вхідні дані цілого типу, результат – дійсного): " + result2);

        int result3 = (int) ((1/(x*y)) + (1/((x*x)+(y*y)))*(x-y));
        System.out.println("Результат (вхідні дані дійсного типу, результат – цілого): " + result3);
    }
 }
	    //2
	      Scanner scanner = new Scanner(System.in);
      System.out.print("Введіть радіус круга: ");
      double r = scanner.nextDouble();
   System.out.print("Введіть кількість точок (n): ");
        int n = scanner.nextInt();
        double[] a = new double[n * 2];
        System.out.println("Введіть координати точок:");
        for (int i = 0; i < n * 2; i++) {
            a[i] = scanner.nextDouble();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            double x = a[i * 2];
            double y = a[i * 2 + 1];
            if (Math.sqrt(x * x + y * y) <= r) {
                count++;
            }
        }
        System.out.println("Кількість точок, що належать кругу: " + count);
    }

//3

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність матриці: ");
        int n = scanner.nextInt();
        int[][] x = new int[n][n];
        boolean[] l = new boolean[n];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int positiveCount = 0;
            int negativeCount = 0;
            for (int j = 0; j < n; j++) {
                if (x[i][j] > 0) {
                    positiveCount++;
                } else if (x[i][j] < 0) {
                    negativeCount++;
                }
            }
            l[i] = negativeCount > positiveCount;
        }
        System.out.print("Логічний вектор L: ");
        for (int i = 0; i < n; i++) {
            System.out.print(l[i] + " ");
        }
    

//4
 Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();
        String[] words = text.split("[\\s.,!?]+");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() != maxLength) {
                result.append(word).append(" ");
            }
        }
        System.out.println("Результат: " + result);
    }
        System.out.println("Lab 1 Java");
    }
}
