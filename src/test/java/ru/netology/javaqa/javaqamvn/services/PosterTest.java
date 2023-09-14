package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PosterTest {
    Poster film1 = new Poster(1, "Bloodshot", "action", "https://upload.wikimedia.org/wikipedia/ru/9/9d/Bloodshot_poster.jpg");
    Poster film2 = new Poster(2, "Onward", "cartoon", "https://kinohod.ru/o/49/fc/49fc82bf-e6de-4368-a2d8-1e65a88965af.jpg");
    Poster film3 = new Poster(3, "Gentlemen", "action", "https://upload.wikimedia.org/wikipedia/ru/c/c1/%D0%94%D0%B6%D0%B5%D0%BD%D1%82%D0%BB%D1%8C%D0%BC%D0%B5%D0%BD%D1%8B.jpg");

    @Test
    void getId() {
        int expected = 1;
        int actual = film1.getId();

        Assertions.assertEquals(expected, actual);

        expected = 2;
        actual = film2.getId();

        Assertions.assertEquals(expected, actual);
        expected = 3;
        actual = film3.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getTitle() {
        String expected = "Bloodshot";
        String actual = film1.getTitle();

        Assertions.assertEquals(expected, actual);

        expected = "Onward";
        actual = film2.getTitle();

        Assertions.assertEquals(expected, actual);
        expected = "Gentlemen";
        actual = film3.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getGenre() {
        String expected = "action";
        String actual = film1.getGenre();

        Assertions.assertEquals(expected, actual);

        expected = "cartoon";
        actual = film2.getGenre();

        Assertions.assertEquals(expected, actual);
        expected = "action";
        actual = film3.getGenre();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getImageUrl() {
        String expected = "https://upload.wikimedia.org/wikipedia/ru/9/9d/Bloodshot_poster.jpg";
        String actual = film1.getImageUrl();

        Assertions.assertEquals(expected, actual);

        expected = "https://kinohod.ru/o/49/fc/49fc82bf-e6de-4368-a2d8-1e65a88965af.jpg";
        actual = film2.getImageUrl();

        Assertions.assertEquals(expected, actual);
        expected = "https://upload.wikimedia.org/wikipedia/ru/c/c1/%D0%94%D0%B6%D0%B5%D0%BD%D1%82%D0%BB%D1%8C%D0%BC%D0%B5%D0%BD%D1%8B.jpg";
        actual = film3.getImageUrl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setId() {
        film1.setId(11);
        int expected = 11;
        int actual = film1.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTitle() {
        film1.setTitle("Бладшот");
        String expected = "Бладшот";
        String actual = film1.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setGenre() {
        film1.setGenre("triller");
        String expected = "triller";
        String actual = film1.getGenre();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setImageUrl() {
        film1.setImageUrl("https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/4572d9ef-14b2-4bf9-b66f-7c9e0dfc15ea/220x330");
        String expected = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/4572d9ef-14b2-4bf9-b66f-7c9e0dfc15ea/220x330";
        String actual = film1.getImageUrl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetId() {
        film1.setId(-1);
        int expected = 1;
        int actual = film1.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetIdNull() {
        film1.setId(0);
        int expected = 1;
        int actual = film1.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetTitleEmpty() {
        film1.setTitle("");
        String expected = "Bloodshot";
        String actual = film1.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetTitleProbel() {
        film1.setTitle("   ");
        String expected = "Bloodshot";
        String actual = film1.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetGenreEmpty() {
        film1.setGenre("");
        String expected = "action";
        String actual = film1.getGenre();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetGenreProbel() {
        film1.setGenre("   ");
        String expected = "action";
        String actual = film1.getGenre();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetImageUrlEmpty() {
        film1.setImageUrl("");
        String expected = "https://upload.wikimedia.org/wikipedia/ru/9/9d/Bloodshot_poster.jpg";
        String actual = film1.getImageUrl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void noSetImageUrlProbel() {
        film1.setImageUrl("   ");
        String expected = "https://upload.wikimedia.org/wikipedia/ru/9/9d/Bloodshot_poster.jpg";
        String actual = film1.getImageUrl();

        Assertions.assertEquals(expected, actual);
    }
}