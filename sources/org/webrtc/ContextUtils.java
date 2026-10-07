package org.webrtc;

import android.content.Context;
import defpackage.ore;

/* JADX INFO: loaded from: classes3.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
        } else {
            ore.p("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
