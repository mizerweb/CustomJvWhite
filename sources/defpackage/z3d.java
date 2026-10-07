package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class z3d {
    public static final z3d c = new z3d("");
    public static final z3d d = new z3d("preload");
    public final String a;
    public final pgg b;

    public z3d(String str) {
        pgg pggVar;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            pggVar = new pgg();
            pggVar.a = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            pggVar = null;
        }
        this.b = pggVar;
    }

    public final synchronized LogSessionId a() {
        pgg pggVar;
        pggVar = this.b;
        pggVar.getClass();
        return (LogSessionId) pggVar.a;
    }
}
