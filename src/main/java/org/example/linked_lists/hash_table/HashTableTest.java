package org.example.linked_lists.hash_table;

public class HashTableTest {
    public static void main(String[] args) {
        HashTable<String, String> countries = new HashTable<>();

        countries.put("India", "New Delhi");
        countries.put("USA", "Washington DC");
        countries.put("UK", "London");
        countries.put("Germany", "Berlin");

        countries.printTable();

//        System.out.println(Math.abs("Germany".hashCode()) % 124);


    }

    static void collisionDemo() {
        HashTable<CustomKey, String> tableWithCollision = new HashTable<>();
        CustomKey k1 = new CustomKey("A");
        CustomKey k2 = new CustomKey("B");
        CustomKey k3 = new CustomKey("C");

        tableWithCollision.put(k1, "Sample Data");
        tableWithCollision.put(k2, "Sample Data 2");
        tableWithCollision.put(k3, "Sample Data 3");

        tableWithCollision.printTable();
    }
}


