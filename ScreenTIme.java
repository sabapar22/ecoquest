package com.ecoquest.models;

public class ScreenTIme extends Activity {
    public ScreenTIme(double hours) {
        super("Screen Time: " + hours + " hrs", -(int)(hours * 5)); 
    }
    @Override
    public String getDetails() {
        return "[ENERGY] " + description + " | Waste: " + xpPoints + " XP";
    }
}