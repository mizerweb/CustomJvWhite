package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes2.dex */
public final class a22 implements dzc {
    public static final /* synthetic */ zv8[] n;
    public final xde a;
    public final l12 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mjg g;
    public final r8e h;
    public final pzf i;
    public final q8e j;
    public boolean k;
    public gu4 l;
    public final p3c m;

    static {
        z8b z8bVar = new z8b(a22.class, "updateQuoteStateJob", "getUpdateQuoteStateJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        n = new zv8[]{z8bVar};
    }

    public a22(xde xdeVar, l12 l12Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = xdeVar;
        this.b = l12Var;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        mjg mjgVarA = p90.a(new y12(null, null, u12.a));
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.i = pzfVarB;
        this.j = new q8e(pzfVarB);
        this.m = qyj.S();
    }

    @Override // defpackage.dzc
    public final void a(dq4 dq4Var) {
        this.l = dq4Var;
        sgg sggVarH0 = yab.h0(dq4Var, ((n0c) ((xhh) this.c.getValue())).b(), 2, new z12(this, null, u12.a, null));
        this.m.B(this, n[0], sggVarH0);
    }

    @Override // defpackage.dzc
    public final void b() {
        this.l = null;
        zv8[] zv8VarArr = n;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.m;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }

    @Override // defpackage.dzc
    public final void c(xyc xycVar) {
        this.a.L(xycVar);
        h();
    }

    @Override // defpackage.dzc
    public final void e(long j) {
        this.a.H(j);
        h();
    }

    public final void f() {
        if (!g().C()) {
            this.i.a(rt3.b);
            return;
        }
        String str = ((dz4) g().z().getValue()).d;
        if (str != null && !r5h.X0(str)) {
            i(str, Boolean.TRUE);
            return;
        }
        i(null, null);
        int i = 0;
        g().d(new n61(1, this, a22.class, "onCreateLinkSuccess", "onCreateLinkSuccess(Ljava/lang/String;)V", i, 2), new kj1(0, this, a22.class, "onCreateLinkError", "onCreateLinkError()V", i, 6));
    }

    public final x02 g() {
        return (x02) ((b95) this.d.getValue()).i.a.getValue();
    }

    public final void h() {
        mjg mjgVar;
        Object value;
        y12 y12VarA;
        do {
            mjgVar = this.g;
            value = mjgVar.getValue();
            y12VarA = (y12) value;
            x12 x12Var = this.a.r().isEmpty() ? u12.a : y12VarA.c;
            if (!y12VarA.c.equals(x12Var)) {
                y12VarA = y12.a(y12VarA, null, null, x12Var, 3);
            }
        } while (!mjgVar.h(value, y12VarA));
    }

    public final void i(String str, Boolean bool) {
        mjg mjgVar;
        Object value;
        x12 x12Var;
        ShareData shareData = new ShareData(0, null, null, v3e.c(str), null, null, null, null, 247, null);
        do {
            mjgVar = this.g;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, y12.a((y12) value, shareData, null, null, 6)));
        if (bool == null) {
            x12Var = v12.a;
        } else if (bool.equals(Boolean.FALSE)) {
            x12Var = u12.a;
        } else {
            if (!bool.equals(Boolean.TRUE)) {
                ore.o();
                return;
            }
            x12Var = w12.a;
        }
        gu4 gu4Var = this.l;
        this.m.B(this, n[0], gu4Var != null ? yab.h0(gu4Var, ((n0c) ((xhh) this.c.getValue())).b(), 2, new z12(this, shareData, x12Var, null)) : null);
    }
}
