package defpackage;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class e4j {
    public final ww8 a;
    public final double b;
    public final long c;
    public final long d;
    public final double e;
    public final long f;
    public long h;
    public int k;
    public final Handler g = new Handler(Looper.getMainLooper());
    public int i = Integer.MAX_VALUE;
    public long j = BuildConfig.MAX_TIME_TO_UPLOAD;
    public final f4g l = new f4g(24, this);

    public e4j(ww8 ww8Var, double d, long j, long j2, double d2, long j3) {
        this.a = ww8Var;
        this.b = d;
        this.c = j;
        this.d = j2;
        this.e = d2;
        this.f = j3;
    }
}
