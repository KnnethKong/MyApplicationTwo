package com.kxf.two;

import android.app.Application;

import com.kxf.crash.CustomActivityOnCrash;
import com.kymjs.rxvolley.toolbox.Loger;

/**
 * @author kymjs (http://www.kymjs.com/) on 11/17/15.
 */
public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Loger.setEnable(BuildConfig.DEBUG);
        CustomActivityOnCrash.install(this);
    }
}
