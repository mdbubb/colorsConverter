import java.util.Scanner;

/**
 * Created by mdb17 on 1/26/2017.
 */
public class hex {

    public String RGBtoHex() {
        String color;
        color = color1;
        for(int i=0; i<=2; i++) {
            if (i == 0) {
                color1 = "Red";
            }
            if (i == 1) {
                color1 = "Green";
            } else if (i == 2) {
                color1 = "Blue";
            }

            int a;
            a = hi;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your " + color1 + " value");
            hi = input.nextInt();
            if (hi > 0 && hi <= 255) {
                int goesInto = hi / 16;
                //int rem = 16 % hi;
                // System.out.println(rem);
                if (goesInto < 10) {
                    for (int j = 0; i < 10; i++) {
                        if (goesInto == j) {
                            System.out.println(j);
                        }
                    }

                }

                if (goesInto == 10) {
                    System.out.println("A");
                } else if (goesInto == 11) {
                    System.out.println("B");
                } else if (goesInto == 12) {
                    System.out.println("C");
                } else if (goesInto == 13) {
                    System.out.println("D");
                } else if (goesInto == 14) {
                    System.out.println("E");
                } else if (goesInto == 15) {
                    System.out.println("F");

                }
            }
        }

return  "hi"   ; }


public static int hi;
public static String color1;
}
