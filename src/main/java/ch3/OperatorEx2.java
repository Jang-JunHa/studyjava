package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++; //후위형
        System.out.println("j=1++; 실행후, i=" + i +", j=" +j );

        i=5;
        j=0;
        j= ++i; // 전위형
        System.out.println("j=1++; 실행후, i=" + i +", j=" +j );
    }
}
