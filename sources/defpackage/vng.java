package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vng extends a8j {
    public static final /* synthetic */ zv8[] p;
    public final long c;
    public final xhh d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final mjg h;
    public final r8e i;
    public final ic6 j;
    public final mjg k;
    public final AtomicReference l;
    public final AtomicReference m;
    public final p3c n;
    public sgg o;

    static {
        z8b z8bVar = new z8b(vng.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        p = new zv8[]{z8bVar};
    }

    public vng(long j, ny8 ny8Var, d4g d4gVar, ny8 ny8Var2, ny8 ny8Var3, xhh xhhVar) {
        this.c = j;
        this.d = xhhVar;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        mjg mjgVarA = p90.a(p9f.c);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        this.j = new ic6(null);
        mjg mjgVarA2 = p90.a(null);
        this.k = mjgVarA2;
        this.l = new AtomicReference(r66.a);
        int i = 3;
        this.m = new AtomicReference(new sng((String) null, 3));
        this.n = qyj.S();
        e9i.j0(e9i.T(new fz6(new jz(new q0d(((vdh) d4gVar.a.getValue()).m, d4gVar, 19), 11), new j8g(this, (lq4) null, 9), i), ((n0c) xhhVar).b()), this.b);
        e9i.j0(new fz6(e9i.F(e9i.K(mjgVarA2, 1), 200L), new dyd(2, this, vng.class, "searchStickersByQuery", "searchStickersByQuery(Ljava/lang/String;)V", 4, 11), i), this.b);
    }

    public static final tlg B(vng vngVar, clg clgVar) {
        vngVar.getClass();
        long j = clgVar.a;
        long j2 = clgVar.k;
        String str = clgVar.h;
        if (ch3.r(str)) {
            str = clgVar.d;
        }
        return new tlg(j, j2, j2, str, clgVar.l, clgVar.o, clgVar.b, clgVar.c, false, false, 0L, 0, 15936);
    }

    public final boolean C() {
        sng sngVar = (sng) this.m.get();
        String str = sngVar.a;
        return (sngVar.b == 0 || str == null || str.length() == 0 || ((p9f) this.i.a.getValue()).b.isEmpty()) ? false : true;
    }
}
