package Strings.Wordcount;

public class Findoutcount {

    public static void main(String[] args) {
        
        System.out.println("Enter the String: ");
        String word = Scan.String();
        String result = Counts.count(word);
        System.out.println(result);
    }
    
}

