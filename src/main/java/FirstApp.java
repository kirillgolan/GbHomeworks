public class FirstApp {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a = 120;
        System.out.println("a = " + a);
        b = a / 2;
        System.out.println("b = a / 2 = " + b);
        c = b * 3;
        System.out.println("c = b * 3 =" + c);
        if (c < 100)    {
            System.out.println("c меньше ста");
        }
        else {
            System.out.println("c больше ста");
        }
        System.out.println("END");
    }
}