import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello worls! "+ args[2] + " " + args[3]);

        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);

        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);

            Set<String> hSet = new HashSet<>();
            hSet.add("OOP");
            hSet.add("GG");
            hSet.add("EZ");
            hSet.add("F");
            hSet.add("not");
            hSet.add("drop");
            hSet.add("GG");
            hSet.remove("GG");
            System.out.println(hSet);

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        System.out.println(sSet);

        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);

        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Non", Color.BLUE);
        favoriteColors.put("Ben", Color.GREEN);
        favoriteColors.put("Man", Color.RED);
        favoriteColors.put("Chaem", Color.BLUE);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet) {

            Color value = favoriteColors.get(key);
            System.out.println(key + " :" + value);
        }
        TreeMap<String, Color> sortedColors = new TreeMap<>(favoriteColors);
        sortedColors.put("Mix", Color.PINK);
        sortedColors.put("Aing", Color.BLUE);
        sortedColors.put("Dream", Color.BLACK);
        sortedColors.put("Dom", Color.YELLOW);
        Set<String> keytree = favoriteColors.keySet();
        for (String key : keytree) {

            Color value = favoriteColors.get(key);
            System.out.println(key + " :" + value);
        }
    }

}