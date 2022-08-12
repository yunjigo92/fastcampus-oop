package com.pastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 8. 12.
 */
class BubbleSortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 반환")
    @Test
    void given_list_WhenExcuting_ThenReturnSortedList(){
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> actual = bubbleSort.sort(List.of(5,3,4,2,1));

        //then
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}