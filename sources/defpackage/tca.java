package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tca {
    public final /* synthetic */ int a;
    public final t4g b;

    public /* synthetic */ tca(t4g t4gVar, int i) {
        this.a = i;
        this.b = t4gVar;
    }

    public static final int a(long j, et3 et3Var) {
        long jF = ((s7f) et3Var).f();
        if (jF >= j) {
            return 0;
        }
        return (int) Math.ceil(((double) Math.round((j - jF) / 3600000.0f)) / 24.0d);
    }
}
