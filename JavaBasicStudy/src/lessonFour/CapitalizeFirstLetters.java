package lessonFour;

import java.util.Scanner;

public class CapitalizeFirstLetters {
    public static String LetterCapitalize(String str) {
        String[] words = str.split(" "); // girilen stringi kelimelerine ayır
        StringBuilder sb = new StringBuilder(); // StringBuilder nesnesi oluştur
        for(String word : words) { // kelimeler için döngü
            sb.append(word.substring(0, 1).toUpperCase()); // ilk harfi büyüt
            sb.append(word.substring(1)); // geri kalan harfleri ekle
            sb.append(" "); // kelimelar arasına boşluk ekle
        }
        return sb.toString().trim(); // oluşan stringi döndür
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
}
