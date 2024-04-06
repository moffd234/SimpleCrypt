import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuperSecureCipherTests {
    SuperSecureCipher ssc;

    @Before
    public void setup(){
        ssc = new SuperSecureCipher();
    }
    @Test
    public void superSecureEncryptTest() {
        String input = "heLlo";
        String expected = "itSsg";

        String actual = ssc.encrypt(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void superSecureEncryptTest1() {
        String input = "world";
        String expected = "vgksr";

        String actual = ssc.encrypt(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void superSecureEncryptTest2() {
        String input = "Hello World";
        String expected = "Itssg Vgksr";

        String actual = ssc.encrypt(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void superSecureDecryptTest() {
        String expected = "heLlo";
        String input = "itSsg";

        String actual = ssc.decrypt(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void superSecureDecryptTest1() {
        String expected = "world";
        String input = "vgksr";

        String actual = ssc.decrypt(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void superSecureDecryptTest2() {
        String expected = "Hello World";
        String input = "Itssg Vgksr";

        String actual = ssc.decrypt(input);
        Assert.assertEquals(expected, actual);
    }

}
