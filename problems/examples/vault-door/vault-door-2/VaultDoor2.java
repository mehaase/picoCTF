import java.util.*;

class VaultDoor2 {
    public static void main(String args[]) {
        VaultDoor2 vaultDoor = new VaultDoor2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vault password: ");
        String userInput = scanner.next();
        if (vaultDoor.checkPassword(userInput)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied!");
        }
    }

    // Minion #8728 obviously does not know how to write secure code for vaults!
    // My approach is much more secure, and Dr. Evil likes me much better than
    // Minion #8728.
    //
    // -Minion #5620
    public boolean checkPassword(String password) {
        return password.endsWith("{{flag[25:]}}") &&
               password.substring(16, 24).equals("{{flag[16:24]}}") &&
               password.startsWith("{{flag[0:6]}}") &&
               password.substring(11, 16).equals("{{flag[11:16]}}") &&
               password.substring(23, 28).equals("{{flag[23:28]}}") &&
               password.substring(4, 12).equals("{{flag[4:12]}}");
    }
}
