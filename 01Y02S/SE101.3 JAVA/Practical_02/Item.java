package com.mycompany.practical_02;

public class Item {
	// qu-01
    private int location;
    private String description;
	
	// qu-02, qu-03
    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }
	
	// qu-04
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}