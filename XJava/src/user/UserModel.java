package user;

/**
 * Created by Vladimir Yerokhin on 11.03.17
 */

public class UserModel {
    public String fullName;
    protected int userId;
    public String userFloor;
    public int userAge;

    public UserModel(String a, String b) {
        fullName = a + " " + b;

    }

    @Override
    public String toString() {
        return "\n" + "User: " + fullName;
    }
}
