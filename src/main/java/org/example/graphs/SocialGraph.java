package org.example.graphs;

import java.util.*;

public class SocialGraph {
    private final Map<User, List<User>> graph = new HashMap<>();

    public void addUser(User user) {
        graph.computeIfAbsent(user, k -> new LinkedList<>());
    }

    public void addFriendship(User u1, User u2) {
        addUser(u1);
        addUser(u2);
        if (!graph.get(u1).contains(u2)) {
            graph.get(u1).add(u2);
        }
        if (!graph.get(u2).contains(u1)) {
            graph.get(u2).add(u1);
        }
    }

    public List<User> getFriends(User user){
        return graph.getOrDefault(user, Collections.emptyList());
    }

    public void print() {
        System.out.println("Social Graph:");
        for (User u : graph.keySet()) {
            List<User> friends = graph.get(u);
            System.out.print(u + " → [ ");
            for (User f : friends) {
                System.out.print(f + "  ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        User alice   = new User("u1", "Alice");
        User bob     = new User("u2", "Bob");
        User carol   = new User("u3", "Carol");
        User dave    = new User("u4", "Dave");
        User elena   = new User("u5", "Elena");
        SocialGraph graph = new SocialGraph();
        graph.addFriendship(alice, bob);
        graph.addFriendship(alice, carol);
        graph.addFriendship(bob, dave);
        graph.addFriendship(carol, elena);
        graph.addFriendship(dave, elena);
        graph.print();

        System.out.println();
        System.out.println(graph.getFriends(alice));
    }

}
