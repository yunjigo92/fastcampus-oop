package com.pastcampus.javaoop.service;

import com.pastcampus.javaoop.logic.JavaSort;
import com.pastcampus.javaoop.logic.Sort;

import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 16.
 */
public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort =sort;
        System.out.println("구현체는 " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
