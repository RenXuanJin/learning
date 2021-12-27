package jrx.practise.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableForTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht2 =new  Hashtable<Integer,String>();
        for(int i=0;i<100000;i++)
        {
            ht2.put(i, "aaa");
        }
        traverseByEntry(ht2);
        traverseByKeySet(ht2);
        traverseByValues(ht2);
        traverseByEntryIterator(ht2);
        traverseByKeySetIterator(ht2);
        traverseByValueIterator(ht2);
    }

    public static void traverseByEntry(Hashtable<Integer,String> ht)
    {
        long startTime = System.nanoTime();
        System.out.println("============Entry±éÀú==============");
        Integer key;
        String value;
        for (Map.Entry<Integer, String> integerStringEntry : ht.entrySet()) {
            key = integerStringEntry.getKey();
            value = integerStringEntry.getValue();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "ÄÉÃë");
    }

    public static void traverseByKeySet(Hashtable<Integer,String> ht)
    {
        long startTime = System.nanoTime();
        System.out.println("============KeySet±éÀú==============");
        Integer key;
        String value;
        for (Integer integer : ht.keySet()) {
            key = integer;
//            value = ht.get(key);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "ÄÉÃë");
    }

    public static void traverseByValues(Hashtable<Integer,String> ht)
    {
        long startTime = System.nanoTime();
        System.out.println("============Values±éÀú==============");
        Integer key;
        String value;
        for (String value1 : ht.values()) {
            value = value1;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "ÄÉÃë");
    }

    public static void traverseByEntryIterator(Hashtable<Integer,String> ht)
    {
        long startTime = System.nanoTime();
        System.out.println("============Entryµü´úÆ÷±éÀú==============");
        Integer key;
        String value;
        Iterator<Map.Entry<Integer, String>> entryIterator = ht.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer, String> next = entryIterator.next();
            key = next.getKey();
            value = next.getValue();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "ÄÉÃë");
    }

    public static void traverseByKeySetIterator(Hashtable<Integer,String> ht)
    {
        long startTime = System.nanoTime();
        System.out.println("============KeySetµü´úÆ÷±éÀú==============");
        Integer key;
        String value;
        Iterator<Integer> iterator = ht.keySet().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            key = next;
//            value = ht.get(key);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "ÄÉÃë");
    }

    public static void traverseByValueIterator(Hashtable<Integer,String> ht)
    {
        long startTime = System.nanoTime();
        System.out.println("============Valuesµü´úÆ÷±éÀú==============");
        Integer key;
        String value;
        Iterator<String> stringIterator = ht.values().iterator();
        while (stringIterator.hasNext()){
            String next = stringIterator.next();
            value = next;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(duration + "ÄÉÃë");
    }

}
