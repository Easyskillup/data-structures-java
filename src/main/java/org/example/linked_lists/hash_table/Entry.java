package org.example.linked_lists.hash_table;

// represents each entry in the hash table
public class Entry<K, V> {
    final K key;
    V value;
    Entry<K, V> next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
