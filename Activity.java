package com.ecoquest.models;

public abstract class Activity {
    protected String id;
    protected String description;
    protected int xpPoints;
    public Activity(String desc, int xp) {
        this.id = String.valueOf(System.currentTimeMillis());
        this.description = desc;
        this.xpPoints = xp;
    }
    public abstract String getDetails();
    public String getId() { return id; }
    public int getXpPoints() { return xpPoints; }
    public String toCSV() { return id + "," + description + "," + xpPoints; }
}