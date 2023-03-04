import java.util.Scanner;
public class Main {
    private static double sqr(double value) {
        return value*value;
    }
    private static double sqrr(double value) {
        return value*value*value;
    }
    public static void main(String[] args) {
        System.out.println("Lab 1 Java");
        Scanner in = new Scanner(System.in);
        System.out.println("1|  Input double x,y. Result->double");
        System.out.print("Input a: ");
        double a = in.nextDouble();
        System.out.print("Input b: ");
        double b = in.nextDouble();
        double x = a+(a+b-1)/(sqr(a)+2)-sqrr(a*b) ;
        System.out.println("Result: "+x);

        System.out.println("2|  Input Int x,y. Result->double");
        System.out.print("Input a: ");
        double a1 = in.nextDouble();
        System.out.print("Input b: ");
        double b1 = in.nextDouble();
        double x1 = a1+(a1+b1-1)/(sqr(a1)+2)-sqrr(a1*b1) ;
        System.out.println("Result: "+x1);

        System.out.println("3|  double Int x,y. Result->Int");
        System.out.println("Result: "+(int)x);
    }

}
