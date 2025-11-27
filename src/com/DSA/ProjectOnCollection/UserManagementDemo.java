package com.DSA.ProjectOnCollection;

import java.util.*;

public class UserManagementDemo {
    public static void main(String[] args) {

        List<User> users= new ArrayList<>();
        users.add(new User("Alice", true, new HashSet<>(Arrays.asList("Admin", "User"))));
        users.add(new User("Bob", false, new HashSet<>(Arrays.asList("Manager"))));
        users.add(new User("Charlie", true, new HashSet<>(Arrays.asList("User"))));

        // Remove inactive user
        Iterator<User> it= users.iterator();
        while(it.hasNext()){
            if(!it.next().isActive()){
                it.remove();
            }
        }
        // print all user
        System.out.println("==Active Users==");
        for(User user:users){
            System.out.println(user.getName());
        }
        // count user per role
        Map<String, Integer> mp =new HashMap<>();
        for(User user: users){
            for(String role: user.getRoles()){
                mp.put(role, mp.getOrDefault(role, 0)+1);
            }
        }
        for(Map.Entry<String, Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }


    }
}
