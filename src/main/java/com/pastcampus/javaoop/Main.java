package com.pastcampus.javaoop;

import com.pastcampus.javaoop.logic.BubbleSort;

import java.util.Arrays;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 12.
 */
public class Main {

    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
