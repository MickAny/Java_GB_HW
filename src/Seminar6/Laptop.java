package Seminar6;

import java.util.ArrayList;

public class Laptop
{
    private String RAM;
    private String HDD;
    private String OS;
    private String colour;

    public Laptop(String RAM, String HDD, String OS, String colour) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "RAM=" + RAM +
                ", HDD=" + HDD +
                ", OS='" + OS + '\'' +
                ", colour='" + colour + '\'' +
                '}' + "\n";
    }
    public String getRAM() {
        return RAM;
    }
    public String getHDD() {
        return HDD;
    }
    public String getOS() {
        return OS;
    }
    public String getColour() {
        return colour;
    }

}
