package Aug_19;
public class Main {
    public static void main(String[] args) {
        int x[] = {1,2,3,4,5,6};

        try {
           for (int y=0; y<=x.length;y++){
               System.out.println(x[y]);
           }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally called");
        }
    }
}
