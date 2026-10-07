package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class as9 extends a8j implements sy9 {
    public static final /* synthetic */ zv8[] I = {new z8b(as9.class, "fillByEditMessagesAttachmentsJob", "getFillByEditMessagesAttachmentsJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, as9.class, "finalActionJob", "getFinalActionJob()Lkotlinx/coroutines/Job;"), new z8b(as9.class, "clickMediaJob", "getClickMediaJob()Lkotlinx/coroutines/Job;")};
    public final r07 A;
    public final hz1 B;
    public final r8e C;
    public final p3c D;
    public final p3c E;
    public final p3c F;
    public final String G;
    public boolean H;
    public final gjg c;
    public final t73 d;
    public final pa3 e;
    public final pa3 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final mjg o;
    public final mjg p;
    public final r8e q;
    public final p41 r;
    public final p41 s;
    public volatile ArrayList t;
    public final o56 u;
    public final ic6 v;
    public final mjg w;
    public final usc x;
    public final usc y;
    public final r8e z;

    public as9(gjg gjgVar, t73 t73Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, pa3 pa3Var, pa3 pa3Var2) {
        this.c = gjgVar;
        this.d = t73Var;
        this.e = pa3Var;
        this.f = pa3Var2;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var5;
        this.l = ny8Var6;
        this.m = ny8Var7;
        this.n = ny8Var8;
        Boolean bool = Boolean.FALSE;
        mjg mjgVarA = p90.a(bool);
        this.o = mjgVarA;
        this.p = p90.a(s50.a);
        this.q = new r8e(mjgVarA);
        this.r = yab.b(-2, 0, null, 6);
        this.s = yab.b(-2, 0, null, 6);
        this.u = new o56();
        this.v = new ic6(null);
        mjg mjgVarA2 = p90.a(r66.a);
        this.w = mjgVarA2;
        String[] strArr = wsc.o;
        usc uscVar = new usc(strArr);
        this.x = uscVar;
        usc uscVar2 = new usc(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.y = uscVar2;
        r07 r07Var = new r07(uscVar, uscVar2, new vr9(3, null, 0), 0);
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(r07Var, dq4Var, a8gVar, lhd.a);
        this.z = r8eVarG0;
        this.A = new r07(uscVar, uscVar2, new vr9(3, null, 1), 0);
        this.B = new hz1(r8eVarG0, 6);
        this.C = e9i.G0(new yo0(mjgVarA2, 4), this.b, a8gVar, bool);
        yo0 yo0Var = new yo0(mjgVarA2, 5);
        mjg mjgVar = uw8.f;
        e9i.G0(new r07(yo0Var, mjgVar, new ad1(3, null, 4), 0), this.b, a8gVar, bool);
        e9i.G0(new o24(new r07(mjgVar, mjgVarA2, tr9.h, 0), 12, this), this.b, a8gVar, igf.b);
        this.D = qyj.S();
        this.E = qyj.S();
        this.F = qyj.S();
        this.G = as9.class.getName();
        a8j.t(this, null, new ur9(this, null, 0), 3);
    }

    public static final Object B(as9 as9Var, mdh mdhVar) {
        return yab.K0(((n0c) ((xhh) as9Var.j.getValue())).a(), new ur9(as9Var, null, 2), mdhVar);
    }

    public final ib9 C() {
        return (ib9) this.h.getValue();
    }

    public final ief D() {
        return (ief) this.i.getValue();
    }

    public final boolean E() {
        return this.e.invoke() != null;
    }

    public final boolean F() {
        ArrayList arrayListA = srh.a(D());
        if ((arrayListA.isEmpty() || E()) && (this.t == null || arrayListA.equals(this.t))) {
            return true;
        }
        this.r.c(wq9.a);
        return false;
    }

    public final void G(Long l, boolean z) {
        Long l2 = (Long) this.e.invoke();
        rt2 rt2Var = (rt2) this.c.getValue();
        p41 p41Var = this.r;
        if (!z) {
            int i = uw8.a;
            if (uw8.b(uw8.c)) {
                p41Var.c(uq9.a);
                return;
            }
        }
        if (l2 == null) {
            if (rt2Var == null || !pll.d(rt2Var, (e5d) this.n.getValue(), this.d.h(), l)) {
                H(l);
                return;
            } else {
                a8j.x(this.v, qr9.a);
                return;
            }
        }
        long jLongValue = l2.longValue();
        int iE = ((g5d) ((gjf) this.k.getValue())).e();
        if (D().c() > iE) {
            p41Var.c(new ar9(iE));
            return;
        }
        sgg sggVarH0 = yab.h0(this.b, ((n0c) ((xhh) this.j.getValue())).b(), 2, new i20(this, jLongValue, (lq4) null, 18));
        this.E.B(this, I[1], sggVarH0);
    }

    public final void H(Long l) {
        gm0.n(this.G, "Starting sendMessage");
        this.E.B(this, I[1], a8j.t(this, null, new wz6(this, ((h4b) this.l.getValue()).J(l == null ? 9 : 7), l, null, 12), 1));
        a8j.x(this.v, mr9.a);
    }

    @Override // defpackage.sy9
    public final void k(jef jefVar) {
        this.s.c(new qff(jefVar));
    }

    @Override // defpackage.sy9
    public final void p(jef jefVar) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) ((xhh) this.j.getValue())).a(), 2, new el6(this, jefVar, null, 24));
        this.F.B(this, I[2], sggVarH0);
    }
}
