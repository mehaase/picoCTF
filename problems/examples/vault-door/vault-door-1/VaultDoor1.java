import java.util.*;

class VaultDoor1 {
    public static void main(String args[]) {
        VaultDoor1 vaultDoor = new VaultDoor1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vault password: ");
        String userInput = scanner.next();
        if (vaultDoor.checkPassword(userInput)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied!");
        }
    }

    public boolean checkPassword(String password) {
        return password.length() == 32 &&
               password.charAt(0)  == '{{flag[0]}}' &&
               password.charAt(29) == '{{flag[29]}}' &&
               password.charAt(4)  == '{{flag[4]}}' &&
               password.charAt(2)  == '{{flag[2]}}' &&
               password.charAt(23) == '{{flag[23]}}' &&
               password.charAt(3)  == '{{flag[3]}}' &&
               password.charAt(17) == '{{flag[17]}}' &&
               password.charAt(1)  == '{{flag[1]}}' &&
               password.charAt(7)  == '{{flag[7]}}' &&
               password.charAt(10) == '{{flag[10]}}' &&
               password.charAt(5)  == '{{flag[5]}}' &&
               password.charAt(9)  == '{{flag[9]}}' &&
               password.charAt(11) == '{{flag[11]}}' &&
               password.charAt(15) == '{{flag[15]}}' &&
               password.charAt(8)  == '{{flag[8]}}' &&
               password.charAt(12) == '{{flag[12]}}' &&
               password.charAt(20) == '{{flag[20]}}' &&
               password.charAt(14) == '{{flag[14]}}' &&
               password.charAt(6)  == '{{flag[6]}}' &&
               password.charAt(24) == '{{flag[24]}}' &&
               password.charAt(18) == '{{flag[18]}}' &&
               password.charAt(13) == '{{flag[13]}}' &&
               password.charAt(19) == '{{flag[19]}}' &&
               password.charAt(21) == '{{flag[21]}}' &&
               password.charAt(16) == '{{flag[16]}}' &&
               password.charAt(27) == '{{flag[27]}}' &&
               password.charAt(30) == '{{flag[30]}}' &&
               password.charAt(25) == '{{flag[25]}}' &&
               password.charAt(22) == '{{flag[22]}}' &&
               password.charAt(28) == '{{flag[28]}}' &&
               password.charAt(26) == '{{flag[26]}}' &&
               password.charAt(31) == '{{flag[31]}}';
    }
}
