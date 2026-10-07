package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class re9 {
    public final esh a;
    public final cf7 b;
    public final ggk c;
    public long d;
    public long e;
    public int f;
    public long g;
    public long h;

    public re9(Handler handler, esh eshVar, cf7 cf7Var) {
        ggk ggkVar;
        eshVar.getClass();
        this.a = eshVar;
        this.b = cf7Var;
        if (handler != null) {
            Object obj = new Object();
            ggkVar = new ggk(handler, obj, new su6(obj, 14, this));
        } else {
            ggkVar = null;
        }
        this.c = ggkVar;
    }

    public final void a() {
        ggk ggkVar = this.c;
        if (ggkVar != null) {
            ggkVar.a.removeCallbacks(ggkVar.c);
        }
        ((gsh) this.a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f++;
        long j = jElapsedRealtime - this.e;
        this.g = Math.min(this.g, j);
        long jMax = Math.max(this.h, j);
        this.h = jMax;
        this.e = jElapsedRealtime;
        long j2 = this.d;
        long j3 = j2 + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        if (j3 >= jElapsedRealtime) {
            if (j3 >= jElapsedRealtime + WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS || ggkVar == null) {
                return;
            }
            ggkVar.a.postDelayed(ggkVar.c, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            return;
        }
        this.d = jElapsedRealtime;
        this.b.invoke(new qe9(this.f, jElapsedRealtime - j2, this.g, jMax));
        this.f = 0;
        this.g = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.h = Long.MIN_VALUE;
    }
}
