//Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
//
//Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
public class Main {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        MakeString comparator = new MakeString(str1, 0);
        String result = comparator.compareStrings(str2);

        System.out.println(result);
    }
}
