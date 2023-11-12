public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        num1 = 20;
        final int num2 = 10;
        // num2 = 20;  // コンパイルエラー
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
