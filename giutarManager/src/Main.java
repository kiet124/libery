/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dotha
 */

    public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        
        // Thêm một số đàn ghi ta vào kho
        inventory.addGuitar(new Guitar("1111", 1500, "Fender", "Stratocaster",
                                        "Maple", "Alder"));
        inventory.addGuitar(new Guitar("2222", 1000, "Gibson", "Les Paul",
                                        "Mahogany", "Maple"));
        inventory.addGuitar(new Guitar("3333", 2000, "Martin", "D-28",
                                        "Rosewood", "Spruce"));
        
        // Tìm đàn ghi ta theo số serialNumber
        Guitar guitar = inventory.searchGuitar("3333");
        if (guitar != null) {
            System.out.println("Found guitar with serial number " + guitar.getSerialNumber());
        } else {
            System.out.println("Guitar not found");
        }
    }
}

