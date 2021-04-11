public class HelloInverted{
    public static void main(String[] args) {
	String str = "Hello, World!";
	System.out.println(str);
	StringBuilder strb = new StringBuilder(str);
	str = strb.reverse().toString();
	System.out.println(str);
    }
}
