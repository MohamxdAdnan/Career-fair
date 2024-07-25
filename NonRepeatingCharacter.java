import java.util.ArrayList;
import java.util.List;

public class NonRepeatingCharacter {
    public static void main(String[] args) {

        String word = "gugvii";
        System.out.println(getNonRepeatCharIndex(word));
    }

    public static int getNonRepeatCharIndex (String word){
        List<Character> repeatChar=new ArrayList<>();
        int index =-1;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                if(word.charAt(i) != word.charAt(j)){
                    index=i;
                }
            }
            if(index>=0){
                return index;
            }
        }
        return index;
    }
}
