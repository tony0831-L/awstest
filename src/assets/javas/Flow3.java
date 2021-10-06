import java.util.Scanner;

class Flow3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("begin=?");
        int begin = sc.nextInt();
        System.out.print("step=?");
        int step = sc.nextInt();
        System.out.print("end=?");
        int end = sc.nextInt();
        sc.close();
        do {
            System.out.println(begin);
            begin+=step;
        } while (begin<=end);
        System.out.println("ok");
    }
}