import java.lang.reflect.Array;
import java.util.Arrays;

public class Encrypter
{
    public String encrypt(String unEncrypted) {
        int data[];
        data = new int[4];
        String encrypted = "";

        data = stringToInt(unEncrypted);
        data = digitSwap(data);
        encrypted = encryptionToString(data);

        return encrypted;
    }

    public int[] stringToInt(String number) {
        int[] data;
        int temp = Integer.parseInt(number);
        data = new int[4];
        data[3] = temp % 10;
        data[2] = ((temp % 100) - data[0]) / 10;
        data[1] = ((temp % 1000) - (temp % 100)) / 100;
        data[0] = (temp - (temp % 1000)) / 1000;
        return data;
    }

    public int[] digitSwap(int[] data) {
        int temp2;

        temp2 = data[1];
        data[1] = data[3];
        data[3] = temp2;
        temp2 = data[0];
        data[0] = data[2];
        data[2] = temp2;

        return data;
    }

    public String encryptionToString(int[] data)
    {
        String secondString = "", encryptedString = "";
        int i;

        for (i = 0; i < 4; i++)
        {
            data[i] = (data[i] + 7) % 10;
            secondString = Integer.toString(data[i]);
            encryptedString = encryptedString + secondString;
        }
        return encryptedString;
    }
}
