package finaltask;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class finaltask {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("Acer", 8, "Windows", 1024, "White"));
        set.add(new Laptop("Lenovo", 16, "Windows", 500, "Black"));
        set.add(new Laptop("Lenovo", 32, "Ubuntu", 256, "Silver"));
        set.add(new Laptop("Apple", 64, "MacOS", 128, "Silver"));
        set.add(new Laptop("Sony", 8, "null", 320, "White"));
        set.add(new Laptop("Apple", 16, "MacOS", 256, "Silver"));
        set.add(new Laptop("Asus", 128, "Ubuntu", 256, "Red"));
        set.add(new Laptop("Asus", 8, "Windows", 64, "Black"));
        set.add(new Laptop("Asus", 8, "Windows", 256, "White"));

        LaptopAction operation = new LaptopAction(set);
        operation.start();  
    }
}
