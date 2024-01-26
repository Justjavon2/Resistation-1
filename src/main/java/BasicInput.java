import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        int vergilinteger = scnr.nextInt();


        System.out.println("Enter double:");
         double vergilDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        char vergilcharacter = scnr.next().charAt(0);

        System.out.println("Enter string:");
        String vergilstring=scnr.next();

        System.out.println(vergilinteger+ " " + vergilDouble + " " + vergilcharacter + " " + vergilstring);

    ///Backwards now
        System.out.println(vergilstring + " " + vergilcharacter  + " " +  vergilDouble + " " + vergilinteger);

        //hi



        ///// Cast
        System.out.println(vergilDouble + " cast to an integer is"+(int)vergilDouble);

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}