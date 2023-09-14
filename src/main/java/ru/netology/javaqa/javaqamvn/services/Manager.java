package ru.netology.javaqa.javaqamvn.services;

import lombok.*;

public class Manager {
    private Poster[] afisha = new Poster[0];
    @Getter
    private int limit = 5;

    public void save(Poster poster) {
        Poster[] tmp = new Poster[afisha.length + 1];
        System.arraycopy(afisha, 0, tmp, 0, afisha.length);
        tmp[tmp.length - 1] = poster;
        afisha = tmp;
    }

    public Poster[] findAll() {
        for (int i = 0; i < afisha.length; i++) {
            System.out.println(afisha[i]);
        }
        return afisha;
    }

    public void setLimit(int limit) {
        if (limit > 0) {
            this.limit = limit;
        }
    }

    public void setLimit() {
    }

    public Poster[] findLast() {
        Poster[] reversed = new Poster[afisha.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = afisha[afisha.length - 1 - i];
        }
        for (int i = 0; i < limit; i++) {
            System.out.println(reversed[i]);
        }
        return reversed;
    }
}
