package org.treblereel;

import org.treblereel.databinder.NonExistingPropertyException;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 8/10/20
 */
public final class UserInfo {

    public static String get(String property, User user) {
        if (property.equals("firstName")) {
            return _firstName(user);
        }
        if (property.equals("sureName")) {
            return _sureName(user);
        }
        if (property.equals("age")) {
            return _age(git stuser);
        }

        throw new NonExistingPropertyException(user.getClass().getCanonicalName(), property);
    }

    public final static String _firstName(User user) {
        return Reflect.objectProperty("f_firstName__org_treblereel_User_", user);
    }

    public final static String _sureName(User user) {
        return Reflect.objectProperty("f_sureName__org_treblereel_User_", user);
    }

    public final static String _age(User user) {
        return Reflect.objectProperty("f_age__org_treblereel_User_", user);
    }

}
