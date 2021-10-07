import java.util.Scanner;
class Gcd{
    static int counter = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");int a = sc.nextInt();
        System.out.print("b=");int b = sc.nextInt();
        sc.close();
        System.out.println(gcd(a,b));
    }
    private static int gcd(int a,int b) {
        counter++;
        System.out.println(counter+":gcd("+a+","+b+")");
        return a%b==0? b : gcd(b,a%b);
    }
}