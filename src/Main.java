import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Vēlies turpināt? (Jā/ Nē):");
            String cont = scan.next();

            if(cont.equals("Nē")) {
                break;
            }

            // x
            System.out.print("Ievadi skaitli x: ");
            int usr_x = scan.nextInt();

            // y
            System.out.print("Ievadi skaitli y: ");
            int usr_y = scan.nextInt();

            // op
            System.out.println("Izvēlies matemātisko darbību (+, -, *, /): ");
            String usr_op = scan.next();

            // logic
            if(usr_op.equals("+")) {
                String fin_res = Integer.toString(sum(usr_x, usr_y));
                System.out.println("Result: " + fin_res);
            } else if (usr_op.equals("-")) {
                String fin_res = Integer.toString(sub(usr_x, usr_y));
                System.out.println("Result: " + fin_res);
            } else if (usr_op.equals("*")) {
                String fin_res = Integer.toString(mult(usr_x, usr_y));
                System.out.println("Result: " + fin_res);
            } else if (usr_op.equals("/")) {
                String fin_res = Integer.toString(div(usr_x, usr_y));
                System.out.println("Result: " + fin_res);
            } else {
                System.out.println("Error..");
            }
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }
}