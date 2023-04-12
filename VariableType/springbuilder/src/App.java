
// https://www.youtube.com/watch?v=K2OD-3NBE6s
import java.lang.StringBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        String firstName = "Tonis";
        String lastName = "Ferreira";
        String phraseFull = stringBuilder.append(firstName).append(lastName).toString();
        System.out.println("Frase Completa:" + phraseFull);
    }

}
