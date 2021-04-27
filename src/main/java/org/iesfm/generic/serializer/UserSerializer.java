package org.iesfm.generic.serializer;

import org.iesfm.generic.User;

public class UserSerializer implements Serializer<User>{

    @Override
    public String serialize(User user) {
        String userNameField = "username:" + user.getUsername();
        String pswdField = "password:" + user.getPassword();
        String levelField = "level:" + user.getLevel();


        return userNameField + "," + pswdField + "," + levelField;
    }
}
