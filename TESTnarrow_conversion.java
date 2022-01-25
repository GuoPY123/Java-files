public class TESTnarrow_conversion {
    public static void main(String[] args) {
        int iValve = 235;
        byte bValve = (byte) iValve;
        System.out.println(bValve);
        double dValve = 3.98d;
        int tol = (int) dValve;
        System.out.println(tol);
    }
}
