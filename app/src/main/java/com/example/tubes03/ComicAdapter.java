package com.example.tubes03;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class ComicAdapter extends BaseAdapter {
    private List<Comic> listComic;
    private Activity activity;

    public ComicAdapter (Activity activity) {
        this.activity = activity;
        this.listComic = new ArrayList<Comic>();
    }

    @Override
    public int getCount() {
        return listComic.size();
    }

    @Override
    public Object getItem(int i) {
        return listComic.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
