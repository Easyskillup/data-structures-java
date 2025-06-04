package org.example.linked_lists.hash_table;

public class HashTable<K, V> {
    private final int SIZE = 15;
    private Entry<K, V>[] table;

    public HashTable() {
        this.table = new Entry[SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            Entry<K, V> current = table[i];
            System.out.print("Bucket: " + i + ": ");
            while (current != null) {
                System.out.print("[" + current.key + " = " + current.value + "] ->");
                current = current.next;
            }
            System.out.print("NULL");
            System.out.println();
        }
    }

    public void put(K key, V value) {
        int index = hash(key);
        System.out.println("Key: " + key + " Value: " + value + " Index: " + index);
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            // already an entry is present at the table[index]
            Entry<K, V> current = table[index];
            while (true) {
                // check is the key of the current entry is same as the key supplied
                // then update the data
                if (current.key.equals(key)) {
                    current.value = value; // updating the entry value at this key
                    return;
                }
                // addressing collision
                if (current.next == null) break;
                current = current.next;
            }
            current.next = newEntry;
        }
    }

    public V get(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }

    public boolean remove(K key) {
        System.out.println(key);
        int index = hash(key);
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;
        System.out.println("prev: " + (prev == null));
        while (current != null) {
            if (current.key.equals(key)) {
                System.out.printf("Current.key = %s, Key = %s%n", current.key, key);
                System.out.println("prev: " + (prev == null));
                if (prev == null) {
                    table[index] = current.next;
                    System.out.println("table[index]" + table[index]);
                } else {
                    prev.next = current.next;
                }
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }
}
