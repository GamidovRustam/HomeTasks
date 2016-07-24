package module10.cryptwriter;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CryptFileWriterTest {
    private String[] strings = {"abc", "XYZ", "qweRTY"};
    private String[] encryptedStrings = {"def", "ABC", "tzhUWB"};
    private List list = new ArrayList();
    private File fileFromListTest = new File("File From List Test.txt");
    private File encryptedFileTest = new File("Encrypted file Test.txt");
    private final int TEST_KEY = 3;

    CryptFileWriter writer = new CryptFileWriter(TEST_KEY);

    {
        for (int i = 0; i < strings.length; i++) {
            list.add(i, strings[i]);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileFromListTest));
             BufferedWriter cryptWriter = new BufferedWriter(new FileWriter(encryptedFileTest))) {

            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i) + "\n");
            }
            for (int i = 0; i < encryptedStrings.length; i++) {
                cryptWriter.write(encryptedStrings[i] + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void writeListToFileTest() throws IOException {
        File fileFromList = new File("file from list.txt");
        writer.writeListToFile(list, fileFromList);

        try (BufferedReader testFileReader = new BufferedReader(new FileReader(fileFromListTest));
             BufferedReader resReader = new BufferedReader(new FileReader(fileFromList))) {

            while (resReader.readLine() != null) {
                resReader.readLine();
                testFileReader.readLine();
                assertEquals(testFileReader.readLine(), resReader.readLine());
            }
        }
    }

    @Test
    public void encryptFileToFileTest() throws IOException {
        File encryptedFile = new File("Encrypted file.txt");
        writer.encryptFileToFile(fileFromListTest, encryptedFile);

        try (BufferedReader testFileReader = new BufferedReader(new FileReader(encryptedFileTest));
             BufferedReader resReader = new BufferedReader(new FileReader(encryptedFile))) {

            while (resReader.readLine() != null && testFileReader.readLine() != null) {
                testFileReader.readLine();
                resReader.readLine();
                assertEquals(testFileReader.readLine(), resReader.readLine());
            }
        }
    }

    @Test
    public void decryptFileToFileTest() throws IOException {
        File decryptedFile = new File("Decrypted file.txt");
        writer.decryptFileToFile(encryptedFileTest, decryptedFile);

        try (BufferedReader testFileReader = new BufferedReader(new FileReader(fileFromListTest));
             BufferedReader resReader = new BufferedReader(new FileReader(decryptedFile))) {

            while (resReader.readLine() != null && testFileReader.readLine() != null) {
                testFileReader.readLine();
                resReader.readLine();
                assertEquals(testFileReader.readLine(), resReader.readLine());
            }
        }
    }
}
