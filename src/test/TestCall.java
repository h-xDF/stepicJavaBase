package test;

/**
 * Created by ypereyaslov on 28.03.2017.
 */
public class TestCall {

    public enum Nucleotide {

        A("1"),
        T("2"),
        G("3"),
        C("4"),
        N("5");

        private String text;

        Nucleotide(String text) {
            this.text = text;
        }


    }

    public static void main(String[] args) {

        TestEnum testEnum = new TestEnum();

        System.out.println( Nucleotide.valueOf("A"));
    }
}
