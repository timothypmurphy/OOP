import java.util.ArrayList;
import java.util.List;

public class AddChar {
    public static void main(String[] args){
        String[] lists = new String[args[1].length()+1];
        char letter = args[0].charAt(0);
        lists = add(letter, args[1]);
        for(int i = 0; i < lists.length; i++){
            System.out.println(lists[i]);
        }
    }
    public static String[] addChar(char a, String s){
        String[] lists = new String[s.length() + 1];
        lists[0] = a + s;
        for(int i = 1; i < s.length(); i++){
            lists[i] = s.substring(0, i) + a + s.substring(i);
        }
        lists[s.length()] = s + a;
        return lists;
    }
    public static String[] permutations(String s){
        List<String> processed = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < processed.size(); j++){
                processed.addAll(addChar(s.charAt(0),processed.get(j)));
            }
        }
    }
}
