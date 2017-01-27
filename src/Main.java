import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and Color name (1), a Hex code (2), or an RGB triplet (3)");
        String pos = input.next();
        if (pos.equalsIgnoreCase("1")) {

        } else if (pos.equalsIgnoreCase("2")) {

        } else if (pos.equalsIgnoreCase("3")) {
            hex h = new hex();
            String red = h.RGBtoHex();
        }
    }
}
