package com.example.villip.simpleproject.calendar;

/**
 * Created by villip on 25.01.2016.
 */
public class DailyNote {
        private String date, type, text, alarm;

    public DailyNote(String date, String type, String text, String alarm) {
        this.date = date;
        this.type = type;
        this.text = text;
        this.alarm = alarm;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }
}


