package Aug_12;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        phone p1 = new phone() {
            @Override
            public void sum(int arg1, int arg2) {
                System.out.println(arg1 + arg2);
            }

            @Override
            public void sum() {
                System.out.println("a+b");
            }
        };
        p1.sum();
        p1.sum(12,23);
    }
}