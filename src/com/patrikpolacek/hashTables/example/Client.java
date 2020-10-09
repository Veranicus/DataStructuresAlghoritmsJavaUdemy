package com.patrikpolacek.hashTables.example;

public class Client {

    public static void main(String[] args) {
        Employee mikeP = new Employee(45, "Mike", "Porter");
        Employee jennyK = new Employee(465456, "Jenny", "Keller");
        Employee frankM = new Employee(986435, "Franklin", "Moss");
        Employee dennyL = new Employee(5486786, "Denny", "Lema");

        SimpleHashTable simpleHashTable = new SimpleHashTable();
        simpleHashTable.put(mikeP.getFirstName(), mikeP);
        simpleHashTable.put(jennyK.getFirstName(), jennyK);
        simpleHashTable.put(frankM.getFirstName(), frankM);
        simpleHashTable.put(dennyL.getFirstName(), dennyL);

        simpleHashTable.printHashtable();

        System.out.println(simpleHashTable.get("Jenny"));
        System.out.println(simpleHashTable.get("Jenny"));
        System.out.println(simpleHashTable.get("Denny"));

        simpleHashTable.remove("Mike");

        simpleHashTable.printHashtable();

    }
}
