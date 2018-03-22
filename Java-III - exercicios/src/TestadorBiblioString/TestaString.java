package TestadorBiblioString;

public class TestaString {

    public static void main(String[] args) {
        String s = "fj11 2 ";
        s=s.replaceAll("1", "2");
        System.out.println(s);
        
        System.out.println(s.isEmpty());
        
    }
}