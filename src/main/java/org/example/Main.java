package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Medication iboprufen = new Medication("Iboprufen", 10, false);
        Medication ketamine = new Medication("Ketamine", 15, true);
        Pharmacy ourCityPharmacy = new Pharmacy();
        ourCityPharmacy.addMedication(iboprufen);
        ourCityPharmacy.addMedication(ketamine);
        ourCityPharmacy.printMedications();
        System.out.println(ourCityPharmacy.MedicationFind("Iboprufen").getName());
        ourCityPharmacy.deleteMedication("Ketamine");
        ourCityPharmacy.printMedications();
    }
}