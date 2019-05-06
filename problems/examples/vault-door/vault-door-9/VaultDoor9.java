import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

class VaultDoor9 {
    public static void main(String args[]) {
        VaultDoor9 vaultDoor = new VaultDoor9();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vault password: ");
        String passwordInput = scanner.next();
        System.out.print("Enter 4-digit pin number: ");
        String pinInput = scanner.next();
        if (vaultDoor.checkPassword(passwordInput, pinInput)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied!");
        }
    }

    // Convert a 4 digit pin (as a String) to an array of bytes that
    // can be used as an AES key.
    //
    // The key is 16 bytes. The digits of the pin number are
    // stored in the first 4 bytes, and the other 12 bytes are
    // zeroes.
    public byte[] pinToKey(String pin) {
        byte[] key = new byte[16];
        for (int i = 0; i < 4; i++) {
            key[i] = Byte.parseByte(pin.substring(i, i+1));
        }
        return key;
    }

    // Encrypt a string with the given 4-digit pin.
    public byte[] encrypt(String plainText, String pin)
            throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        byte[] keyBytes = pinToKey(pin);
        SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(plainText.getBytes());
    }

    public boolean checkPassword(String password, String pin) {
        byte[] expected = {
            {{b[0]}},
            {{b[1]}},
            {{b[2]}},
            {{b[3]}}
        };
        try {
            return Arrays.equals(encrypt(password, pin), expected);
        } catch (GeneralSecurityException e) {
            return false;
        }
    }
}
