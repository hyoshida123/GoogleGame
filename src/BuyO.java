import java.util.HashMap;

public class BuyO {
    // Caluculate the cost of sentences
    public static void main(String[] args) {
        HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();
        dictionary.put('a', 1);
        dictionary.put('e', 1);
        dictionary.put('i', 1);
        dictionary.put('o', 1);
        dictionary.put('u', 1);
        dictionary.put('b', 1);
        dictionary.put('c', 2);
        dictionary.put('d', 3);
        dictionary.put('f', 4);
        dictionary.put('g', 5);
        dictionary.put('h', 6);
        dictionary.put('j', 7);
        dictionary.put('k', 8);
        dictionary.put('l', 9);
        dictionary.put('m', 10);
        dictionary.put('n', 11);
        dictionary.put('p', 12);
        dictionary.put('q', 13);
        dictionary.put('r', 14);
        dictionary.put('s', 15);
        dictionary.put('t', 16);
        dictionary.put('v', 17);
        dictionary.put('w', 18);
        dictionary.put('x', 19);
        dictionary.put('y', 20);
        dictionary.put('z', 21);
        int sum = 0;
        String input = "’Twas brillig, and the slithy toves\n" +
                "Did gyre and gimble in the wade;\n" +
                "All mimsy were the borogoves,\n" +
                "And the mome raths outgrabe.\n" +
                "\"Beware the Jabberwock, my son!\n" +
                "The jaws that bite, the claws that catch!\n" +
                "Beware the Jubjub bird, and shun\n" +
                "The frumious Bandersnatch!\"";
        input = removePunctuations(input);
        for (Character c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sum += 2 * dictionary.get(Character.toLowerCase(c));
            } else {
                sum += dictionary.get(c);
            }
        }
        System.out.println(sum);
    }

    public static String removePunctuations(String s) {
        String res = "";
        for (Character c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                res += c;
            }
        }
        return res;
    }
}
