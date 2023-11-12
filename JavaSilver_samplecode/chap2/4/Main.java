public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 30;
        // long num3 = 10000000000;    // コンパイルエラー
        long num3 = 10000000000L;
        // float num4 = 10.0;          // コンパイルエラー
        float num4 = 10.0F;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
