package samples;

public class Happy {



   public boolean happy(int n) {

        while (n > 0) {
            int b = n;
            int r = 0;
            int a = 0;
            while (n >= 9) {
                r = n % 10;
                a += r * r;
                n = n / 10;

            }
            a += n * n;
            if (a == 1) {
                return true;

            }
            if (a == b * b) {
                return false;
            }
            n = a;
        }
        return  false;
   }
    public static void main(String[] args) {
        Happy obj = new Happy();

        System.out.println( obj.happy(7));
    }
}
