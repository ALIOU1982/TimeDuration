/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.timeduration;

/**
 *
 * @author mathilda
 */
public class TimeDuration {

    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public TimeDuration(int time) {
        this.time = time;
    }

    public TimeDuration() {

    }

    public String timeConvertToHours(int time) {
        int hours = time / 3600;
        String th = String.valueOf(hours) + " heures " + timeConvertToMinute(time % 3600);
        return th;
    }

    public String timeConvertToMinute(int time) {
        int minutes = time / 60;
        int secondes = time % 60;
        String tS;
        if (time < 60) {
            tS = String.valueOf(minutes)+ " minutes "+ String.valueOf(time) + " secondes";
        } else {
            tS = String.valueOf(minutes) + " minutes " + String.valueOf(secondes) + " secondes";
        }
        return tS;
    }

    public String timeConvert(int time) {
        String tS;
        if (time >= 3600) {
            tS = timeConvertToHours(time);
        } else {
            tS = timeConvertToMinute(time);
        }
        return tS;
    }

    public void toString(int temps) throws BadBadValueException {
        if (temps < 0) {
            throw new BadBadValueException();
        } else {
            String timeConv = timeConvert(temps);
            System.out.println("La durée est de: " + timeConv);

        }
    }

}
