public class SuperSecureCipher {
    private final String cipherAlphabet = "q w e r t y u i o p a s d f g h j k l z x c v b n m";
    private final String capCipherAlpha = "Q W E R T Y U I O P A S D F G H J K L Z X C V B N M";
    private final String alphabet =       "a b c d e f g h i j k l m n o p q r s t u v w x y z";
    private final String capAlphabet =    "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";

    public String encrypt(String input){
        String output = "";

        for(char c : input.toCharArray()){
            if(Character.isLowerCase(c) && Character.isLetter(c)){
                int index = alphabet.indexOf(c);
                output += cipherAlphabet.charAt(index);
            }
            else if(Character.isUpperCase(c) && Character.isLetter(c)){

                int index = capAlphabet.indexOf(c);
                output += capCipherAlpha.charAt(index);
            }
            else{
                output += c;
            }
        }

        return output;
    }

    public String decrypt(String input){
        String output = "";

        for(char c : input.toCharArray()){
            if(Character.isLowerCase(c) && Character.isLetter(c)){
                int index = cipherAlphabet.indexOf(c);
                output += alphabet.charAt(index);
            }
            else if(Character.isUpperCase(c) && Character.isLetter(c)){

                int index = capCipherAlpha.indexOf(c);
                output += capAlphabet.charAt(index);
            }
            else{
                output += c;
            }
        }

        return output;
    }

}
