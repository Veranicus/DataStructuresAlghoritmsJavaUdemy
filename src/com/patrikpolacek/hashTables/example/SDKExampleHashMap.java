package com.patrikpolacek.hashTables.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SDKExampleHashMap {

    public static void main(String[] args) {

        Employee mikeP = new Employee(45, "Mike", "Porter");
        Employee jennyK = new Employee(465456, "Jenny", "Keller");
        Employee frankM = new Employee(986435, "Franklin", "Moss");
        Employee dennyL = new Employee(5486786, "Denny", "Lema");

        Map<String, Employee> hashMap = new HashMap<>();

        hashMap.put("Mike",mikeP);
        hashMap.put("Jenny",jennyK);
        hashMap.put("Frank",frankM);
        hashMap.put("Denny",dennyL);

        Iterator<Employee> iterator = hashMap.values().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        hashMap.forEach((k,v) -> System.out.println("Key = " + k +", Employee equals = " + v));

        System.out.println(hashMap.containsKey("Mike"));
        System.out.println(hashMap.containsKey("Mikes"));
        System.out.println(hashMap.containsValue(dennyL));

        hashMap.put("Jenny", dennyL);
//        It will insert Jenny only if there were no jenny key used before
//        It will return the value of existing key if it exists
        hashMap.putIfAbsent("Jenny", dennyL);

//        If we use the same key, the hash map will replace this key with the value we provided and will
//        return the old stored value.
        hashMap.forEach((k,v) -> System.out.println("Key = " + k +", Employee equals = " + v));


        System.out.println(hashMap.get("Mike"));

        System.out.println(hashMap.get("fsd"));

//        It will get the value if the key exists or will return
//        the default value we specify
        System.out.println(hashMap.getOrDefault("fsd", mikeP));

//        It will return the removed value
        System.out.println(hashMap.remove("Frank"));
    }
}
