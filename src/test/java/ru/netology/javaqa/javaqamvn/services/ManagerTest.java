package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerTest {
    Manager afisha = new Manager();

    @Test
    void findAllEmptyTest() {
        Poster[] expected = {};
        Poster[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    Poster film1 = new Poster(1, "Bloodshot", "action", "https://upload.wikimedia.org/wikipedia/ru/9/9d/Bloodshot_poster.jpg");

    @Test
    void findAllOneFilmTest() {
        afisha.save(film1);
        Poster[] expected = {film1};
        Poster[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    Poster film2 = new Poster(2, "Onward", "cartoon", "https://kinohod.ru/o/49/fc/49fc82bf-e6de-4368-a2d8-1e65a88965af.jpg");
    Poster film3 = new Poster(3, "Gentlemen", "action", "https://upload.wikimedia.org/wikipedia/ru/c/c1/%D0%94%D0%B6%D0%B5%D0%BD%D1%82%D0%BB%D1%8C%D0%BC%D0%B5%D0%BD%D1%8B.jpg");

    @Test
    void saveTest() {
        afisha.save(film1);
        afisha.save(film2);
        afisha.save(film3);

        Poster[] expected = {film1, film2, film3};
        Poster[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findAllTest() {
        afisha.save(film2);
        afisha.save(film1);
        Poster[] expected = {film2, film1};
        Poster[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void noSetLimitNullTest() {
        afisha.setLimit(0);
        int expected = 5;
        int actual = afisha.getLimit();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLimitOneTest() {
        afisha.setLimit(1);
        int expected = 1;
        int actual = afisha.getLimit();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLimitTest() {
        afisha.setLimit(7);
        int expected = 7;
        int actual = afisha.getLimit();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLimitStandartTest() {
        afisha.setLimit();
        int expected = 5;
        int actual = afisha.getLimit();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findLastTest() {
        afisha.setLimit(3);
        afisha.save(film1);
        afisha.save(film2);
        afisha.save(film3);
        Poster[] expected = {film3, film2, film1};
        Poster[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}