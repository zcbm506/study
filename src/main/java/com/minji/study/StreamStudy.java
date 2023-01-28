package com.minji.study;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy {

    public static void main(String[] args) {

        String[] intArray = {"hello world", "yellow", "green", "hello", "red", "blue"};

        Set<String> set = Arrays.asList(intArray)
                .stream()
                .filter(e -> e.startsWith("hello"))
                .collect(Collectors.toSet());
        //set.forEach(e-> System.out.println(e));

        //컬렉션에서 스트림 생성
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stream<Integer> stream = list.stream();
        //stream.forEach(System.out::println);

        //배열에서 스트림 생성
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};
        Stream<String> stream1 = Arrays.stream(arr);
        //stream1.forEach(e -> System.out.print(e + " "));

        //배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> stream2 = Arrays.stream(arr, 1, 3);
        //stream2.forEach(e -> System.out.print(e + " "));

        //가변 매개변수에서 스트림 생성
        Stream<Double> stream3 = Stream.of(4.2, 2.5, 3.1, 1.9);
        //stream3.forEach(System.out::println);

        //지정된 범위의 연속된 정수에서 스트림 생성
        IntStream stream4 = IntStream.range(1,4);
//        stream4.forEach(e -> System.out.print(e + " "));
//        System.out.println();
        IntStream stream5 = IntStream.rangeClosed(1,4);
        //stream5.forEach(e -> System.out.print(e + " "));

        //특정 타입의 난수로 이루어진 스트림 생성
        IntStream stream6 = new Random().ints(4);
        //tream6.forEach(System.out::println);

        //람다표현식
        //IntStream stream7 = (IntStream) Stream.iterate(2, n-> n+2);





    }


}
