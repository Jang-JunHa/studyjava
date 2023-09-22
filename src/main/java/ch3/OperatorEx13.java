package ch3;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

    //    char c2 = c1+1;   //컴파일 에러발생 - 사유 : 컴파일러가 미리 계산을 할수 없기 때문이다.
        char c2 = 'a'+1;
        System.out.println(c2);
    }
}
