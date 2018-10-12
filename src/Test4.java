import java.io.*;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) throws IOException {
        File file = new File("numbery.txt");
        FileReader fr = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fr);
        String line;
        TreeSet<Integer>numbers = new TreeSet<>();
        int count =0;
        while((line = bfr.readLine())!=null){
            System.out.println("Przeczytana linia to: "+line);
            numbers.add(Integer.valueOf(line));
            count++;
        }
        System.out.println("Ilość unikalnych liczb: "+numbers.size());
        System.out.println("Ile jest liczb w pliku: "+count);
        System.out.println("Najmniejsza liczba: "+numbers.first());
        System.out.println("Największa liczba: "+numbers.last());
    }
}
