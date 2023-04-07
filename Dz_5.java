import java.util.*;

public class Dz_5 {
    public static void main(String[] args) {
        System.out.println(collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"));

    }
    static boolean collectStats(String text){
        String[] splitText = text.split(" ");
        Map<Integer, List<String>> stats = new HashMap<>();
        for (String string : splitText) {
            List<String> temp = new ArrayList<String>();
            if(stats.containsKey(string.length())){
                temp = stats.get(string.length());
            }
            temp.add(string);
            stats.putIfAbsent(string.length(), temp);
        }
        System.out.println(stats);
        return true;
    }
}
