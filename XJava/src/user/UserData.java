package user;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Vetal on 25.01.2017
 */
public class UserData {

    protected String[] names = {"Коля", "Толя", "Юля", "Валера", "Ира", "Оксана", "Сеня", "Гриша", "Зоя", "Петруша", "Адольф", "Робинзон", "Кузьма", "Салоха", "Изя"};
    public static String[] surname = {"Мардвин", "Лихолет", "Джохаридзе", "Шмаревоз", "Кравченко", "Лернер", "Цукерман", "Барбароссо", "Колуб", "Стегно", "Свинопас", "Добробаба", "Хлыщиборщ", "Овсов", "Гандопас"};

    public static Comparator<UserModel> nameComparator = new Comparator<UserModel>() {
        @Override
        public int compare(UserModel user1, UserModel user2) {
            String s1 = user1.fullName;
            String s2 = user2.fullName;
            return s1.compareTo(s2);
        }
    };

    public static List<UserModel> createUserStack() {
        List<UserModel> userList = new ArrayList<>();
        UserData user1 = new UserData();

        for (int i = 0; i < 50; i++) {
            String name = user1.names[(int) (Math.random() * 15)];
            String surname = UserData.surname[(int) (Math.random() * 15)];
            userList.add(new UserModel(name, surname));
        }
        return userList;
    }
}
