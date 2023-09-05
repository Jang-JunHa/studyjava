package ch2;

public class OverflowEx {
    public static void main(String[] args) {
/*
    오버플로우(overflow) : 타입이 표현할 수 있는 값의 범위를 넘어서는것
    최소값 -1 = 최대값
    최대갑 +1 = 최소값
 */
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1=" + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax +1 = " + (short)(sMax+1));
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1=" + (int)--cMin);
        System.out.println("cMax =" + (int)cMax);
        System.out.println("cMax+1=" + (int)++cMax);

    }
}
