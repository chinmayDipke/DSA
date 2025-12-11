package Practice;

public class StringBuilderPractive {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");          // empt
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());


        String s = String.valueOf(sb1);
        System.out.println(s);

        String s1 = "Java";
        StringBuilder sb2 = new StringBuilder(s1);
        System.out.println(revrese("Java"));


        sb1.append("a");
        sb1.append(1);
        sb1.append(sb1);
        System.out.println(sb1.toString());

        StringBuilder sb3 = new StringBuilder("Jva");
        sb3.insert(1, sb1);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("abcd");
        sb4.delete(1, 3); // delete "cd"
        System.out.println(sb4);
    }

    static String revrese(String s){

        StringBuilder sb2 = new StringBuilder(s);
        return sb2.reverse().toString();
    }
}
