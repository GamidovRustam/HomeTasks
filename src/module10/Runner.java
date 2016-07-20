package module10;

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

        System.out.println("Here is some flower collection we want to crypt:\n");
        for (Flower s : flowers) {
            System.out.println(s.toString());
        }

        CryptFileWriter cryptFileWriter = new CryptFileWriter(7);
        cryptFileWriter.encryptToFile(flowers);

        cryptFileWriter.decryptFromFileToFile();
        System.out.println("\nEncrypted and decrypted files are already saved at project root folder.");

    }
}
