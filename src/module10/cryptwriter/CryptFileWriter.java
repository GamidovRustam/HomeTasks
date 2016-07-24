package module10.cryptwriter;

import module08.flowerUtils.FlowerCollections;
import module09.crypter.CaesarCrypter;

import java.io.*;
import java.util.List;

public class CryptFileWriter extends CaesarCrypter {

    public CryptFileWriter(int key) {
        super(key);
    }

    public void writeListToFile(List list, File file) throws IOException {
        try (FileWriter writer = new FileWriter(new File(String.valueOf(file)))) {
            String[] stringArray = FlowerCollections.listToStringArray(list);
            for (String s : stringArray) {
                writer.write(s.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void encryptFileToFile(File from, File to) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(String.valueOf(from))))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(String.valueOf(to))))) {

                String nextLine;

                while ((nextLine = reader.readLine()) != null) {
                    writer.write(encrypt(nextLine) + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void decryptFileToFile(File from, File to) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(String.valueOf(from))));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File(String.valueOf(to))))) {

            String nextLine;

            while ((nextLine = reader.readLine()) != null) {
                writer.write(decrypt(nextLine) + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
