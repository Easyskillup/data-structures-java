package org.example.linked_lists.hash_table;

public class CustomKey {
    private final String name;

    CustomKey(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof CustomKey other) {
            return this.name.equals(other.name);
        }
        return false;
    }
}