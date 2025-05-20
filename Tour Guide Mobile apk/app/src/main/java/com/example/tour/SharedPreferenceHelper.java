package com.example.tour;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceHelper {

    private static final String PREF_FILE_NAME = "TourAppPreferences";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }

    public static void saveUserData(Context context, String username, String password) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_USERNAME, username);
        editor.putString(KEY_PASSWORD, password);
        editor.apply();
    }

    public static String getUsername(Context context) {
        return getSharedPreferences(context).getString(KEY_USERNAME, "");
    }

    public static String getPassword(Context context) {
        return getSharedPreferences(context).getString(KEY_PASSWORD, "");
    }
}
