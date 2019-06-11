package com.example.applicationjp;

import android.media.Image;

public class Date {
    private String Title1;
    private String Date1;
    private String Team1;
    private String Team2;
    private String D1;
    private String T1;


    public Date(String title1, String date1, String team1, String team2, String d1, String t1) {
        Title1 = title1;
        Date1 = date1;
        Team1 = team1;
        Team2 = team2;
        D1 = d1;
        T1 = t1;

    }

    public String getTitle1() {
        return Title1;
    }

    public void setTitle1(String title1) {
        Title1 = title1;
    }

    public String getDate1() {
        return Date1;
    }

    public void setDate1(String date1) {
        Date1 = date1;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public String getD1() {
        return D1;
    }

    public void setD1(String d1) {
        D1 = d1;
    }

    public String getT1() {
        return T1;
    }

    public void setT1(String t1) {
        T1 = t1;
    }


}

