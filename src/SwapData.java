public class SwapData {
    public static void swapData(String first, String second){
        String a = first;
        String b = second;
        String temp = b;
        b=a;
        a=temp;
        System.out.println("First: "+a);
        System.out.println("Second: "+b);
    }
    public static void main(String[] args) {
        swapData("First","Second");
    }
}