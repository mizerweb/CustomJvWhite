package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class rsc {
    public final ny8 a;
    public final ny8 b;
    public final usc c;
    public final usc d;
    public final usc e;
    public final usc f;
    public final usc g;
    public final usc h;
    public final usc i;
    public final re7 j;

    public rsc(ny8 ny8Var, ny8 ny8Var2, xhh xhhVar) {
        this.a = ny8Var;
        this.b = ny8Var2;
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).b());
        usc uscVar = new usc(wsc.m);
        this.c = uscVar;
        usc uscVar2 = new usc(wsc.g);
        this.d = uscVar2;
        usc uscVar3 = new usc(wsc.o);
        this.e = uscVar3;
        usc uscVar4 = new usc(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        this.f = uscVar4;
        usc uscVar5 = new usc(wsc.n);
        this.g = uscVar5;
        usc uscVar6 = new usc(wsc.i);
        this.h = uscVar6;
        usc uscVar7 = new usc(wsc.l);
        this.i = uscVar7;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        lq4 lq4Var = null;
        re7 re7Var = i >= 29 ? new re7(i2, wsc.q) : null;
        this.j = re7Var;
        int i3 = 3;
        if (i >= 33) {
            e9i.j0(new fz6(uscVar, new qz9(this, lq4Var, 17), i3), dq4VarA);
        }
        e9i.j0(new fz6(uscVar2, new psc(this, lq4Var, i2), i3), dq4VarA);
        if (re7Var != null) {
            e9i.j0(new fz6(re7Var, new psc(this, lq4Var, 1), i3), dq4VarA);
        }
        if (i >= 34) {
            e9i.j0(new r07(uscVar3, uscVar4, new d3(this, lq4Var, 26), i2), dq4VarA);
        } else {
            e9i.j0(new fz6(uscVar3, new psc(this, lq4Var, 2), i3), dq4VarA);
        }
        e9i.j0(new fz6(uscVar5, new psc(this, lq4Var, i3), i3), dq4VarA);
        e9i.j0(new fz6(uscVar6, new psc(this, lq4Var, 4), i3), dq4VarA);
        e9i.j0(new fz6(uscVar7, new psc(this, lq4Var, 5), i3), dq4VarA);
    }

    public static final void a(rsc rscVar, String str, String str2) {
        Integer numC = ((tbb) rscVar.b.getValue()).c();
        if (numC != null) {
            ul9 ul9Var = new ul9();
            ul9Var.put("pType", str);
            ul9Var.put("screen", numC);
            ul9Var.put("pStatus", str2);
            ae9.k((ae9) rscVar.a.getValue(), "PERMISSION", "permission_changed_state", ul9Var.b(), 8);
        }
    }

    public static String b(usc uscVar) {
        return uscVar.i() ? "allowed" : "denied";
    }
}
