public class Decrypter
{
    public String decrypt(String encryptedNumber)
    {
        int data[];
        data = new int[4];
        int i;
        String decrypted = "";

        data = stringToInt(encryptedNumber);
        data = digitSwap(data);
        decrypted = decryptionToString(data);

        return decrypted;
    }

    public int[] stringToInt(String encryptedNumber)
    {
        int[] data;
        int temp = Integer.parseInt(encryptedNumber);
        data = new int[4];
        data[3] = temp % 10;
        data[2] = ((temp % 100) - data[3]) / 10;
        data[1] = ((temp % 1000) - (temp % 100)) / 100;

        if(temp > 999)
            data[0] = (temp - (temp % 1000)) / 1000;
        else data [0] = 0;
        return data;
    }

    public int[] digitSwap(int[] data)
    {
        int temp2;

        temp2 = data[1];
        data[1] = data[3];
        data[3] = temp2;
        temp2 = data[0];
        data[0] = data[2];
        data[2] = temp2;

        return data;
    }

    public String decryptionToString(int[] data)
    {
        String secondString = "", decryptedString = "";
        int i;
        for (i = 0; i < 4; i++) {
            if(data[i] >= 7)
            {
                data[i] = data[i] - 7;
            }
            else data[i] = (data[i] + 10) - 7;
            secondString = Integer.toString(data[i]);
            decryptedString = decryptedString + secondString;
        }
        return decryptedString;
    }
}

