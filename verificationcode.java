public class verificationcode {
    public static void main(String[] args) {
        int a = 0;
        String ab = "";
        for (byte c = 00; c < 04; c++) {
            ab = "";
            for (int i = 0; i < 6; i++) {
                a += Math.random() * 5;
                if (a >= 10) {
                    a -= 10;
                }
                ab += a;
            }
            System.out.println(ab);
        }
    }
}
