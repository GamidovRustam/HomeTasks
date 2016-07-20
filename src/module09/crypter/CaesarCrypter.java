package module09.crypter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaesarCrypter {
    private final char UP_CASE_A = 'A';
    private final char UP_CASE_Z = 'Z';
    private final char LOW_CASE_A = 'a';
    private final char LOW_CASE_Z = 'z';
    private final int NUMBER_OF_LETTERS = 26;
    private final int KEY;
    private static Map<Integer, Integer> versionKeys;
    private static int version;


    public CaesarCrypter(int key) {
        this.KEY = validateKey(key);
    }

    private char validateKey(int key) {
        version++;
        versionKeys = new HashMap<>();
        versionKeys.put(version, key);

        if (key > NUMBER_OF_LETTERS) {
            key = key % NUMBER_OF_LETTERS;
        }
        return (char) key;
    }



    public List<String> encrypt(List list) {
        List<String> encryptedList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            encryptedList.add(i, encrypt(String.valueOf(list.get(i))));
        }
        return encryptedList;
    }

    public String[] encrypt(String[] text) {
        String[] encryptedText = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            encryptedText[i] = encrypt(text[i]);
        }
        return encryptedText;
    }

    public String encrypt(String str) {
        return String.valueOf(encrypt(str.toCharArray()));
    }

    public char[] encrypt(char[] chars) {
        char[] encryptedChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= UP_CASE_A && chars[i] <= UP_CASE_Z) {
                if (chars[i] + KEY > UP_CASE_Z) {
                    encryptedChars[i] = (char) (UP_CASE_A + ((chars[i] + KEY) % UP_CASE_Z));
                } else {
                    encryptedChars[i] = (char) (chars[i] + KEY);
                }
            } else if (chars[i] >= LOW_CASE_A && chars[i] <= LOW_CASE_Z) {
                if (chars[i] + KEY > LOW_CASE_Z) {
                    encryptedChars[i] = (char) (LOW_CASE_A + (((chars[i] + KEY) % LOW_CASE_Z)));
                } else {
                    encryptedChars[i] = (char) (chars[i] + KEY);
                }
            } else {
                encryptedChars[i] = chars[i];
            }
        }
        return encryptedChars;
    }

    public List<String> decrypt(List<String> list) {
        List<String> decryptedList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            decryptedList.add(i, decrypt(list.get(i)));
        }
        return decryptedList;
    }

    public String[] decrypt(String[] text) {
        String[] decodedText = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            decodedText[i] = decrypt(text[i]);
        }
        return decodedText;
    }

    public String decrypt(String str) {
        return String.valueOf(decrypt(str.toCharArray()));
    }

    public char[] decrypt(char[] text) {
        char[] decodedText = new char[text.length];
        for (int i = 0; i < text.length; i++) {

            if (text[i] >= UP_CASE_A && text[i] <= UP_CASE_Z) {
                if (text[i] - KEY < UP_CASE_A) {
                    decodedText[i] = (char) (UP_CASE_Z - (UP_CASE_A % (text[i] - KEY)));
                } else {
                    decodedText[i] = (char) (text[i] - KEY);
                }
            } else if (text[i] >= LOW_CASE_A && text[i] <= LOW_CASE_Z) {
                if (text[i] - KEY < LOW_CASE_A) {
                    decodedText[i] = (char) (LOW_CASE_Z - (LOW_CASE_A % (text[i] - KEY)));
                } else {
                    decodedText[i] = (char) (text[i] - KEY);
                }
            } else {
                decodedText[i] = text[i];
            }
        }
        return decodedText;
    }

    public int getKey() {
        return KEY;
    }

    public static int getVersion() {
        return version;
    }
}
