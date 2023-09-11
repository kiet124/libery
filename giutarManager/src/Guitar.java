

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dotha
 */
public class Guitar {
    private final String serialNumber;
    private double price;
    private final String builder;
    private final String model;
    private final String backWood;
    private final String topWood;
    
    public Guitar(String serialNumber, double price, String builder,
                  String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
    public String getBuilder() {
        return builder;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getBackWood() {
        return backWood;
    }
    
    public String getTopWood() {
        return topWood;
    }
    
    public void createSound() {
        System.out.println("Creating sound...");
    }
}



