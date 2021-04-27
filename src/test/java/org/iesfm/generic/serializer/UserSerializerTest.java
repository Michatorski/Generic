package org.iesfm.generic.serializer;

import org.iesfm.generic.User;
import org.junit.Assert;
import org.junit.Test;

public class UserSerializerTest {

    @Test
    public void  UserSerializerTest(){
        Serializer<User> userSerializer = new UserSerializer();

        User user = new User("Michal", "12345", 5);

        String expected = "username:Michal,password:12345,level:5";

        String serializedUser = userSerializer.serialize(user);

        Assert.assertEquals(expected, serializedUser);
    }
}
