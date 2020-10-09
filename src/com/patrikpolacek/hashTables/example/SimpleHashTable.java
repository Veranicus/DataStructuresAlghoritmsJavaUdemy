package com.patrikpolacek.hashTables.example;

public class SimpleHashTable {

    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

//        linear probing
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }

        }

        if (occupied(hashedKey)) {
            System.out.println("Sorry, there is already " +
                    "employee with key:  " + key + " in the hash table.");
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }

        Employee employee = hashTable[hashedKey].employee;

        hashTable[hashedKey] = null;
        StoredEmployee[] oldHashtable = hashTable;
        hashTable = new StoredEmployee[oldHashtable.length];
        for (int i = 0; i < oldHashtable.length; i++){
            if (oldHashtable[i] != null){
                put(oldHashtable[i].key, oldHashtable[i].employee);
            }
        }
        return employee;

    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        //        linear probing
        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashTable[hashedKey] != null &&
                !hashTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if (hashTable[hashedKey] != null &&
                hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else return -1;


    }

    private boolean occupied(int index) {
        return hashTable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + " " + hashTable[i].employee);
            }
        }
    }


    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

}
