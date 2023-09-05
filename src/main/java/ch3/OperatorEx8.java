package ch3;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b; // int 의 값으로 계산되어 있기때문에 long형으로 자동 형변환 되지않음

        System.out.println(c);
    }
}
