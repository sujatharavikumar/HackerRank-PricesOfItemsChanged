package Ravikumar.Sujatha.HackerRankItemsAndPrices;

//import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sujatharavikumar on 10/3/16.
 */
public class ItemsandPrices {


    static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
        int counter;

        TreeMap<String, Float> origItemsMap = new TreeMap<String, Float>();
        TreeMap<String, Float> itemsAlexMap = new TreeMap<String, Float>();

        for (int i=0; i<origItems.length; i++){
            origItemsMap.put(origItems[i], origPrices[i]);
        }

        for (int j=0; j<items.length; j++){
            itemsAlexMap.put(items[j], prices[j]);
        }
        counter = equalMaps(origItemsMap, itemsAlexMap);
        return counter;
    }

    public static int equalMaps(Map<String,Float>m1, Map<String,Float>m2) {
        int count = 0;
        for (String key: m2.keySet())
            if (!m1.get(key).equals(m2.get(key))){
                count++;
            }

        return count;
    }

    public static void main(String[] args) {
        String[] origItems = {"rice", "sugar", "wheat", "cheese"};
        float[] origPrices = {16.89f, 56.92f, 20.89f, 345.99f};
        String[] items = {"rice", "cheese"};
        float[] prices = {18.99f, 400.89f};
        int changedItems = verifyItems(origItems, origPrices, items, prices);
        System.out.println(changedItems);
    }
}

