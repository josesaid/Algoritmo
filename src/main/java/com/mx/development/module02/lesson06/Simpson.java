package com.codegym.lessons.module02.lesson06;

import lombok.Data;

@Data
public class Simpson implements Comparable<Simpson> {
    private String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }

}
