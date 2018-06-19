import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mohit on 17/12/2017.
 */
public class AffineVigenere {

    static int valueOf(char c) {
        if (Character.isLowerCase(c)) {
            return (c - 97) % 26;
        } else if (Character.isUpperCase(c)) {
            return (c - 65) % 26;
        }
        return c;
    }

    static char charAdd(char c, int shift, int multiplier, boolean encrypt) {
        if (encrypt) {
            return (char) (((((c - 97) * multiplier) + shift) % 26) + 97);
        } else {
            return (char) ((((((c - 97) - shift) + 26) * modpow(multiplier, 11, 26)) % 26) + 97);
        }

    }

    static int modpow(int value, int power, int mod) {
        int e = 1;
        for (int i = 0; i < power; i++) {
            e = ((e * value % mod));
        }
        return e;
    }

    static String vigenereEncrypt(String str, List<Character> key, List<Integer> keyInt) {

        String ciphertext = new String();

        for (int i = 0; i < str.length(); i++) {
            ciphertext = ciphertext + charAdd(Character.toLowerCase(str.charAt(i)), valueOf(key.get(i % key.size())), keyInt.get(i % keyInt.size()), true);
        }

        return ciphertext;
    }


    static String vigenereDecrypt(String str, List<Character> key, List<Integer> keyInt) {
        String ciphertext = new String();

        for (int i = 0; i < str.length(); i++) {
            ciphertext = ciphertext + charAdd(Character.toLowerCase(str.charAt(i)), valueOf(key.get(i % key.size())), keyInt.get(i % keyInt.size()), false);
        }

        return ciphertext;
    }

    public static void main(String[] args) {
        List<Character> keyChar = new ArrayList<Character>(Arrays.asList('h', 'a', 't'));
        List<Integer> keyInt = new ArrayList<Integer>(Arrays.asList(5, 17, 9));

        String text = "Gulliver";
        String cipher = vigenereEncrypt(text, keyChar, keyInt);
        String plain = vigenereDecrypt(cipher, keyChar, keyInt);

        System.out.println("CIPHER: " + cipher);
        System.out.println("PLAIN: " + plain);
    }
}
