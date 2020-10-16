public class Main {

    public static void main(String[] args) {
        Fraction F = new Fraction(4, 7);
        assert F != null : "error: constructor error";
        assert F.toString() == "4/3" : "error: method toString()";
    }
}
