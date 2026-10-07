package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wwc extends a8j {
    public final long c;
    public final t73 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final mjg l;
    public final r8e m;
    public final ic6 n;
    public final ic6 o;
    public final pzf p;

    public wwc(long j, t73 t73Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.c = j;
        this.d = t73Var;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        mjg mjgVarA = p90.a(new rwc(null, null, null, null, new tnh(R.string.oneme_location_map_send_geolocation), null, true));
        this.l = mjgVarA;
        this.m = new r8e(mjgVarA);
        this.n = new ic6(null);
        this.o = new ic6(null);
        pzf pzfVarA = e9i.a(0, 1, 2);
        this.p = pzfVarA;
        e9i.j0(new fz6(e9i.k0(e9i.F(pzfVarA, 300L), new swc(this, null)), new qz9(this, (lq4) null, 19), 3), this.b);
    }

    public final void B(boolean z, boolean z2) {
        if (!((wsc) this.g.getValue()).c(wsc.l)) {
            a8j.x(this.o, kwc.a);
        } else {
            yab.i0(this.b, null, 0, new twc(this, z2, z, (lq4) null), 3);
        }
    }

    public final void C() {
        mjg mjgVar = this.l;
        Double d = ((rwc) mjgVar.getValue()).c;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = ((rwc) mjgVar.getValue()).d;
        a8j.x(this.n, new nwc(dDoubleValue, d2 != null ? d2.doubleValue() : 0.0d));
    }
}
