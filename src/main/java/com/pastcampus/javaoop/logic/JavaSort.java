package com.pastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 12.
 */
public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<T>(list);

        Collections.sort(output);

        return output;
    }
}
