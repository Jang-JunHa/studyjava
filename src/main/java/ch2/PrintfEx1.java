package ch2;

public class PrintfEx1 {
    public static void main(String[] args){
     /* 첫 셋팅할때는 인코딩이 MS949로 들어갈수 있다.
        필수적으로 UTF-8로 코딩하게 변경하고 간다.
    */

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_100_100_100L;    // long big =00000000000
        long hex = 0xFFFF_FFFF_FFF_FFFFL;

        int octNum = 010;       //8진수 10, 10진수로는 8
        int hexNum = 0x10;      //16진수 10, 10진수로는 16
        int binNum = 0b10;      //2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int) c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);        // '#'은 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum,octNum);
        System.out.printf("hexNum%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}
