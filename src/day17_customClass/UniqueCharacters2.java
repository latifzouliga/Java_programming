package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";



        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // get each char in a string
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {  // check how many times ch has appeared in string
                if (str.charAt(i) == ch) { // if the ch has appeared in thr th string
                    frequency++;  // increase the frequency by 1
                }

            }
            if (frequency == 1) { // if the frequency is one, then it's unique
                unique += ch;
            }

        }
        System.out.println(unique);

    }
}
