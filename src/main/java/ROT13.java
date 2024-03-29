import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    static int shift;

    ROT13(Character cs, Character cf) {
        shift = cf - cs;
    }

    ROT13() {
        shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        return encrypt(text);
    }

    // Could be done using int value of letter (letter - A or a + 13) % 26
    // But I was mad at myself for googling something that I should've known
    // So I forced myself to find another way to do it which resulted in this mess
    public String encrypt(String text) {

        String output = "";
        for(Character letter : text.toCharArray()){
            if(Character.isLetter(letter)) {
                output += getEncryptedChar(letter, shift);
            }
            else{
                output += letter;
            }
        }
        return output;
    }

    private static Character getEncryptedChar(Character letter, int shiftAmount) {
        String lowercaseAlpha = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if(Character.isLowerCase(letter)){
            int index = (lowercaseAlpha.indexOf(letter) + shiftAmount) % 26;
            return lowercaseAlpha.charAt(index);
        }

        int index = (uppercaseAlpha.indexOf(letter) + shiftAmount) % 26;
        return uppercaseAlpha.charAt(index);
    }

    public String decrypt(String text) {
        return encrypt(text);
    }

    public String rotate(String s, Character c) {
        int shiftAmount = (c - s.charAt(0) + 26) % 26;
        String output = "";
        for(Character letter : s.toCharArray()){
            if(Character.isLetter(letter)) {
                output += getEncryptedChar(letter, shiftAmount);
            }
            else{
                output += letter;
            }
        }
        return output;
    }


}
