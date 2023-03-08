package day17_customClass;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aabcccdqqqqqwdasfffddfsadafsddssdgfs";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (result.contains(ch + "")) {  // if the character is already included in te result then skip it
                continue;
            }
            result += ch + "" + count+" ";
        }
        System.out.println(result);


    }
}
