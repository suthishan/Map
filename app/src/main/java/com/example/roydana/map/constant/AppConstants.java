package com.example.roydana.map.constant;

import android.os.Environment;



import java.util.ArrayList;

/**
 * Created by Suthishan on 20/1/2018.
 */

public class AppConstants {



    public  static  boolean isMainActivityOpen=true;

    public static int POP_UP_COUNT;
    public   static final String isMainActivityOpen_Count="minActivity_open_count";

    public static final String PREF_NAME = "motherapp";
    public static final String IS_LOGIN = "is_Login";
    public static final String USER_INFO = "user_info";
    public static final String USER_MEDICAL = "user_medical";
    public static final String USER_EMERGENCY_CONTACTS = "emergency_contacts";

    public static final int LOCATION_INTERVAL = 1000;            //1800000
    public static final int FASTEST_LOCATION_INTERVAL = 500;
    public static String EXTRA_LATITUDE = "";
    public static String EXTRA_LONGITUDE = "";

    public static String NEAR_LATITUDE = "";
    public static String NEAR_LONGITUDE = "";

    public static final int REQUEST_LOCATION=001;


    public  static boolean BACK_BUTTON_GONE=false;

    public static final String NAME = "name";
    public static final String PASSWORD = "password";
    public static final String EMAIL = "email";
    public static final String MOBILE = "mobile";

    public static final String NUMBER_1= "num1";
    public static final String NUMBER_2= "num2";




    public static String PICME_ID_NUM = "0";



    public static final String DEVICE_ID = "deviceId";
    public static final String GST_WEEK = "week";
    public static final String VHN_MOBILE_NUMBER = "9788782667";

    public static final String IMMUNIZATION_ID = "immId";
    public static Boolean IMMUNIZATION_EDIT = true;
//    public  static String ImmuID="";


//    public static final String M_ID = "m_id";


    public static final String NOTIFICATION_COUNT= "0";

    public static final String CURENT_ADDRESS= "curaddress";
    public static final String CURENT_LAT= "curlatitude";
    public static final String CURENT_LON= "curlontitude";

    //Store First Time While Login
    public static final String PICME_ID_CHECK = "picmeId";
    public static final String MOTHER_DOB = "DOB";
    public static final String MOTHER_PHOTO = "mPhoto";

    public static String FULL_VIEW_IMAGE_CHILD_REPORT = " ";

    public static final String LANGUAGE = "ta";

    public static Boolean LANGUAGE_CHANGE_ENGLISH = false;




    /*public static final int FRAGMENT_A = 0;
    public static final int FRAGMENT_B = 1;
    public static final int FRAGMENT_C = 2;
    public static final int FRAGMENT_D = 3;*/



    public static final String root = Environment.getExternalStorageDirectory().toString() + "/";
    public static final String base_dir = "ThaimaiApp";



    public static int CURRENT_MONTH =0 ;
    public static ArrayList<String> ARR_MONTH ;
    public static String LMP_DATE ="";


    public static String OPENFRAGMENT ="";







}
