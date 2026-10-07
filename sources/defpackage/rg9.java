package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class rg9 extends wu3 {
    public static final rg9 i;
    public static volatile boolean j;
    public static volatile boolean k;
    public static volatile wd4 l;
    public static final AtomicInteger m;
    public static volatile sgg n;

    static {
        bsc bscVar = new bsc(yyh.k);
        drc drcVar = new drc();
        drcVar.c = true;
        drcVar.b("login");
        drcVar.b = bscVar;
        i = new rg9(drcVar.a());
        j = true;
        k = true;
        m = new AtomicInteger(0);
    }

    @Override // defpackage.wu3
    public final void A() {
        String str = this.g;
        owh owhVar = str != null ? new owh(str) : null;
        String str2 = owhVar != null ? owhVar.a : null;
        if (str2 != null) {
            qrc.k(i, "app_start_to_connection", 0, str2, false, null, null, 120);
            return;
        }
        String str3 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, "Invoked 'onAppStarted', but traceId is null or empty!", null);
        }
    }

    @Override // defpackage.wu3
    public final String B(p1f p1fVar) {
        return qrc.x(this, null, p90.O(1, "warm_start"), null, null, 13);
    }

    public final void D(mg9 mg9Var, String str) {
        String str2 = this.g;
        owh owhVar = str2 != null ? new owh(str2) : null;
        String str3 = owhVar != null ? owhVar.a : null;
        if (str3 != null) {
            qrc.o(i, mg9Var, str3, null, str, 20);
            return;
        }
        String str4 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str4, "Invoked 'fail', but traceId is null or empty!", null);
        }
    }

    public final void E(wd4 wd4Var) {
        je9 je9Var = je9.f;
        lq4 lq4Var = null;
        if (wd4Var == null) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "No connection info, skipping listening to connection", null);
                return;
            }
            return;
        }
        sgg sggVar = n;
        int i2 = 1;
        if (sggVar == null || !sggVar.isActive()) {
            n = tre.m0(new fz6(new jz(new j3(new qg9(e9i.o(new qob(wd4Var, lq4Var, 17)), 0), 25, wd4Var), 11), new yh8(2, lq4Var, i2), 3), new krc(this.a.d()));
            return;
        }
        String str2 = this.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Already listening to connection info", null);
        }
    }

    public final void F(boolean z) {
        String str = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("Setting isFirstLogin=", z), null);
            }
        }
        k = z;
        if (z) {
            j = true;
        }
    }

    @Override // defpackage.zqc
    public final b9b a(pxa pxaVar) {
        E(l);
        return q1f.b;
    }

    @Override // defpackage.zqc
    public final void b(pxa pxaVar, b9b b9bVar) {
        if (cqk.d(b9bVar.d("connection_type"), b9bVar.d("init_connection_type"))) {
            b9bVar.m("init_connection_type");
        }
    }

    @Override // defpackage.zqc
    public final b9b d(pxa pxaVar) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        rg9 rg9Var = i;
        b9bVar.k("class", Byte.valueOf(rg9Var.a.c().a()));
        b9bVar.k("connection_type", Integer.valueOf(rg9Var.a.c().b()));
        if (k) {
            b9bVar.k("is_first_login", 1);
        }
        if (!((gue) rg9Var.a.c().c.getValue()).e()) {
            b9bVar.k("background", 1);
        }
        return b9bVar;
    }

    @Override // defpackage.wu3
    public final void z(int i2) throws IllegalAccessException, InvocationTargetException {
        if (i2 == 1) {
            F(false);
        }
        sgg sggVar = n;
        if (sggVar != null) {
            sggVar.b(null);
        }
        n = null;
    }
}
