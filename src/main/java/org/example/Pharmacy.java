package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> medications = new HashMap();

    public int getCount(){
        return medications.size();
    }
    public void addMedication(Medication medication){
        medications.put(medication.getName(), medication);
    }
    public Medication MedicationFind(String medicationName) {
        return medications.get(medicationName);
    }
    public void deleteMedication(String medicationName){
        medications.remove(medicationName);
    }
    public void printMedications(){
        for(Medication medication : medications.values()){
            System.out.println("Name: " + medication.getName() + ", Price: " + medication.getPrice() + ", Is it avaliable: " + medication.getGetAvaliability());
        }
    }
}
