public class strcheck {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "  ";

        System.out.println(s2.isEmpty()); // true
        System.out.println(s1.isBlank()); // true

        System.out.println("apple".compareTo("cat")); // -1
    }
}
