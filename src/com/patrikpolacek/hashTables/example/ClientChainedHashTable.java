package com.patrikpolacek.hashTables.example;

public class ClientChainedHashTable {


    public static void main(String[] args) {
        Employee mikeP = new Employee(45, "Mike", "Porter");
        Employee jennyK = new Employee(465456, "Jenny", "Keller");
        Employee frankM = new Employee(986435, "Franklin", "Moss");
        Employee dennyL = new Employee(5486786, "Denny", "Lema");

        ChainedHashtable chainedHashtable = new ChainedHashtable();
        chainedHashtable.put(mikeP.getFirstName(), mikeP);
        chainedHashtable.put(jennyK.getFirstName(), jennyK);
        chainedHashtable.put(frankM.getFirstName(), frankM);
        chainedHashtable.put(dennyL.getFirstName(), dennyL);

        chainedHashtable.printHashTable();

        System.out.println(chainedHashtable.get("Mike"));

        chainedHashtable.remove("Mike");
        chainedHashtable.printHashTable();
    }
}
