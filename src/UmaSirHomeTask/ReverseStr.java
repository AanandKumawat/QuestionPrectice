package UmaSirHomeTask;

public class ReverseStr {
    public static void reverseMe2(String str){
        int i=0;int j=str.length()-1;
        while (i<=j){
        }
    }
    public static StringBuilder reverse(String str){
        StringBuilder sb=new StringBuilder("");
        for (int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb;
    }
    public static void main(String[] args) {
        // reverse String without existing method.
        String str="ankit sir uma sir";
        System.out.println(reverse(str));
    }
}
