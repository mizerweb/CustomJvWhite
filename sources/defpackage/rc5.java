package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rc5 {
    public final ha9 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public volatile dme n;
    public final ifh o;

    public rc5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ha9 ha9Var, ny8 ny8Var11, ny8 ny8Var12, wmi wmiVar) {
        this.a = ha9Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
        this.k = ny8Var10;
        this.l = ny8Var11;
        this.m = ny8Var12;
        this.o = new ifh(new z5(wmiVar, this, ny8Var2, 3));
    }

    public static final Object a(rc5 rc5Var, akb akbVar, mdh mdhVar) throws Throwable {
        boolean zF0 = ((zed) rc5Var.b.getValue()).a.f0();
        sbi sbiVar = sbi.a;
        if (zF0) {
            gm0.Y("NotifListenerImpl", "internalOnNotifMessage: ignore! ok push disabled");
            return sbiVar;
        }
        Object objA = rc5Var.b().a(akbVar, mdhVar);
        return objA == hu4.a ? objA : sbiVar;
    }

    public final djf b() {
        return (djf) this.c.getValue();
    }

    public final void c(kfc kfcVar, qf7 qf7Var) {
        dme dmeVar = this.n;
        if (dmeVar != null) {
            yab.i0(dmeVar.k(), null, 0, new f00(qf7Var, kfcVar, (lq4) null, 1), 3);
        }
    }
}
