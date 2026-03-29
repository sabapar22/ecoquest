package com.ecoquest.models;

public class VehicleUsage extends Activity {
    public VehicleUsage(double km, String mode) {
        super("VehicleUsage: " + mode + " (" + km + "km)", -(int)(km * 2)); 
    }
    @Override
    public String getDetails() {
        return "[TRANS] " + description + " | Impact: " + xpPoints + " XP";
    }
}