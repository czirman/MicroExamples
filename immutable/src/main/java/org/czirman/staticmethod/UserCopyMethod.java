package org.czirman.staticmethod;

import org.czirman.GearWheel;

public class UserCopyMethod {


    private String name;
    private Integer age;
    private GearWheel interests;

    public static UserCopyMethod newInstance(UserCopyMethod userCopyConstructor) {
        UserCopyMethod newUserCopyMethod = new UserCopyMethod();
        newUserCopyMethod.name = userCopyConstructor.name;
        newUserCopyMethod.age = userCopyConstructor.age;
        newUserCopyMethod.interests = userCopyConstructor.interests;

        return newUserCopyMethod;
    }
}
