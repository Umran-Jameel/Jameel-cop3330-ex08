import java.util.*;

public class Exercise8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many people? ");
        String peo = in.nextLine();
        int people = Integer.parseInt(peo);

        System.out.print("How many pizzas do you have? ");
        String piz = in.nextLine();
        int pizza = Integer.parseInt(piz);

        System.out.print("How many slices per pizza? ");
        String sli = in.nextLine();
        int slices = Integer.parseInt(sli);

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizza, slices);
        System.out.printf("Each person gets %d slices of pizza.\n", (slices * pizza) / people);
        System.out.printf("There are %d leftover pieces.\n", (slices * pizza) % people);
    }
}
