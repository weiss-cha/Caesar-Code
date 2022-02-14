import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String inStr;
        int inStrLen; 
        char inChar;

        System.out.print("Enter a plaintext string: ");

        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();

        in.close();

        System.out.print("The ciphertext string is: ");

        for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {

            inChar = inStr.charAt(inCharIdx);

            if (inChar >= 65 && inChar <= 87) {
                System.out.print((char)(inChar + 3));
            }

            else if (inChar == 88) {
                System.out.print("A");
            }

            else if (inChar == 89) {
                System.out.print("B");
            }

            else if (inChar == 90) {
                System.out.print("C");
            }
        }
    }
}