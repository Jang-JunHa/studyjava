package ch2;

public class FloatToBinEx {
    public static void main(String[] args) {
/*
int 와 float 의 형변환 및 실제 저장값을 확인
 */
        float f =9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n" ,f);
        System.out.printf("%X%n",i);
    }
}
