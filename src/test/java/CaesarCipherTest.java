import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaesarCipherTest {
    CaesarCipher cc;
    @Before
    public void setup(){
        cc = new CaesarCipher();
    }
    @Test
    public void testEncrypt() {
        String base = "HELLO";
        String expected = "KHOOR";
        int shift = 3;

        String actual = cc.rotate(base, shift);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEncrypt1() {
        String base = "OPEN SESAME";
        String expected ="VWLU ZLZHTL";
        int shift = 7;

        String actual = cc.rotate(base, shift);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEncrypt2() {
        String base = "ATTACK AT DAWN";
        String expected = "FYYFHP FY IFBS";
        int shift = 5;

        String actual = cc.rotate(base, shift);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEncrypt3() {
        String base = "CAESAR CIPHER";
        String expected = "MKOCKB MSZROB";
        int shift = 10;

        String actual = cc.rotate(base, shift);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEncrypt4() {
        String base = "ENCRYPTION";
        String expected = "RAPELCGVBA";
        int shift = 13;

        String actual = cc.rotate(base, shift);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDecrypt() {
        String expected = "HELLO";
        String base = "KHOOR";
        int shift = 3;

        String actual = cc.decrypt(base, shift);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDecrypt1() {
        String expected = "OPEN SESAME";
        String base ="VWLU ZLZHTL";
        int shift = 7;

        String actual = cc.decrypt(base, shift);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDecrypt2() {
        String expected = "ATTACK AT DAWN";
        String base = "FYYFHP FY IFBS";
        int shift = 5;

        String actual = cc.decrypt(base, shift);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDecrypt3() {
        String expected = "CAESAR CIPHER";
        String base = "MKOCKB MSZROB";
        int shift = 10;

        String actual = cc.decrypt(base, shift);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testDecrypt4() {
        String base = "RAPELCGVBA";
        String expected = "ENCRYPTION";
        int shift = 13;

        String actual = cc.decrypt(base, shift);
        Assert.assertEquals(expected, actual);
    }
}
