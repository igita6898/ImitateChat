package com.monch.common;

import android.util.Patterns;

/**
 * Created by monch on 2017/5/9.
 */

public final class StringUtils {

    private StringUtils() {}

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence cs) {
        return !isEmpty(cs);
    }

    public static boolean equals(String str1, String str2) {
        return (str1 == null && str2 == null) ||
                (isNotEmpty(str1) && str1.equals(str2));
    }

    public static boolean isWebSite(String string) {
        return isNotEmpty(string) && string.matches(Patterns.WEB_URL.pattern());
    }

    public static boolean isPhone(String string) {
        return isNotEmpty(string) && string.matches(Patterns.PHONE.pattern());
    }

    public static boolean isEmail(String string) {
        return isNotEmpty(string) && string.matches(Patterns.EMAIL_ADDRESS.pattern());
    }

}
