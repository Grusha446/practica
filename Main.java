import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Operations summ = (x, y) -> (int) (x + y);
        Operations sub = (x, y) -> (int) (x - y);
        Operations mult = (x, y) -> (int) (x * y);
        Operations div = (x, y) -> (int) (x / y);
        System.out.println("Введите первое число");
        double a = in.nextDouble();
        System.out.println("Введите операцию");
        char operation = in.next().charAt(0);
        System.out.println("Введите второе число");
        double b = in.nextDouble();
        double result;
        switch (operation)
        {
            case '+':
                result = summ.method(a,b);
                System.out.println(result);
                break;
            case '-':
                result = sub.method(a,b);
                System.out.println(result);
                break;
            case '*':
                result = mult.method(a,b);
                System.out.println(result);
                break;
            case '/':
                result = div.method(a,b);
                System.out.println(result);
                break;
            default:
                System.out.println("Такой операции нет в списке");
                break;
        }
    }
}
interface Operations {
    int method(double x, double y);
}