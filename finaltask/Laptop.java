package finaltask;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Laptop {
    private String name;

    private int amountRAM;
    private String operatingSystem;
    //private int price;
    private int amountHDD;
    private String color;
    //private String model;

    public Laptop(String name, int amountRAM, String operatingSystem, int amountHDD, String color) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.amountHDD = amountHDD;
        this.color = color;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("amountHDD");
        list.add("color");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: " + name + ": " +
                "Объём ОЗУ: " + amountRAM +
                ", Операционная система: " + operatingSystem  +
                ", Объем HDD: " + amountHDD +
                ", Цвет: " + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getAmountHDD() {
        return amountHDD;
    }

    public void setAmountHDD(int amountHDD) {
        this.amountHDD = amountHDD;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
