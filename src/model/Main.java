package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args)
    {
        int linearSearchStringListReturn;
        int linearSearchIntegerListReturn;

        List<String> stringList;
        List<Integer> integerList;

        Predicate<String> filterReynolds = s -> s.equals("Ryan");
        Predicate<Integer> filter20 = n -> n == 20;

        stringList = new ArrayList<>();
        integerList = new ArrayList<>();

        stringList.add("Ryan");
        stringList.add("Reynolds");
        stringList.add("is cool!");

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        System.out.println("Goodbye, world... :'(");

        System.out.println("stringList: " + stringList.toString());
        System.out.println("integerList: " + integerList.toString());

        linearSearchStringListReturn = linearSearch(stringList, filterReynolds);
        linearSearchIntegerListReturn = linearSearch(integerList, filter20);

        System.out.println(linearSearchStringListReturn);
        System.out.println(linearSearchIntegerListReturn);
    }

    public static <T> int linearSearch(List<T> list, Predicate<T> check)
    {
        for (int i = 0; i < list.size(); ++i)
        {
            if (check.test(list.get(i))) return i;
        }

        return -1;
    }
}
