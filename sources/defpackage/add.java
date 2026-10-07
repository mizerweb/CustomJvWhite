package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class add {
    public static final long a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    public static final long b = SystemClock.elapsedRealtimeNanos();
}
