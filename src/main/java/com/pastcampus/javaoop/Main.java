package com.pastcampus.javaoop;

import com.pastcampus.javaoop.logic.BubbleSort;
import com.pastcampus.javaoop.logic.Sort;

import java.util.Arrays;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 12.
 */
public class Main {

    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
