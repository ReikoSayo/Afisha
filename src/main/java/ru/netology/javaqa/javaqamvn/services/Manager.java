package ru.netology.javaqa.javaqamvn.services;

import lombok.*;

@Data
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
        for (Poster s : afisha) {
            System.out.println(s);
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
        int resultLimit;
        if (afisha.length >= limit) {
            resultLimit = limit;
        } else {
            resultLimit = afisha.length;
        }
        Poster[] reversed = new Poster[resultLimit];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = afisha[afisha.length - 1 - i];
        }
        return reversed;
    }
}
