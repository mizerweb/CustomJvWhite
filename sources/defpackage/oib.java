package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oib {
    public final dp5 a;
    public final dp5 b;
    public final dp5 c;
    public final dp5 d;
    public final dp5 e;

    public oib(dp5 dp5Var, dp5 dp5Var2, dp5 dp5Var3, dp5 dp5Var4, dp5 dp5Var5) {
        this.a = dp5Var;
        this.b = dp5Var2;
        this.c = dp5Var3;
        this.d = dp5Var4;
        this.e = dp5Var5;
    }

    public final void a(pib pibVar) {
        long j = pibVar.h;
        if (j != 0) {
            gm0.m("oib", "setFavoritesSync: %d", Long.valueOf(j));
            ((s7f) ((et3) this.c.get())).C(pibVar.h);
        }
    }
}
