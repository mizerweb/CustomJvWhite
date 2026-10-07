package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ybj {
    static {
        n1g.Z("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        synchronized (zbj.a) {
        }
        return wakeLockNewWakeLock;
    }
}
