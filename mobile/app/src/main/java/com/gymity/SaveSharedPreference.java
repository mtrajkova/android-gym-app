package com.gymity;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SaveSharedPreference {
    static final String PREF_USERNAME = "username";
    static final String PREF_IS_ADMIN = "is admin";

    static final String GYM_ID = "gym_id";

    static SharedPreferences getSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setUserOnLogin(Context context, String username, boolean isAdmin) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(PREF_USERNAME, username);
        editor.putBoolean(PREF_IS_ADMIN, isAdmin);
        editor.commit();
    }

    public static String getUsername(Context context) {
        return getSharedPreferences(context).getString(PREF_USERNAME, "");
    }

    public static boolean getIsAdmin(Context context) {
        return getSharedPreferences(context).getBoolean(PREF_IS_ADMIN, false);
    }


    public static void clearUsernameOnLogout(Context context) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.clear();
        editor.commit();
    }

    public static void setGymId(Context context, Long gymId) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putLong(GYM_ID, gymId);
        editor.commit();
    }

    public static Long getGymId(Context context) {
        return getSharedPreferences(context).getLong(GYM_ID, 0);
    }

}
