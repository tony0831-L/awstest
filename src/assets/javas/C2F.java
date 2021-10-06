class C2F{
    public static void main(String[] args) {
        java.util.Scanner  sc = new java.util.Scanner (System.in);
        double x;
        System.out.print("c:?");
        x = sc.nextDouble();
        System.out.print(x+"degc==>"+(x*9.0/5.0+32.0)+"degF");
    }
}