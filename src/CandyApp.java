import java.util.*;

public class CandyApp {
    public static void main(String[] args) {

        Animal monkey = new Monkey();
        Monkey monkey1 = new Monkey();




        Chocolate mars = new Chocolate("mars", 0.65, "black", 288);
        Chocolate snickers = new Chocolate("snickers", 0.65, "brown", 245);
        Chocolate snickers2 = new Chocolate("snickers", 0.80, "brown", 245);
        Chocolate twix = new Chocolate("twix", 0.70, "brown", 246);
        Chocolate bounty = new Chocolate("bounty", 0.75, "blue", 169);
        Chocolate maltesers = new Chocolate("maltesers", 0.50, "red", 186);
        Chocolate mars2 = new Chocolate("mars", 0.65, "black", 288);
        Chocolate oreo = new Chocolate("oreo", 1.25, "blue", 300);
        Chocolate oreo2 = new Chocolate("oreo", 1.20, "blue", 300);
        Chocolate oreo3 = new Chocolate("breo", 1.20, "blue", 300);
        Chocolate oreo4 = new Chocolate("oreo", 1.20, "blue", 300);
        Chocolate reeses = new Chocolate("reeses", 0.70, "orange", 250);


        List<Chocolate> chocolates = new ArrayList<>();
        chocolates.add(mars);

        chocolates.add(twix);
        chocolates.add(bounty);
        chocolates.add(maltesers);
        chocolates.add(maltesers);
        chocolates.add(oreo);
        chocolates.add(reeses);
        chocolates.add(reeses);
        chocolates.add(mars2);
        chocolates.add(snickers);
        chocolates.add(1, oreo);
        chocolates.add(oreo2);
        chocolates.add(oreo3);
        chocolates.add(oreo4);
        chocolates.remove(1);
        chocolates.remove(snickers2);

        //chocolates.sort(Comparator.naturalOrder());
//        chocolates.sort(new ChocolateCalorieSorter());
        chocolates.sort((new ChocolateNameSorter()).thenComparing(new ChocolateCalorieSorter()));

        chocolates.sort(Comparator.comparing(Chocolate::getPrice).thenComparing(Chocolate::getName));

        for (Chocolate chocolate:chocolates){
            System.out.println(chocolate);
        }
        System.out.println("------");

        Set<Chocolate> chocolateSet = new LinkedHashSet<>();
        chocolateSet.addAll(chocolates);

        for (Chocolate chocolate:chocolateSet){
            System.out.println(chocolate);
        }

        System.out.println("------");
        SortedSet<Chocolate> chocolateSortedSet = new TreeSet<>();
        chocolateSortedSet.addAll(chocolateSet);

        for (Chocolate chocolate:chocolateSortedSet){
            System.out.println(chocolate);
        }

        System.out.println("---------");


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("ONE", 1);
        map.put("one", 1111);
        map.put("two", 1);

        for (String key:map.keySet()){
            System.out.println(key);
            System.out.println("has value: "+ map.get(key));
        }

        System.out.println("---------");


        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1,"one");
        map2.put(2,"two");
        map2.put(1,"ONE");
        map2.put(1111, "one");
        map2.put(1, "two");

        for (Integer key:map2.keySet()){
            System.out.println(key);
            System.out.println("has value: "+ map2.get(key));
        }







    }
}
