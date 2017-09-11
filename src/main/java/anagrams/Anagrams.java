package anagrams;

public class Anagrams {

    public static int numberNeeded(String first, String second) {

        StringBuilder firstBuilder = new StringBuilder(first);
        StringBuilder secondBuilder = new StringBuilder(second);
        int numberNeeded = firstBuilder.length() + secondBuilder.length();

        for (int i=0; i<first.length(); i++) {

            char currentChar = first.charAt(i);

            for (int j=0; j<secondBuilder.length(); j++) {
                char charToCompare = secondBuilder.charAt(j);

                if (charToCompare == currentChar) {
                    firstBuilder.deleteCharAt(0);
                    secondBuilder.deleteCharAt(j);
                    numberNeeded -= 2;
                    break;
                }
            }
        }

        return numberNeeded;

    }

    public static void main(String[] args) {
        String a = "PEPE";
        String b = "PEPITO";
        System.out.println(numberNeeded(a, b));
    }

}
