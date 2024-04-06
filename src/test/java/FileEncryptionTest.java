import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEncryptionTest {
    String folderPath;
    String fileContents;
    Path path;

    @Before
    public void setup(){
        path = Path.of("/Users/dan/Dev/Zipcode/Week 5/SimpleCrypt/sonnet18.txt");
        folderPath = "/Users/dan/Dev/Zipcode/Week 5/SimpleCrypt/";
        try {
            fileContents = Files.readString(path);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    @Test
    public void testSuperSecureCypher() throws IOException {
        // Given
        SuperSecureCipher ssc = new SuperSecureCipher();
        String output = ssc.encrypt(fileContents);  // Encrypt the file contents

        // While
        Path outputPath = Path.of(folderPath + "SSC.txt");
        writeToFile(outputPath, output); // Write the encrypted contents to a new file


        String input = Files.readString(outputPath);
        String actual = ssc.decrypt(input); // Decrypt file contents

        // Then
        Assert.assertEquals(fileContents, actual);
    }

    @Test
    public void testCaesarCipher() throws IOException {
        // Given
        CaesarCipher cc = new CaesarCipher();
        String output = cc.rotate(fileContents, 10);  // Encrypt the file contents

        // While
        Path outputPath = Path.of(folderPath + "CC.txt");
        writeToFile(outputPath, output); // Write the encrypted contents to a new file

        String input = Files.readString(outputPath);
        String actual = cc.decrypt(input, 10); // Decrypt file contents

        // Then
        Assert.assertEquals(fileContents, actual);
    }

    @Test
    public void testROT13() throws IOException {
        // Given
        ROT13 rot13 = new ROT13();
        String output = rot13.encrypt(fileContents);  // Encrypt the file contents

        // While
        Path outputPath = Path.of(folderPath + "ROT13.txt");
        writeToFile(outputPath, output); // Write the encrypted contents to a new file


        String input = Files.readString(outputPath);
        String actual = rot13.decrypt(input); // Decrypt file contents

        // Then
        Assert.assertEquals(fileContents, actual);
    }

    public void writeToFile(Path filePath, String contents){
        try {
            Files.writeString(filePath, contents);
        } catch (IOException e) {
            System.out.println("File not found " + filePath);
        }
    }

}
