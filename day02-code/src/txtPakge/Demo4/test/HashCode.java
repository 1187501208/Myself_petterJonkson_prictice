package txtPakge.Demo4.test;

public class HashCode {
    public static void main(String[] args) {
        String[] a={"dfa","fad","fads"};
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%s\n",a);
        }
        System.out.println("--------------");
        System.out.print(a.hashCode());
        System.out.println(a[0].hashCode());
    }
}
