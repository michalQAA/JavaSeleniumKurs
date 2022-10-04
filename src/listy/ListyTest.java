package listy;

import docs.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Pawel");
        names.add("Kasia");
        names.add("Ola");
        names.add("Pawel");

        System.out.println(names.get(0));
        System.out.println(names.indexOf("Pawel"));
        System.out.println(names.lastIndexOf("Pawel"));
        System.out.println(names.contains("Krysia"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("numery " + numbers.get(0));
        System.out.println("numery " + numbers.indexOf(2));
        System.out.println("numery " + numbers.lastIndexOf(4));
        System.out.println("numery " + numbers.contains(3));
        System.out.println("numery " + numbers.size());
        System.out.println("numery " + numbers.isEmpty());

        List<String> diffName = new ArrayList<>();
        diffName.addAll(names);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());

        for(int i = 0; i < names.size(); i++) {
            System.out.println("imie " + names.get(i));
        }
    }
}
