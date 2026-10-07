package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hog {
    public static final /* synthetic */ zv8[] j;
    public static final gog k;
    public final ny8 a;
    public final ny8 b;
    public final dq4 c;
    public final mjg d;
    public final r8e e;
    public final mjg f;
    public final AtomicReference g;
    public sgg h;
    public final p3c i;

    static {
        z8b z8bVar = new z8b(hog.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
        k = new gog(3, null);
    }

    public hog(ny8 ny8Var, ny8 ny8Var2, xhh xhhVar) {
        this.a = ny8Var;
        this.b = ny8Var2;
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).b());
        this.c = dq4VarA;
        mjg mjgVarA = p90.a(k);
        this.d = mjgVarA;
        this.e = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.f = mjgVarA2;
        this.g = new AtomicReference(new fog((String) null, 3));
        this.i = qyj.S();
        e9i.j0(new fz6(e9i.F(e9i.K(mjgVarA2, 1), 200L), new dyd(2, this, hog.class, "searchSetsByQuery", "searchSetsByQuery(Ljava/lang/String;)V", 4, 12), 3), dq4VarA);
    }

    public final boolean a() {
        String str = ((fog) this.g.get()).b;
        return !(str == null || str.length() == 0);
    }
}
