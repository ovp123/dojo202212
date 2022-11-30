public class StringPool {

    String text = "text";
    String text2 = text.substring(2);

    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        String helloWorld = "Hello World";

        System.out.println(("Hello World") == helloWorld);                   // => true
        System.out.println(("Hello" + " " + "World") == helloWorld);         // => true
        System.out.println(('H' + "ello" + " " + "World") == helloWorld);    // => true
        System.out.println((hello + " " + world) == helloWorld);             // => false

        System.out.println((hello + " " + world).intern() == helloWorld);    // => true
        System.out.println((hello + " " + world) == helloWorld);             // => false
        System.out.println((hello + hello).intern() == hello + hello);       // => false
        System.out.println((hello + hello).intern() == "HelloHello");        // => true

        Object tot;

        StringPool s1 = new StringPool();
        StringPool s2 = new StringPool();
        System.out.println(s1.text == s2.text);
        System.out.println(s1.text2 == s2.text2);
//        for (short i = 0; i < 1000; i = (short)(i + 1)) {
//            System.out.println();
//        }



    }
}
