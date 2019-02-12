package com.example.hjoh2002.backendless3;

import android.app.Application;

import com.backendless.Backendless;

public class BackendApplication extends Application {

    public static final String APPLICATION_ID = "0EDE2C05-CB63-10D2-FF9E-A284F2DABF00";
    public static final String API_KEY = "40D33649-DEB3-96CB-FF23-241538AF2500";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(), APPLICATION_ID, API_KEY);
    }
}
