public class Methods {
    public static void main(String[] args) {
        ron(args[0]);
        mon(args[1]);
    }

    static void ron(String ron) {
        System.out.println(ron + ron + ron + ron + ron);
        System.out.println(" " + " " + " " + " " + ron);
        System.out.println(" " + " " + " " + " " + ron);
        System.out.println(ron + " " + " " + " " + ron);
        System.out.println(" " + ron + ron + ron + " ");
    }

    static void mon(String mon) {
        System.out.println(mon + " " + " " + " " + mon);
        System.out.println(mon + mon + " " + mon + mon);
        System.out.println(mon + " " + mon + " " + mon);
        System.out.println(mon + " " + " " + " " + mon);
        System.out.println(mon + " " + " " + " " + mon);
    }
}