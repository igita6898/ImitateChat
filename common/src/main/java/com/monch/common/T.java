package com.monch.common;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * Created by monch on 2017/5/9.
 */
public final class T {

    private T() {}

    public static void ss(Context context, @StringRes int id) {
        Toast.makeText(context, id, Toast.LENGTH_SHORT).show();
    }

    public static void ss(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void sl(Context context, @StringRes int id) {
        Toast.makeText(context, id, Toast.LENGTH_LONG).show();
    }

    public static void sl(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

}
