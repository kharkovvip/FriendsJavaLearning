package user;

import java.util.Collections;
import java.util.List;

import static user.UserData.createUserStack;

public class User {

    public static void main(String[] args) {
        System.out.println(sortUsers(createUserStack()));
    }

    public static List<UserModel> sortUsers(List<UserModel> list) {
        Collections.sort(list, UserData.nameComparator);
        return list;
    }
}