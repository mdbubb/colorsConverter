import java.util.Scanner;

/**
 * Created by mdb17 on 1/26/2017.
 */
public class hex2 {
    public String nextMethod() {
        Scanner input = new Scanner(System.in);

        int goesInto = hex.hi / 16;
        int rem = hex.hi %16;
        if(rem<10)
        for(int i=0; i<10; i++){
            if(i==rem){
                System.out.println(i);
            }

        } else {
            if (rem == 10) {
                System.out.println("A");
            } else if (rem == 11) {
                System.out.println("B");
            } else if (rem == 12) {
                System.out.println("C");
            } else if (rem == 13) {
                System.out.println("D");
            } else if (rem == 14) {
                System.out.println("E");
            } else if (rem == 15) {
                System.out.println("F");
            }

        }
    return "Hi";
    }
    public static String j;
}
