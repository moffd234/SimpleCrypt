public class CaesarCipher extends ROT13{
    public CaesarCipher(){

    }

    public String rotate(String s, int shift) {
        String output = "";
        for(Character letter : s.toCharArray()){
            if(Character.isLetter(letter)) {
                output += getEncryptedChar(letter, shift);
            }
            else{
                output += letter;
            }
        }
        return output;
    }

    public String decrypt(String text, int shift) {
        String output = "";
        for(Character letter : text.toCharArray()){
            if(Character.isLetter(letter)) {
                output += getDecryptedChar(letter, shift);
            }
            else{
                output += letter;
            }
        }
        return output;
    }
    static Character getDecryptedChar(Character letter, int shiftAmount) {
        String lowercaseAlpha = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if(Character.isLowerCase(letter)){
            int index = (lowercaseAlpha.indexOf(letter) - shiftAmount) % 26;
            index = (index + 26) % 26; // Avoids negative index
            return lowercaseAlpha.charAt(index);
        }

        int index = (uppercaseAlpha.indexOf(letter) - shiftAmount) % 26;
        index = (index + 26) % 26; // Avoids negative index
        return uppercaseAlpha.charAt(index);
    }
}
