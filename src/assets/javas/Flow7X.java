import java.util.Scanner;
class Flow7X{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("end=");
        int end = sc.nextInt();
        sc.close();
        int ans =0;
        for(int i =1;i<=end;i++){
            ans+=(i*i);
            System.out.println(ans);
        }
    }
}