package com.example.tubes03;

public class ComicPage {

    public int width; //height, width halaman
    public int height;
    public String imageUrl;
    public int chapter_number;
    public static String img = "https://cdn.mangaeden.com/mangasimg/%s";

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getImageUrl() {
        return String.format(img, imageUrl);
    }

    public int getChapterNumber() {
        return chapter_number;
    }

}
