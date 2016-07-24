package module09.crypter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CaesarCrypterTest {
    private char[] chars = {'a', 'b', 'c', 'X', 'Y', 'Z'};
    private char[] encryptedChars = {'d', 'e', 'f', 'A', 'B', 'C'};
    private String string = "abcXYZ";
    private String encryptedString = "defABC";
    private String[] strings = {"abc", "XYZ", "qweRTY"};
    private String[] encryptedStrings = {"def", "ABC", "tzhUWB"};
    private List list = new ArrayList();
    private List encryptedList = new ArrayList();
    CaesarCrypter crypter = new CaesarCrypter(3);

    {
        for (int i = 0; i < strings.length; i++) {
            list.add(i, strings[i]);
        }
        for (int i = 0; i < strings.length; i++){
            encryptedList.add(i, encryptedStrings[i]);
        }
    }

    @Test
    public void encryptCharArrayTest(){
        char[] res = crypter.encrypt(chars);

        for (int i = 0; i < chars.length; i++){
            assertTrue(res[i] - encryptedChars[i] == 0);
        }
    }

    @Test
    public void decryptCharArrayTest(){
        char[] res = crypter.decrypt(encryptedChars);

        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] == chars[i]);
        }
    }

    @Test
    public void encryptString(){
        assertEquals(encryptedString, crypter.encrypt(string));
    }

    @Test
    public void decryptString(){
        assertEquals(string, crypter.decrypt(encryptedString));
    }

    @Test
    public void encryptStringArray(){
        assertArrayEquals(encryptedStrings, crypter.encrypt(strings));
    }

    @Test
    public void decryptStringArray(){
        assertArrayEquals(strings, crypter.decrypt(encryptedStrings));
    }

    @Test
    public void encryptList(){
        List res = crypter.encrypt(list);
        assertNotNull(res);

        for (int i = 0; i < res.size(); i++) {
            assertEquals(encryptedList.get(i), res.get(i));
        }
    }

    @Test
    public void decryptList(){
        List res = crypter.decrypt(encryptedList);
        assertNotNull(res);

        for (int i = 0; i < res.size(); i++) {
            assertEquals(list.get(i), res.get(i));
        }
    }
}
