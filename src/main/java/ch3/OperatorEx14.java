package ch3;

public class OperatorEx14 {
    public static void main(String[] args) {

        /*
        * 대문자와 소문자 간의 코드 값 차이는 10진수로 32이다.
        */

        char c = 'a';
        for (int i=0; i<26; i++){
            System.out.print(c++);
        }
        System.out.println();

        c= 'A';
        for (int i=0; i<26; i++){
            System.out.print(c++);
        }
        System.out.println();

        c='0';
        for (int i=0; i<10; i++){
            System.out.print(c++);
        }
        System.out.println();
    }
}
