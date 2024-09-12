//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i ++)
            printSmth("loh", 2);
    }

    public static void printSmth(String a1, int b) {
        for (int i = 0; i <= b; i++)
            System.out.print(a1);
    }

    public String end = "END";
}