package module10;

import module06.task1.userInput.UserInput;
import module08.flower.*;
import module08.flowerUtils.MyColors;
import module10.cryptwriter.CryptFileWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        File fileFromList = new File("File from list.txt");
        File encryptedFile = new File("Encrypted file.txt");
        File decryptedFile = new File("Decrypted file.txt");

        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose(MyColors.BLUE, 19));
        flowers.add(new Aster(MyColors.INDIGO, 17));
        flowers.add(new Tulip(MyColors.RED, 11));
        flowers.add(new Chamomile(MyColors.YELLOW, 9));
        flowers.add(new Rose(MyColors.BLUE, 19));
        flowers.add(new Tulip(MyColors.RED, 11));

        System.out.println("Here is some flower collection to crypt:\n");
        for (Flower s : flowers) {
            System.out.println(s.toString());
        }

        System.out.println("\nPlease enter the key value for crypt the collection items:");
        int key = UserInput.inputPositiveOrZeroInt();

        CryptFileWriter fileCrypter = new CryptFileWriter(key);

        fileCrypter.writeListToFile(flowers, fileFromList);
        fileCrypter.encryptFileToFile(fileFromList, encryptedFile);
        fileCrypter.decryptFileToFile(encryptedFile, decryptedFile);

        System.out.println("\nEncrypted and decrypted files are already saved at project root folder.");
    }
}
