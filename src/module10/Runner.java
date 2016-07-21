package module10;

import module06.task1.userInput.UserInput;
import module08.flower.*;
import module08.flowerUtils.MyColors;
import module09.crypter.CaesarCrypter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
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

        fileCrypter.encryptToFile(flowers);
        fileCrypter.decryptFromFileToFile();
        System.out.println("\nEncrypted and decrypted files are already saved at project root folder.");
    }
}
