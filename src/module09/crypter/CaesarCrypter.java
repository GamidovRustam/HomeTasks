package module09.crypter;

public class CaesarCrypter {
    private final char A = 'A';
    private final char Z = 'Z';
    private final char a = 'a';
    private final char z = 'z';
    private final int key;


    public CaesarCrypter(int key) {
        this.key = validateKey(key);
    }

    private char validateKey(int key) {
        if (key > 26) {
            key = key % 26;
        }
        return (char) key;
    }

    public String[] encryptText(String[] text) {
        String[] encryptedText = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            encryptedText[i] = encryptString(text[i]);
        }
        return encryptedText;
    }

    public String encryptString(String str) {
        String encryptedString = String.valueOf(encryptCharArray(str.toCharArray()));
        return encryptedString;
    }

    public char[] encryptCharArray(char[] chars) {
        char[] encryptedChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= A && chars[i] <= Z) {
                if (chars[i] + key > Z) {
                    encryptedChars[i] = (char) (A + ((chars[i] + key) % Z));
                } else {
                    encryptedChars[i] = (char) (chars[i] + key);
                }
            } else if (chars[i] >= a && chars[i] <= z) {
                if (chars[i] + key > z) {
                    encryptedChars[i] = (char) (a + (((chars[i] + key) % z)));
                } else {
                    encryptedChars[i] = (char) (chars[i] + key);
                }
            } else {
                encryptedChars[i] = chars[i];
            }
        }
        return encryptedChars;
    }

    public String[] decryptText(String[] text) {
        String[] decodedText = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            decodedText[i] = decryptString(text[i]);
        }
        return decodedText;
    }

    public String decryptString(String str) {
        String decryptedString = String.valueOf(decryptCharArray(str.toCharArray()));
        return decryptedString;
    }

    public char[] decryptCharArray(char[] text) {
        char[] decodedText = new char[text.length];
        for (int i = 0; i < text.length; i++) {

            if (text[i] >= A && text[i] <= Z) {
                if (text[i] - key < A) {
                    decodedText[i] = (char) (Z - (A % (text[i] - key)));
                } else {
                    decodedText[i] = (char) (text[i] - key);
                }
            } else if (text[i] >= a && text[i] <= z) {
                if (text[i] - key < a) {
                    decodedText[i] = (char) (z - (a % (text[i] - key)));
                } else {
                    decodedText[i] = (char) (text[i] - key);
                }
            } else {
                decodedText[i] = text[i];
            }
        }
        return decodedText;
    }

    public int getKey() {
        return key;
    }
}
