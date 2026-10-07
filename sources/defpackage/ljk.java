package defpackage;

import android.app.Application;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class ljk {
    public final Application a;
    public final tu0 b;
    public final vo9 c;
    public final vo9 d;
    public cg f;
    public int g;
    public volatile boolean h;
    public final String e = ljk.class.getName();
    public volatile boolean i = true;
    public final vn6 j = new vn6(2, this);
    public final hjk k = new hjk(this);

    public ljk(Application application, tu0 tu0Var, vo9 vo9Var, vo9 vo9Var2) {
        this.a = application;
        this.b = tu0Var;
        this.c = vo9Var;
        this.d = vo9Var2;
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        s2f.a(this.b, this.e, new wid(jElapsedRealtime, 4));
        this.d.invoke(Long.valueOf(jElapsedRealtime));
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        s2f.a(this.b, this.e, new wid(jElapsedRealtime, 3));
        this.c.invoke(Long.valueOf(jElapsedRealtime));
    }
}
