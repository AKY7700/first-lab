import java.util.Scanner;

/**
 * Created by LENOVO on 16/01/2022.
 */
public class method {
    public static void output_method(int []x)
    {
        for (int i = 0; i <x.length; i++) {
            System.out.println(x[i]);
        }
    }
    public static void input_method(int []y)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <y.length ; i++) {
            y[i]=input.nextInt();
        }
    }
    public static void main(String[] args) {
        int a []= new int[5];
        input_method(a);
        output_method(a);

    }
}
