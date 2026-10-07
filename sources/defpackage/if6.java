package defpackage;

import android.content.Context;
import android.os.Looper;
import com.vk.push.core.network.http.HttpClient;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class if6 {
    public ga4 A;
    public boolean B;
    public final String C;
    public final boolean D;
    public final Context a;
    public qt3 b;
    public final pah c;
    public pah d;
    public pah e;
    public pah f;
    public pah g;
    public final c h;
    public Looper i;
    public final int j;
    public final p70 k;
    public final int l;
    public final boolean m;
    public final ybf n;
    public final s6f o;
    public final long p;
    public final long q;
    public final long r;
    public vb5 s;
    public final long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public if6(Context context, pah pahVar, pah pahVar2) {
        o80 o80Var = new o80(context, 4);
        v25 v25Var = new v25(3);
        o80 o80Var2 = new o80(context, 5);
        c cVar = new c(29);
        context.getClass();
        this.a = context;
        this.c = pahVar;
        this.d = pahVar2;
        this.e = o80Var;
        this.f = v25Var;
        this.g = o80Var2;
        this.h = cVar;
        this.i = vqi.B();
        this.k = p70.i;
        this.l = 1;
        this.m = true;
        this.n = ybf.d;
        this.p = 5000L;
        this.q = BuildConfig.SILENCE_TIME_TO_UPLOAD;
        this.r = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.o = s6f.b;
        this.s = new vb5(vqi.X(20L), vqi.X(500L));
        this.b = qt3.a;
        this.t = 500L;
        this.u = 2000L;
        this.v = 600000;
        this.w = kf6.a;
        this.x = HttpClient.DEFAULT_TIMEOUT_IN_MILLIS;
        this.y = 600000;
        this.z = true;
        this.C = "";
        this.j = -1000;
        new gp0();
        this.D = true;
    }

    public final bg6 a() {
        lvb.b0(!this.B);
        this.B = true;
        return new bg6(this);
    }

    public final void b(s99 s99Var) {
        lvb.b0(!this.B);
        this.f = new hf6(3, s99Var);
    }

    public final void c(uyh uyhVar) {
        lvb.b0(!this.B);
        uyhVar.getClass();
        this.e = new hf6(4, uyhVar);
    }

    public if6(Context context, xje xjeVar) {
        this(context, new hf6(1, xjeVar), new o80(context, 1));
    }

    public if6(Context context) {
        this(context, new o80(context, 2), new o80(context, 3));
    }
}
