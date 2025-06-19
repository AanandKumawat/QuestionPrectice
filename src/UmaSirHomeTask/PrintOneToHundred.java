package UmaSirHomeTask;

public class PrintOneToHundred {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int i=1;
        while (i<100){
            System.out.println(i);
            i++;
        }
        System.out.println(System.currentTimeMillis()-time);
    }
}
