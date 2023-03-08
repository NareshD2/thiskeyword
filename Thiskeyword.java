public class Thiskeyword {

    Thiskeyword() {
        this("hello");
        System.out.println("how are you all");

    }

    Thiskeyword(String n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        Thiskeyword obj = new Thiskeyword();
    }

}
