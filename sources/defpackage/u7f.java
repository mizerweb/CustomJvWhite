package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class u7f {
    public final Context a;
    public final d95 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mta g;
    public final ifh h;
    public final ny8 i;

    public u7f(Context context, ny8 ny8Var, d95 d95Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = context;
        this.b = d95Var;
        this.c = ny8Var3;
        this.d = ny8Var2;
        this.e = ((mta) ny8Var5.getValue()).a;
        ((mta) ny8Var5.getValue()).getClass();
        this.f = ((mta) ny8Var5.getValue()).b;
        this.g = (mta) ny8Var5.getValue();
        this.h = new ifh(new bpg(8, this));
        this.i = ny8Var;
    }

    public final or6 a() {
        return (or6) this.h.getValue();
    }

    public final boolean b() {
        if (((umb) ((g5c) this.d.getValue()).i.getValue()).b.areNotificationsEnabled()) {
            return false;
        }
        ghb ghbVar = ew5.b;
        long jO = qe7.O(7, lw5.DAYS);
        xb9 xb9Var = ((zed) this.i.getValue()).a;
        return System.currentTimeMillis() - ((Number) xb9Var.t0.m(xb9Var, xb9.g1[10])).longValue() > ew5.g(jO);
    }
}
