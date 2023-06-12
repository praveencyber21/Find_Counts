package Strings.Wordcount;

import java.util.Scanner;

class Scan{
    static Scanner sc = new Scanner(System.in);
    static int Int(){
        return sc.nextInt();
    }
    static String String(){
        return sc.nextLine();
    }
    static char Char(){
        return sc.next().charAt(0);
    }
}