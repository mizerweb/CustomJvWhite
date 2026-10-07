package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class skj {
    public static final /* synthetic */ zv8[] h;
    public final tgb a;
    public final gu4 b;
    public final String c = skj.class.getName();
    public final pzf d;
    public final q8e e;
    public volatile es8 f;
    public final p3c g;

    static {
        z8b z8bVar = new z8b(skj.class, "sentNfcJob", "getSentNfcJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        h = new zv8[]{z8bVar};
    }

    public skj(tgb tgbVar, dq4 dq4Var) {
        this.a = tgbVar;
        this.b = dq4Var;
        e9i.j0(new fz6(tgbVar.f, new fij(this, (lq4) null, 1), 3), dq4Var);
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.d = pzfVarB;
        this.e = new q8e(pzfVarB);
        this.g = qyj.S();
    }

    public final void a() {
        tgb tgbVar = this.a;
        mjg mjgVar = tgbVar.b;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        tgbVar.d.set(null);
        vo8 vo8Var = (vo8) this.g.m(this, h[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    public final boolean b(String str, String str2) {
        boolean zD = str2 != null ? cqk.d(str, str2) : false;
        if (!zD) {
            String str3 = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, c0a.o("QueryId: ", str, " is not valid"), null);
                }
            }
        }
        return zD;
    }
}
