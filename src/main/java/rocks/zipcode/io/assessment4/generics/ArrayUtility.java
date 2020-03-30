package rocks.zipcode.io.assessment4.generics;

import java.net.Proxy;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Map<SomeType,Integer> map = new HashMap<>();
        for (SomeType element: array) {
            if(!map.containsKey(element))
            {
                map.put(element,1);
            } else
                {
                    map.replace(element, map.get(element)+1);
                }
        }

        for (Map.Entry<SomeType,Integer> elem : map.entrySet()) {
            if (elem.getValue() % 2 != 0){
                return elem.getKey();
            }
        }

        return null;
        }



    public SomeType findEvenOccurringValue() {
        Map<SomeType,Integer> map = new HashMap<>();
        for (SomeType element: array) {
            if(!map.containsKey(element))
            {
                map.put(element,1);
            } else
            {
                map.replace(element, map.get(element)+1);
            }
        }

        for (Map.Entry<SomeType,Integer> elem : map.entrySet()) {
            if (elem.getValue() % 2 == 0){
                return elem.getKey();
            }
        }

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for (SomeType elem: array) {
            if(elem.equals(valueToEvaluate))counter++;
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        int counter = 0;


        for (SomeType element: array) {
            if(predicate.apply(element)){
                counter++;
            }
        }
       SomeType[] ans = Arrays.copyOf(this.array, counter );
        counter = 0;
        for (SomeType element: array) {
            if(predicate.apply(element)){
                ans[counter] = element;
                counter++;
            }
        }
        return ans;
    }
}
