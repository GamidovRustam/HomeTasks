package module10;

import module08.flowerUtils.FlowerCollections;
import module09.crypter.CaesarCrypter;

import java.io.*;
import java.util.List;

public class CryptFileWriter {
    private CaesarCrypter crypter;

    public CryptFileWriter(int key) {
        crypter = new CaesarCrypter(key);
    }

    public void encryptToFile(List list) throws IOException {
        try (FileWriter writer = new FileWriter(new File("Encrypted list [version " + crypter.getVersion() + "]"))) {
            String[] encryptedStringArray = crypter.encrypt(FlowerCollections.listToStringArray(list));

            for (String s : encryptedStringArray) {
                writer.write(s.toString());
            }
        }
    }

    public void decryptFromFileToFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("Encrypted list [version " + crypter.getVersion() + "]")));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Decrypted list [version " + crypter.getVersion() + "]")))) {

            String nextLine;

            while ((nextLine = reader.readLine()) != null) {
                writer.write(crypter.decrypt(nextLine) + "\n");
            }
        }
    }
}
