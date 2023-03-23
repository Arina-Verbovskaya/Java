package Dz_3;
import java.util.ArrayList;
import java.util.List;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        selectNumber(list);
        System.out.println(list);
    }
    public static void  selectNumber(List<String> source){
        List<String> select = new ArrayList<>();
        for (int i=0;i<source.size();i++){
            try {
                int element =Integer.parseInt(source.get(i));
                if(true){
                    source.remove((i));
                    i--;
                }
            } catch(NumberFormatException e){
                select.add(source.get(i));
            }
        }
    }
}
