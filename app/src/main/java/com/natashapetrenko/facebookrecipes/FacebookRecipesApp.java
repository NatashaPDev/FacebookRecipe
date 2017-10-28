package com.natashapetrenko.facebookrecipes;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by petrenkonv on 28.10.2017.
 */

public class FacebookRecipesApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initDB();
    }

    private void initDB() {
        FlowManager.init(this);
    }

    @Override
    public void onTerminate() {
        DBTearDown();
        super.onTerminate();
    }

    private void DBTearDown() {
        FlowManager.destroy();
    }
}
