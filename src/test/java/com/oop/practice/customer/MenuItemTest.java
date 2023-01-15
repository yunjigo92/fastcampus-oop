package com.oop.practice.customer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴 아이템을 생성한다.")
    @Test
    void makeMenuTest() {
        assertThatCode(()-> new MenuItem("만두", 4000))
                .doesNotThrowAnyException();
    }
}
