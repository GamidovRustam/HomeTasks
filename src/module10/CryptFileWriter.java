package module10;

import module08.flowerUtils.FlowerCollections;
import module09.crypter.CaesarCrypter;

import java.io.*;
import java.util.List;

public class CryptFileWriter {
    private CaesarCrypter crypter;
    private String[] encryptedStringArray;

    public CryptFileWriter(int key) {
        crypter = new CaesarCrypter(key);
    }

    private String[] encryptListToStringArray(List list) {
        this.encryptedStringArray = crypter.encrypt(FlowerCollections.listToStringArray(list));
        return encryptedStringArray;
    }

    public void encryptToFile(List list) throws IOException {
        try (FileWriter writer = new FileWriter(new File("Encrypted list [version " + crypter.getVersion() + "]"))) {

            for (String s : encryptListToStringArray(list)) {
                writer.write(s.toString());
            }
        }
    }

    public void decryptFromFileToFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Decrypted list [version " + crypter.getVersion() + "]"))) {

            for (String s : encryptedStringArray) {
                writer.write(crypter.decrypt(s.toString()));
            }
        }
    }
}
