package ru.netology.javaqa.javaqamvn.services;

import lombok.*;

@NonNull
@Getter
@Data
public class Poster {
    private int id;
    private String title;
    private String genre;
    private String imageUrl;

    public Poster(int id, String title, String genre, String imageUrl) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        }
    }

    public void setGenre(String genre) {
        if (genre != null && !genre.trim().isEmpty()) {
            this.genre = genre;
        }
    }

    public void setImageUrl(String imageUrl) {
        if (imageUrl != null && !imageUrl.trim().isEmpty()) {
            this.imageUrl = imageUrl;
        }
    }
}
