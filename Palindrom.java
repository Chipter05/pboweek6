package week5; 
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();
        
        // Pilih salah satu (TextGame atau FancyTextGame)
        TextGame game = new TextGame();
        // TextGame game = new FancyTextGame();  // Uncomment untuk versi fancy
        game.displayResult(input);
        
        scanner.close();
    }
}

// Kelas dasar untuk mengecek palindrom
class TextGame {
    public void displayResult(String word) {
        if (isPalindrome(word)) {
            System.out.println("Hasil: Palindrome");
        } else {
            System.out.println("Hasil: Bukan Palindrome");
        }
    }

    // Metode pengecekan palindrom
    protected boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanedWord).reverse().toString();
        return cleanedWord.equals(reversed);
    }
}

// Kelas turunan dengan tampilan lebih menarik
class FancyTextGame extends TextGame {
    @Override
    public void displayResult(String word) {
        if (isPalindrome(word)) {
            System.out.println(" Hasil: \"" + word + "\" adalah Palindrome ");
        } else {
            System.out.println(" Hasil: \"" + word + "\" bukan Palindrome ");
        }
    }
} 

