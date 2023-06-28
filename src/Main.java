import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добрый день, меня зовут Денис Райцис");
        ArrayList<Integer> firstList = new ArrayList<>();
        HashMap <Integer, Integer> secondList = new HashMap<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(1);
        firstList.add(1);
        firstList.add(1);
        firstList.add(1);
        firstList.add(2);
        firstList.add(1);
        firstList.add(3);
        firstList.add(1);
        firstList.add(1);

        for (int i=0; i<firstList.size();i++){
            Integer a = firstList.get(i);
            Integer b=1;
            if (secondList.get(a) == null){
                secondList.put(a,b);
            } else {
                b = secondList.get(a);
                b++;
                secondList.put(a,b);
            }
        }

        System.out.println(firstList);
        System.out.println(secondList);


    }
}