package com.oop.practice.customer;

import java.util.Objects;

public record MenuItem(String name, int price) {


    public boolean matches(String name) {
        return this.name.equals(name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return price == menuItem.price && Objects.equals(name, menuItem.name);
    }

}
