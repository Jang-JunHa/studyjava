package ch3;

public class OperatorEx5 {
    public static void main(String[] args) {
        /*
        정수형식으로 산술할때와 실수형식으로 산술할때는 다른 값으로 나온다.
         */
        int a =10;
        int b =4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
    }
}
