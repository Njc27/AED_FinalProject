/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalEnterprise;

/**
 *
 * @author namithajc
 */
public class VitalSigns {
    private int bloodpressure;
    private int heartRate;
    private int weight;
    private int height;
    private int temperature;
    private int respiratoryRate;

    public VitalSigns() {
    }
    
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }
    


    public int getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(int bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public VitalSigns(int bloodpressure, int heartRate, int weight, int height, int temperature, int respiratoryRate) {
        this.bloodpressure = bloodpressure;
        this.heartRate = heartRate;
        this.weight = weight;
        this.height = height;
        this.temperature = temperature;
        this.respiratoryRate = respiratoryRate;
        
    }
    
    

    @Override
    public String toString() {
        return "VitalSigns{" + "bloodpressure=" + bloodpressure + ", heartRate=" + heartRate + ", weight=" + weight + ", height=" + height + ", temperature=" + temperature + ", respiratoryRate=" + respiratoryRate + '}';
    }


      
}
