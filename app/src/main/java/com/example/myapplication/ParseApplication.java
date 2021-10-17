package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("E5Wx9S4qAXG6g4wnVpoVI2baXmBe2ft6TAT4k2l3")
                .clientKey("RXjFitac9DuyDrFguhu2S77y1YyVlhrV3Wik2Z98")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
