package Aug_12;

public class inheritance implements telephone,phone{

    void sleep() {
        System.out.println("ZZZZZZ");
    }

    void talk() {
        System.out.println("HEE HAAW");
    }

    @Override
    public void sum() {
        System.out.println("2+2");
    }

    @Override
    public void sum(int arg1, int arg2) {
        System.out.println(arg1 + arg2);
    }
}
