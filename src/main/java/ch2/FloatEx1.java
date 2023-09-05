package ch2;

public class FloatEx1 {
    public static void main(String[] args) {
        /*
        * 실수형의 오버플로우가 발생시 무한대(infinity) 발생
        * 언더플로우 : 실수형으로 포현할수 없는 아주 작은 값, 양츼 최소값보다 작은 값이 되는 경우
        * float : 연산속도의 향상이나 메모리를 절약
        * double : 더 큰값의 범위 혹은 더 높은 정밀도를 필요 시
        */
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("    123456789012345678901234%n");
        System.out.printf("f  : %f%n", f);   //  소수점 이하 6째자리까지 출력
        System.out.printf("f  : %24.20f%n",f);
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d  : %24.20f%n", d);
    }
}
