package com.example.tp;

public class MediaLibrary {
    private Media[] items = new Media[4];
    private int count = 0;

    public void add(Media m) {
        if (count == items.length) {
            Media[] newItems = new Media[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }

        items[count] = m;
        count++;
    }

    public void playAll() {
        System.out.println("Lecture de tous les médias :");

        for (int i = 0; i < count; i++) {
            items[i].lire();
        }
    }

    public int totalDuration() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();

            if (d > 0) {
                total += d;
            }
        }

        return total;
    }
}