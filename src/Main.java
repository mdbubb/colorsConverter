import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and Color name (1), a Hex code (2), or an RGB triplet (3)");
        String pos = input.next();
        if(pos.equalsIgnoreCase("1")){

        }
        else if (pos.equalsIgnoreCase("2")){

        }
        else if (pos.equalsIgnoreCase("3")){
            System.out.println("Enter the red value");
           hex h = new hex();
            hex2 d = new hex2();
            String red = h.RGBtoHex();
                    red = d.nextMethod();
        }
    }
}
