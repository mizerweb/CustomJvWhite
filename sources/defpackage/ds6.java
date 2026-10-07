package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public interface ds6 {
    void error(String str, Throwable th);

    default void log(String str) {
        Log.d("Default", str);
    }
}
