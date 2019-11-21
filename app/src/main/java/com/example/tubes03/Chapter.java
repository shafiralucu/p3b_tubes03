package com.example.tubes03;

import java.io.IOException;
import java.util.ArrayList;

//Example of a chapter array element:
//[
//5, # <-- chapter's number
//1275542373.0, # <-- chapter's date
//"5", # <-- chapter's title
//"4e711cb0c09225616d037cc2" # <-- chapter's ID (chapter.id in the next section)
//],
public class Chapter {
    public int chapter_number;
    public String chapter_date;
    public String chapter_id;
    public String chapter_title;

    public int getChapterNumber() {
        return chapter_number;
    }

    public String getTitle() {
        return chapter_title;
    }

    public String getChapterDate() {
        return chapter_date;
    }

    public String getChapterId() {
        return chapter_id;
    }

    //return list page dari chapter yg dikasih
    public ArrayList<ComicPage> getPages() throws IOException {
        return RequestHandler.instance().query(String.format("chapter/%s", getChapterId()), Chapter.class).getPages();
    }
}
