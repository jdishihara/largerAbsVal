public class App {


    public static void printLargerAbs(int x, int y){

        if (x < y){
            System.out.println(y*-1);
        } else {
            System.out.println(x*-1);
        }


    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        printLargerAbs(-10, -3);
    }
}
