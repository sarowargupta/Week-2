package com.day5.level1;
class Device {
    //attribute
    private String deviceId;
    private String status;

    // Constructor to initialize device details
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Getter
    public String getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    // Method to display the status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    //attribute
    private double temperatureSetting;

    // Constructor to initialize thermostat details
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus to include temperature setting
    @Override
    public void displayStatus() {

        // Call the superclass method
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create a generic device
        Device genericDevice = new Device("D001", "Active");
        System.out.println("Generic Device:");
        genericDevice.displayStatus();

        // Create a thermostat
        Thermostat thermostat = new Thermostat("T001", "Active", 22.5);
        System.out.println("Thermostat:");
        thermostat.displayStatus();
    }
}
