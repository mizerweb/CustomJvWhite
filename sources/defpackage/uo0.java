package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes4.dex */
public final class uo0 {
    public final Application a;
    public final dq4 c;
    public final pzf b = e9i.b(0, 0, 7);
    public final usc d = new usc(wsc.g);
    public final usc e = new usc(wsc.m);
    public final qo0 f = new qo0(this);

    public uo0(Application application, t51 t51Var, xhh xhhVar) {
        this.a = application;
        this.c = cqk.a(((n0c) xhhVar).c().S0());
        t51Var.d(this);
    }

    @l7h
    public final void onEvent(bg9 bg9Var) {
        yab.i0(this.c, null, 0, new ro0(this, null, 0), 3);
    }

    @l7h
    public final void onEvent(ouc oucVar) {
        yab.i0(this.c, null, 0, new ro0(this, null, 1), 3);
    }

    @l7h
    public final void onEvent(so4 so4Var) {
        yab.i0(this.c, null, 0, new ro0(this, null, 2), 3);
    }

    @l7h
    public final void onEvent(rei reiVar) {
        yab.i0(this.c, null, 0, new ro0(this, null, 3), 3);
    }
}
