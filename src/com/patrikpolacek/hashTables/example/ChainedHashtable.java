package com.patrikpolacek.hashTables.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        this.hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }

    }

    public void put(String key, Employee value) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, value));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
//            We compare raw value of key
            if (storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while (iterator.hasNext()) {
            index++;
            storedEmployee = iterator.next();
//            We compare raw value of key
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }
        if (storedEmployee == null || !storedEmployee.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.employee;
        }
    }

    public void printHashTable(){
        for (int i = 0; i < hashtable.length; i++){
            if (hashtable[i].isEmpty()){
                System.out.println("Position " + i + " : empty.");
            }else {
                System.out.println("Position " + i + " : ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next().employee);
                    System.out.println("->");
                }
                System.out.println("null");
            }
        }
    }

    private int hashKey(String key) {
//        We need modulo by hashtable length so we will always be inside the index
        return Math.abs(key.hashCode() % hashtable.length);
//        return key.length() % hashtable.length;
    }

}
