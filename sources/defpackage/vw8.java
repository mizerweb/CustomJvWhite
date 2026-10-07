package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vw8 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public volatile boolean f;

    public vw8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    public final void a() {
        if (((svb) this.e.getValue()).b() && !this.f) {
            gm0.n(vw8.class.getName(), "Call init stickers");
            this.f = true;
            vdh vdhVar = (vdh) this.a.getValue();
            vdhVar.k.B(vdhVar, vdh.n[1], yab.i0(vdhVar.b, null, 2, new xfg(vdhVar, null), 1));
            um6 um6Var = (um6) this.b.getValue();
            e9i.j0(new j3(new fz6(ch3.i(um6Var.j().a, new String[]{"favorite_stickers"}, new ik4(6)), new qob(um6Var, (lq4) null, 23), 3), 14, new adh(um6Var, (lq4) null, 10)), (gu4) um6Var.i.getValue());
            ldh ldhVar = (ldh) this.c.getValue();
            tre.m0(new j3(new fz6(ch3.i(ldhVar.m().a, new String[]{"favorite_sticker_sets"}, new ik4(5)), new ai8(ldhVar, null, 28), 3), 14, new adh(ldhVar, (lq4) null, 0)), ldhVar.a);
        }
    }
}
