package com.yangkangjian.util;

import static com.yangkangjian.base.Preconditions.checkNotNull;

/**
 * 字符串工具类
 * Created by scott on 2017/5/31.
 */
public final class StringUtils {
    public static final String SPACE = " ";
    public static final String EMPTY = "";
    public static final String NULL = null;

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(final String string) {
        return string == null || string.isEmpty();
    }

    public static String emptyToNull(final String string) {
        return isNullOrEmpty(string) ? null : string;
    }

    public static String nullToEmpty(final String string) {
        return (string == null) ? "" : string;
    }

    public static boolean isBlank(final String string) {
        if (isNullOrEmpty(string)) {
            return true;
        }
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if (Character.isWhitespace(string.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(final String string) {
        return !isBlank(string);
    }

    public static String padStart(final String string, int minLength, char pad) {
        checkNotNull(string);
        int len = string.length();
        if (len >= minLength) {
            return string;
        }
        StringBuilder builder = new StringBuilder(minLength);
        for (int i = len; i < minLength; i++) {
            builder.append(pad);
        }
        builder.append(string);
        return builder.toString();
    }

    public static String padEnd(final String string, int minLength, char pad) {
        checkNotNull(string);
        int len = string.length();
        if (len >= minLength) {
            return string;
        }
        StringBuilder builder = new StringBuilder(minLength);
        builder.append(string);
        for (int i = len; i < minLength; i++) {
            builder.append(pad);
        }
        return builder.toString();
    }
}
