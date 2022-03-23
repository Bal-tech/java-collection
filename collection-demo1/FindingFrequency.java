import java.util.HashMap;
import java.util.Map;

public class FindingFrequency {

    /*program to find the frequency/occurrence of a character in a String, a name here*/
    public static void main(String args[]) {
        String myName = "Bal Limbu";
        // convert the String variable to a Character array
        char[] nameAlphabets = myName.toCharArray();

        // Use Map ( key, value ) to find how many times a single alphabet occurs in the given String
        // here key = Character ( an alphabet of name ) , value = Integer ( a count )
        Map<Character, Integer> mapName = new HashMap<>();

        // iterate the array using the for each loop
        for (char indexElement : nameAlphabets) {
            // if the letter matches the alphabet in the array char []
            if (mapName.containsKey(indexElement)) {
                /*int oldValue = mapName.get(index); int newValue = mapName.get(index) + 1; */
                // update the value (i.e. count) of the alphabet
                mapName.put(indexElement, mapName.get(indexElement) + 1); // increment the count by 1
            } else {  // when letter does NOT match the alphabet in the array char []
                // insert the key-value pair (alphabet, count)
                mapName.put(indexElement, 1);
            }
        }
        System.out.println("Occurrence/Frequency of Each Alphabets in my Name:" + mapName);
    }

}
