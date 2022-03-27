import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        BigInteger f = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= n; i++) {

            f = f.multiply(BigInteger
                    .valueOf(Integer.parseInt(String.valueOf(i))));

        }

        System.out.println(f);
    }
}
