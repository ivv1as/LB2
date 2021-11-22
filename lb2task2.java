import java.util.Scanner;

public class lb2task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int flag = 0;
        int result = 1;
        do {
            System.out.println("Введите целое числовое значение для вычисления факториала, не превышающее 15");
            while (!s.hasNextInt()) {
                System.out.println("Введите корректные данные");
                s.next();
            }
            a = s.nextInt();
            flag = 1;
        }
        while (flag == 0);

        if ((a <= 15)&(a>=0)) {
            for (int i = 1; i <= a; i++) {
                result = result * i;}
                System.out.println(result);
            }
        else {
            System.out.println("Введите корректные данные");
        }
    }
}
