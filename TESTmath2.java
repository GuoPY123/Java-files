public class TESTmath2 {
    public static void main(String[] args) {
        double a = 5.2;
        double b = 3.1;
        double div = a / b;
        double mod = a % b;
        System.out.println(div + "\n" + mod);
        System.out.println("5/0.0=" + 5 / 0.0);
        System.out.println("-5/0.0=" + -5 / 0.0);
        System.out.println("5%0.0=" + 5 % 0.0);
        System.out.println("-5%0.0=" + -5 % 0.0);
        System.out.println("0%5.0=" + 0 % 5.0);
        System.out.println("0%0.0=" + 0 % 0.0);
        System.out.println("-5/0=" + -5 / 0 + "\n" + "-5%0=" + -5 % 0);
    }
}
