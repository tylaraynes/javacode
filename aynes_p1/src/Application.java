import java.util.Scanner;

public class Application {
        public static void main(String[] args)
        {
            int encryptionNumber, decryptionNumber, key = 0;
            String numberString = "", encrypted= "", decrypted = "";
            Scanner integerInput = new Scanner(System.in);

            while(key != -1)
            {
                System.out.println("1. Encryption\n" + "2. Decryption\n" + "3. -1 to exit\n");
                System.out.println("Enter 1 to encrypt, 2 to decrypt, or -1 to exit program: ");
                key = integerInput.nextInt();
                if(key == 1) {
                    System.out.println("Enter a 4 digit number to be encrypted: ");
                    encryptionNumber = integerInput.nextInt();
                    numberString = Integer.toString(encryptionNumber);
                    Encrypter encryption = new Encrypter();
                    encrypted = encryption.encrypt(numberString);
                    System.out.println("\nEncrypted number is: " + encrypted);
                }
                else if(key == 2){
                    System.out.println("Enter a 4 digit number to be decrypted: ");
                    decryptionNumber = integerInput.nextInt();
                    numberString = Integer.toString(decryptionNumber);
                    Decrypter decryption = new Decrypter();
                    decrypted = decryption.decrypt(numberString);
                    System.out.println("\nDecrypted number is: " + decrypted);
                }

            }

        }



    }
