package com.felipearruda.chatproject.storage;

import java.util.HashSet;
import java.util.Set;

public class UserStorage {

    private static UserStorage instance;
    private Set<String> users;

    private UserStorage(){
        users = new HashSet<>();
    }

    public static synchronized UserStorage getInstance(){
        if (instance == null){
            instance = new UserStorage();
        }
        return instance;
    }

    public Set<String> getUsers() {
        return users;
    }

    public void addUser(String user) throws Exception {
        if (users.contains(user)){
            throw new Exception("Usuário já cadastrado na nossa base de dados");
        }
        users.add(user);
    }

}
