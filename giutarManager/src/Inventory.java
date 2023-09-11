
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dotha
 */

    public class Inventory {
    private final List<Guitar> guitars;
    
    public Inventory() {
        guitars = new ArrayList<>();
    }
    
    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }
    
    public Guitar searchGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
}
