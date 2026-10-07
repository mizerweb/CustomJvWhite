package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class js3 {
    public static final /* synthetic */ int c = 0;
    public final ny8 a;
    public final ny8 b;

    public js3(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final void a(long j, long j2, boolean z) {
        gm0.m("js3", "clearChat id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        ((qw2) this.a.getValue()).A(j, j2, z);
        ((h5c) this.b.getValue()).f(j);
    }
}
