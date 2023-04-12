package org.example;

public class CinemaManager {
    private CinemaItem[] items = new CinemaItem[0];
    private int limit;
    public CinemaManager() {
        this.limit = 5;
    }
    public CinemaManager (int limit) {
        this.limit = limit;
    }
    public void save (CinemaItem item) {
        CinemaItem [] tmp = new CinemaItem[items.length + 1];
        for (int i =0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp [tmp.length - 1] = item;
        items = tmp;
    }
    public CinemaItem [] findAll() {
        return  items;
    }
    public CinemaItem [] findLast () {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        CinemaItem[] tmp = new  CinemaItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length -1 - i];
        }
        return  tmp;
    }
}
