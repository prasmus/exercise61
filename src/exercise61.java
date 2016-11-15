/**
 * Created by opilane on 15.11.2016.
 */
public class exercise61 {
    public static void main(String[] args){
        countup(3);
        System.out.println("the end");
    }
    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }
} //noenopenope
