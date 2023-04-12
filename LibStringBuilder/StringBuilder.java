public class StringBuilder {
      public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();
        String firsName = "Tonis";
        String lastName = "Ferreira";
        String city = "Alto Alegre do Maranhão";
        String neighBorHood = "Centro";
        String state = "Maranhão";

        String fullPhrase = strBuilder.append(firsName).toString();
        System.out.println(fullPhrase);

    }
}
