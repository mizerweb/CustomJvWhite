package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bwa extends a8j {
    public static final /* synthetic */ zv8[] s = {new z8b(bwa.class, "prepareSettingsJob", "getPrepareSettingsJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, bwa.class, "updateDoubleTapReactionDisabledJob", "getUpdateDoubleTapReactionDisabledJob()Lkotlinx/coroutines/Job;"), new z8b(bwa.class, "updateDoubleTapReactionValueJob", "getUpdateDoubleTapReactionValueJob()Lkotlinx/coroutines/Job;")};
    public final nni c;
    public final i6e d;
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
    public final wme o;
    public final p3c p;
    public final p3c q;
    public final p3c r;

    public bwa(nni nniVar, i6e i6eVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, da4 da4Var, ny8 ny8Var6, ny8 ny8Var7) {
        this.c = nniVar;
        this.d = i6eVar;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        mjg mjgVarA = p90.a(r66.a);
        this.l = mjgVarA;
        this.m = new r8e(mjgVarA);
        this.n = new ic6(null);
        this.o = new wme(new vx9(this, 10, ny8Var));
        this.p = qyj.S();
        this.q = qyj.S();
        this.r = qyj.S();
        C();
        yab.i0(this.b, ((n0c) ((xhh) ny8Var3.getValue())).a(), 0, new yva(this, null, 0), 2);
        e9i.j0(e9i.T(new fz6(new ua1(new q8e(da4Var.a), 7), new c37(this, null, 9), 3), ((n0c) ((xhh) ny8Var3.getValue())).a()), this.b);
    }

    public final List B() {
        wme wmeVar = this.o;
        if (((List) wmeVar.getValue()).isEmpty()) {
            wmeVar.a();
        }
        s5e s5eVar = new s5e(this.c.d.getString("app.messages.double.tap.reaction", "👍"));
        List<g6e> list = (List) wmeVar.getValue();
        if (list.isEmpty()) {
            gm0.Y(bwa.class.getName(), "Default reactions is empty");
            return r66.a;
        }
        c79 c79VarW = yab.w();
        for (g6e g6eVar : list) {
            long j = g6eVar.a;
            s5e s5eVar2 = g6eVar.b;
            Drawable drawableC = g6eVar.c;
            if (drawableC == null) {
                drawableC = ((f66) this.k.getValue()).c(s5eVar2.a.toString());
            }
            c79VarW.add(new g6e(j, s5eVar2, drawableC, cqk.d(s5eVar2, s5eVar)));
        }
        return yab.j(c79VarW);
    }

    public final void C() {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) ((xhh) this.g.getValue())).a(), 2, new yva(this, null, 1));
        this.p.B(this, s[0], sggVarH0);
    }

    public final void D(boolean z) {
        String name = bwa.class.getName();
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.s("updateDoubleTapReactionEnabled ", z), null);
            }
        }
        this.q.B(this, s[1], a8j.t(this, null, new g02(this, z, lq4Var, 4), 1));
    }
}
