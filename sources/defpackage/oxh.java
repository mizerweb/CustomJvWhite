package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class oxh {
    public final Context a;
    public final String b;
    public boolean c;

    public oxh(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final SharedPreferences a() {
        this.c = true;
        return this.a.getSharedPreferences("tracer-".concat(this.b), 0);
    }

    public final boolean b() {
        if (!this.c && cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis < a().getLong("system.shutdown.until.ts", Long.MIN_VALUE) || jCurrentTimeMillis < a().getLong("system.CRASH_REPORT.shutdown.until.ts", Long.MIN_VALUE);
    }
}
