import java.util.Scanner;

/**
 * Created by mdb17 on 1/26/2017.
 */
public class hex {

    public String RGBtoHex() {
        String color;
        color = color1;
        hex2 h = new hex2();
        for (j = 0; j <= 2; j++) {
            if (j == 0) {
                color1 = "Red";
            }
            if (j == 1) {
                color1 = "Green";
            } else if (j == 2) {
                color1 = "Blue";
            }

            int a;
            a = hi;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your " + color1 + " value...The Hex values will appear right after each one is entered");
            hi = input.nextInt();
            if (hi > 0 && hi <= 255) {
                int goesInto = hi / 16;

                //int rem = 16 % hi;
                // System.out.println(rem);
                if (goesInto < 10) {
                    for (int j = 0; j < 10; j++) {
                        if (goesInto == j) {
                            System.out.println(j);
                            h.nextMethod();

                        }
                    }

                }


                if (goesInto == 10) {
                    System.out.println("A");
                    h.nextMethod();

                } else if (goesInto == 11) {
                    System.out.println("B");
                    h.nextMethod();

                } else if (goesInto == 12) {
                    System.out.println("C");
                    h.nextMethod();

                } else if (goesInto == 13) {
                    System.out.println("D");
                    h.nextMethod();

                } else if (goesInto == 14) {
                    System.out.println("E");
                    h.nextMethod();

                } else if (goesInto == 15) {
                    System.out.println("F");
                    h.nextMethod();

                }
            }
        }


        return "hi";
    }


    public static int hi;
    public static String color1;
    public static int j;
    public static String s;
}
