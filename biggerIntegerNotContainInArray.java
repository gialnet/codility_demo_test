package com.vivaldispring.codility_test;

import org.junit.Test;

import java.util.Comparator;
import java.util.stream.IntStream;

public class biggerIntegerNotContainInArray {

    /*
        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.
     */
    @Test
    public void ArrayTest(){

        int[] Arr={1, 3, 6, 4, 1, 2};

        System.out.println(solution(Arr));

    }

    @Test
    public void ArrayTest2(){

        int[] Arr={1, 2, 3};
        System.out.println(solution(Arr));
    }

    @Test
    public void ArrayTest3(){

        int[] Arr={-5,-3};
        System.out.println(solution(Arr));
    }

    @Test
    public void ArrayTest4(){

        int[] Arr={ -8, 7, 5, 9, 10, -2, 3};
        System.out.println(solution(Arr));
    }

    @Test
    public void ArrayTest5(){

        int[] Arr={ 2, 3};
        System.out.println(solution(Arr));
    }

    // ****************
    public int solution(int[] A){

        int[] numbers = IntStream.of(A).filter(v -> v > 0).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

        //Arrays.stream(numbers).forEach(System.out::println);

        if (numbers.length<1)
            return 1;

        int maxval = numbers[0] + 1;

        for (int i=0; i< numbers.length-1; i++){

            if( (numbers[i]-1) != (numbers[i+1]))
                return numbers[i]-1;
        }

        return maxval;
    }
}
