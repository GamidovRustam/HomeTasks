package module09;

import module06.task1.userInput.UserInput;
import module08.flower.*;
import module08.flowerUtils.MyColors;
import module09.crypter.CaesarCrypter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose(MyColors.BLUE, 19));
        flowers.add(new Aster(MyColors.INDIGO, 17));
        flowers.add(new Tulip(MyColors.RED, 11));
        flowers.add(new Chamomile(MyColors.YELLOW, 9));
        flowers.add(new Rose(MyColors.BLUE, 19));

        String[] flowersToString = new String[flowers.size()];
        for (int i = 0; i < flowersToString.length; i++) {
            flowersToString[i] = "\n" + flowers.get(i).toString();
        }

        System.out.println("Collection items before encrypting:");
        System.out.println(Arrays.toString(flowersToString));

        System.out.println("\nPlease enter the key value for crypt the collection items:");
        int key = UserInput.inputPositiveOrZeroInt();

        CaesarCrypter crypter = new CaesarCrypter(key);

        System.out.println("\nEncrypted collection:");
        String[] encryptedStrings = crypter.encryptText(flowersToString);
        System.out.println(Arrays.toString(encryptedStrings));

        System.out.println("\n\nDecrypted collection:");
        String[] decryptedStrings = crypter.decryptText(encryptedStrings);
        System.out.println(Arrays.toString(decryptedStrings));
    }
}
