package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class zok {
    private static final sqk a;

    static {
        sqk vokVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            vokVar = new sok();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            vokVar = new vok();
        }
        a = vokVar;
    }

    public static sqk a() {
        return a;
    }
}
