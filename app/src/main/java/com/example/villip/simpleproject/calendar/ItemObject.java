package com.example.villip.simpleproject.calendar;

/**
 * Created by villip on 27.01.2016.
 */
public class ItemObject {

    private int date;
    private int img_alarm;
    private int img_note;

    public ItemObject(int date, int img_alarm, int img_note) {
        this.date = date;
        this.img_alarm = img_alarm;
        this.img_note = img_note;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getImg_alarm() {
        return img_alarm;
    }

    public void setImg_alarm(int img_alarm) {
        this.img_alarm = img_alarm;
    }

    public int getImg_note() {
        return img_note;
    }

    public void setImg_note(int img_note) {
        this.img_note = img_note;
    }
}
