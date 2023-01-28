package com.minji.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStudy {

    public static void main(String[] args) {

        /*int[] numbers = {1,2,7,45,98,0};
                Arrays.stream(numbers)
                        .filter(x -> x>3 && x%2 == 0)
                        .map(x -> x*x)
                        .sorted()
                        .forEach(System.out::println);


        List<Integer> numbers2 = Arrays.asList(1,2,3,4);
        List<Integer> result = numbers2.stream()
                .filter(x -> x>3 && x%2 ==0)
                .map(x -> x*x)
                .sorted()
                .collect(Collectors.toList());

        result.forEach(System.out::println);*/

        /*String[][] namesArray = new String[][]{
                {"kim", "taeng"}, {"mad", "play"},
                {"kim", "mad"}, {"taeng", "play"}};

        Set<String> namesWithFlatMap = Arrays.stream(namesArray)
                .flatMap(innerArray -> Arrays.stream(innerArray))
                .filter(name -> name.length() >3)
                .collect(Collectors.toSet());

        namesWithFlatMap.forEach(System.out::println);

        List<List<String>> collectionList = new ArrayList<>();
        collectionList.add(Arrays.asList("a", "aa", "aaa"));
        collectionList.add(Arrays.asList("b", "bb", "bbb"));
        collectionList.add(Arrays.asList("c", "cc", "ccc"));

        collectionList.stream()
                .flatMap(s -> s.stream())
                .filter(aa -> "cc".equals(aa))
                .forEach(System.out::println);*/

        Stream<String> stream = Stream.of("jjjj", "and", "Stream", "ex");
        String[] array = stream.toArray(String[]::new);
        List<String> list = Arrays.asList(array);
        for(String s : list){
            System.out.println(s);
        }

    }


}
