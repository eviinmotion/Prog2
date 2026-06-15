package de.thws.maven.klausurvorbereitung.palindomChecker;

public class Palindrom {
    public static String istPalindrom(String input){
        if(input == null || input.length() == 0){
            return "Kein Palindrom!";
        }
        int links = 0;
        int rechts = input.length()-1;

        while(links < rechts){
            if(input.charAt(links) != input.charAt(rechts)){
                return "Kein Palindrom!";
            }
            links++;
            rechts--;
        }
        return "Palindrome!";
    }
}
