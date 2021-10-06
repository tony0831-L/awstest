import java.util.Scanner;
class Flow5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("begin=?");
        int begin = sc.nextInt();
        System.out.print("step=?");
        int step = sc.nextInt();
        System.out.print("end=?");
        int end = sc.nextInt();
        sc.close();
        for (int i = begin; i < end; i+=step) {
            System.out.println(i);
        }
        System.out.println("ok");
    };
}