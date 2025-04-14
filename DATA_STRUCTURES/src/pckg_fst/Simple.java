package pckg_fst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Simple {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1000);
        numbers.add(1000);
        numbers.add(1000);
        ArrayList<String> strings = new ArrayList<>();
        listElementsFromList(numbers);
        System.out.println(numbers);
        addRandomNumber(numbers);
        System.out.println(numbers);
        listElements(numbers);
        addElementsToList(strings, numbers);
        System.out.println(strings);
        listElementsFromList(strings);
        HashSet<Integer> unique = returnUnicorns(numbers);
        System.out.println(unique);






    }
    private static void listElements(ArrayList<Integer> lista){
        for (Integer num:lista){
            System.out.println(num);
        }
    }
    private static void listSElements(ArrayList<String> lst){
        for (String el: lst){
            System.out.println(el);
        }
    }
    private static <E> void listElementsFromList(ArrayList<E> lst){
        for (E element : lst){
            System.out.println(element);
        }
    }

    private static void addElementsToList(ArrayList<String> lst, ArrayList<Integer> nums ){
        for (Integer num: nums){
            lst.add(String.valueOf(num));

        }
    }

    private static void addRandomNumber(ArrayList <Integer> integers){
        Random random = new Random();
        for (int i=0; i<10; i++){
            int randNumber = random.nextInt(11);
            integers.add(randNumber);


            //moja verzija metode



        }
    }

    private static <E> HashSet returnUnicorns(ArrayList<E> lst) {
        HashSet<E> unique = new HashSet<>(lst);

        return unique;


    }



}
