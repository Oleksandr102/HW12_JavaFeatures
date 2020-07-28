package service;

import user.User;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    public Map<Integer, User> userList = new HashMap<>();
    int ID = 1;

    public void create(String name, String login, long phone) {
        User user = new User();
        userList.put(ID++, user);
        user.setName(name);
        user.setLogin(login);
        user.setPhone(phone);
    }

    public void showUsers() {
        userList.forEach((key, value) -> System.out.println(key + "  " + value));
    }

    public void delete(int ID) {
        userList.remove(ID);
    }

    public int getUserId() {
        return ID;
    }

}
