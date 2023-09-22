package ch3;

public class OperatorEx11 {
    public static void main(String[] args) {
        /*
        * char 형도 결국에는 2진수로 저장되기 때문에 형변환을 하게된다면 정수형으로 나온다.
        * */
        char a = 'a';
        char d = 'b';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d, a, d -a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two -zero);
        System.out.printf("'%c'=%d%n", a, (int)a);
        System.out.printf("'%c'=%d%n", d, (int)d);
        System.out.printf("'%c'=%d%n", two, (int)two);
        System.out.printf("'%c'=%d%n", zero, (int)zero);

    }
}
