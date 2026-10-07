package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b7i extends a8j {
    public static final /* synthetic */ zv8[] G = {new z8b(b7i.class, "checkPasswordJob", "getCheckPasswordJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, b7i.class, "passwordChangeJob", "getPasswordChangeJob()Lkotlinx/coroutines/Job;"), new z8b(b7i.class, "checkHintJob", "getCheckHintJob()Lkotlinx/coroutines/Job;"), new z8b(b7i.class, "addEmailJob", "getAddEmailJob()Lkotlinx/coroutines/Job;"), new z8b(b7i.class, "requestNewCodeJob", "getRequestNewCodeJob()Lkotlinx/coroutines/Job;")};
    public final p3c A;
    public final p3c B;
    public final p3c C;
    public sgg D;
    public sgg E;
    public sgg F;
    public final w6i c;
    public final v6i d;
    public final mk8 e;
    public final String f;
    public final pk8 g;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final mjg o;
    public final r8e p;
    public final AtomicReference q;
    public final AtomicReference r;
    public final mjg s;
    public final r8e t;
    public final ic6 u;
    public final ic6 v;
    public final ic6 w;
    public sgg x;
    public final p3c y;
    public final p3c z;
    public final String h = b7i.class.getName();
    public final ifh n = new ifh(new bpg(27, this));

    public b7i(w6i w6iVar, v6i v6iVar, mk8 mk8Var, String str, pk8 pk8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.c = w6iVar;
        this.d = v6iVar;
        this.e = mk8Var;
        this.f = str;
        this.g = pk8Var;
        this.i = ny8Var;
        this.j = ny8Var2;
        this.k = ny8Var3;
        this.l = ny8Var4;
        this.m = ny8Var5;
        mjg mjgVarA = p90.a(null);
        this.o = mjgVarA;
        this.p = new r8e(mjgVarA);
        this.q = new AtomicReference(null);
        this.r = new AtomicReference(null);
        mjg mjgVarA2 = p90.a(0L);
        this.s = mjgVarA2;
        this.t = e9i.G0(new yo0(mjgVarA2, 8), this.b, j0g.a, null);
        this.u = new ic6(null);
        this.v = new ic6(null);
        this.w = new ic6(null);
        this.y = qyj.S();
        this.z = qyj.S();
        this.A = qyj.S();
        this.B = qyj.S();
        this.C = qyj.S();
        yab.i0(this.b, null, 0, new hpf(this, null, 14), 3);
    }

    public final void B(pk8 pk8Var) {
        sgg sggVar = this.E;
        if (sggVar == null || !sggVar.isActive()) {
            if (pk8Var == null) {
                pk8Var = this.g;
            }
            if (pk8Var != null) {
                this.E = a8j.t(this, ((n0c) E()).b(), new xra(this, pk8Var, (lq4) null, 26), 2);
                return;
            }
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "Final step: Can't create 2FA because navData is null", null, null, 8);
            }
        }
    }

    public final void C(pk8 pk8Var) {
        if (pk8Var == null) {
            pk8Var = this.g;
        }
        if (pk8Var == null) {
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "Can't finish restore because navData is null", null, null, 8);
                return;
            }
            return;
        }
        sgg sggVar = this.F;
        if (sggVar != null && sggVar.isActive()) {
            gm0.Y(this.h, "Don't need start finish restore if it in process now");
            return;
        }
        a8j.x(this.u, new l7i(true));
        int iOrdinal = this.e.ordinal();
        lq4 lq4Var = null;
        if (iOrdinal == 0) {
            this.F = a8j.t(this, ((n0c) E()).b(), new tt6(this, pk8Var, lq4Var, 5), 2);
        } else if (iOrdinal == 1) {
            this.F = a8j.t(this, ((n0c) E()).b(), new p7g(this, pk8Var, lq4Var, 13), 2);
        } else {
            ore.o();
        }
    }

    public final m6i D() {
        return (m6i) this.n.getValue();
    }

    public final xhh E() {
        return (xhh) this.i.getValue();
    }

    @Override // defpackage.a8j
    public final void y() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.x;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.x = null;
        this.E = null;
        this.D = null;
    }
}
