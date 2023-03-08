package day16_nestedLoop;

public class FrequencyOfTheWord {

    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while( sentence.contains(word) ){
            count++;
            sentence = sentence.replaceFirst(word, "");

        }

        System.out.println(count);


    }
}

/*
write a program that can return the frequency of the word from a sentence
Ex:
sentence = "java JAVA jAvA JAva"    OUTPUT : 4

 */