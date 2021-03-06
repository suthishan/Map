package com.example.roydana.map;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.roydana.map.constant.AppConstants;

/**
 * Created by Lincoln on 05/05/16.
 */
public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "androidhive-welcome";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public void setLogin(boolean isLogin) {
        pref.edit().putBoolean(AppConstants.IS_LOGIN, isLogin).commit();
    }

    public boolean getLogin() {
        return  pref.getBoolean(AppConstants.IS_LOGIN, Boolean.parseBoolean(""));
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void setCurentAdress(String strAddress) {
        pref.edit().putString(AppConstants.CURENT_ADDRESS, strAddress).commit();
    }


    public void setCurentlatitude(String latitude) {
        pref.edit().putString(AppConstants.CURENT_LAT, latitude).commit();
    }

    public void setCurentlongitude(String longitude) {
        pref.edit().putString(AppConstants.CURENT_LON, longitude).commit();
    }

    public String gettCurentAdress() {
        return  pref.getString(AppConstants.CURENT_ADDRESS, "");
    }
    public String gettCurentlatitude() {
        return  pref.getString(AppConstants.CURENT_LAT, "");
    }
    public String gettCurentlongitude() {
        return  pref.getString(AppConstants.CURENT_LON, "");
    }

    public void setMainScreenOpen(int count) {
        pref.edit().putString(AppConstants.isMainActivityOpen_Count, String.valueOf(count)).commit();
    }

    public String getMainScreenOpen() {
        return pref.getString(AppConstants.isMainActivityOpen_Count,"");

    }

    public void storeUserInfo(String name,String password,String email, String mobile){
        pref.edit().putString(AppConstants.NAME, name).commit();
        pref.edit().putString(AppConstants.PASSWORD, password).commit();
        pref.edit().putString(AppConstants.EMAIL, email).commit();
        pref.edit().putString(AppConstants.MOBILE, mobile).commit();

        Log.e("NAME",pref.getString(AppConstants.NAME,""));
        Log.e("PASSWORD",pref.getString(AppConstants.PASSWORD,""));
        Log.e("EMAIL",pref.getString(AppConstants.EMAIL,""));
        Log.e("MOBILE",pref.getString(AppConstants.MOBILE,""));
    }

    public String getname(){
        return pref.getString(AppConstants.NAME,"");
    }
    public String getEMAIL(){
        return pref.getString(AppConstants.EMAIL,"");
    }
    public String getMOBILE(){
        return pref.getString(AppConstants.MOBILE,"");
    }
    public String getPASSWORD(){
        return pref.getString(AppConstants.PASSWORD,"");
    }

    public void setNumber1(String number1) {
        pref.edit().putString(AppConstants.NUMBER_1, number1).commit();
    }
    public void setNumber2(String number2) {
        pref.edit().putString(AppConstants.NUMBER_2, number2).commit();
    }

    public String getNumber1(){
        return pref.getString(AppConstants.NUMBER_1,"");
    }

    public String getNumber2(){
        return pref.getString(AppConstants.NUMBER_2,"");
    }

}