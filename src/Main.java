import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter and Color name (1), a Hex code (2), or an RGB triplet (3)");
        String pos = input.next();
        if (pos.equalsIgnoreCase("1")) {
            CommonName c = new CommonName();
            System.out.println("Enter any common HTML name");
            String res = input.next();
            c.nextMethod(res);



        } else if (pos.equalsIgnoreCase("2")) {
            CommonName code = new CommonName();
            System.out.println("Enter your Hexidecimal code");
            String code1 = input.next();
            code.almostDone(code1);

        } else if (pos.equalsIgnoreCase("3")) {
            hex h = new hex();
            String red = h.RGBtoHex();
        }
    }
}
