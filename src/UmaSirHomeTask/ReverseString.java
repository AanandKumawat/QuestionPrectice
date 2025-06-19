package UmaSirHomeTask;

public class ReverseString {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("aaanand");
      StringBuffer sbRev=sb.reverse();
        System.out.println(sb);
        if (sb.equals(sbRev)){
            System.out.println("is palindrom");
        }else{
            System.out.println("is not palindrom");
        }
    }
}
