package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hre {
    public static final vv2 g = new vv2(6);
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ifh f = new ifh(d5d.h);

    public hre(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var3;
        this.b = ny8Var4;
        this.c = ny8Var5;
        this.d = ny8Var;
        this.e = ny8Var2;
    }

    public final ox2 a(jy2 jy2Var) {
        ConcurrentHashMap concurrentHashMapF = f();
        long j = jy2Var.a;
        nx2 nx2Var = jy2Var.c;
        se7.a(concurrentHashMapF, j, nx2Var);
        return new ox2(jy2Var.a, nx2Var);
    }

    public final Object b(long j, nq4 nq4Var) {
        String name = hre.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.j(j, "delete "), null);
            }
        }
        Object objB = ((j35) this.e.getValue()).b(new cre(this, j, null), nq4Var);
        return objB == hu4.a ? objB : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(nq4 nq4Var) {
        dre dreVar;
        if (nq4Var instanceof dre) {
            dreVar = (dre) nq4Var;
            int i = dreVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dreVar.f = i - Integer.MIN_VALUE;
            } else {
                dreVar = new dre(this, nq4Var);
            }
        } else {
            dreVar = new dre(this, nq4Var);
        }
        Object obj = dreVar.d;
        int i2 = dreVar.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            gh3 gh3VarE = e();
            dreVar.f = 1;
            ph3 ph3Var = (ph3) gh3VarE;
            Object objH = ch3.H(dreVar, new m25(ph3Var, null, 3), ph3Var.a);
            if (objH != hu4Var) {
                objH = sbiVar;
            }
            if (objH != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        f().clear();
        p0f p0fVarG = g();
        dreVar.f = 2;
        Object objI = ch3.I(dreVar, p0fVarG.a, false, true, new skd(23));
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0067 -> B:20:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:26:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a8 -> B:27:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c1 -> B:32:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.m8b r23, defpackage.nq4 r24) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hre.d(m8b, nq4):java.lang.Object");
    }

    public final gh3 e() {
        return (gh3) this.a.getValue();
    }

    public final ConcurrentHashMap f() {
        return ((se7) this.f.getValue()).a;
    }

    public final p0f g() {
        return (p0f) this.b.getValue();
    }

    public final long h(nx2 nx2Var) {
        return ((Number) ((j35) this.e.getValue()).a(new k9d(this, 28, nx2Var))).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j, nq4 nq4Var) {
        fre freVar;
        if (nq4Var instanceof fre) {
            freVar = (fre) nq4Var;
            int i = freVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                freVar.f = i - Integer.MIN_VALUE;
            } else {
                freVar = new fre(this, nq4Var);
            }
        } else {
            freVar = new fre(this, nq4Var);
        }
        Object objI = freVar.d;
        int i2 = freVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            gh3 gh3VarE = e();
            freVar.f = 1;
            ph3 ph3Var = (ph3) gh3VarE;
            objI = ch3.I(freVar, ph3Var.a, true, false, new hh3(j, ph3Var, 0));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        jy2 jy2Var = (jy2) objI;
        if (jy2Var != null) {
            return a(jy2Var);
        }
        return null;
    }

    public final ox2 j(long j) {
        Object next;
        ph3 ph3Var = (ph3) e();
        Iterator it = ((List) ch3.G(ph3Var.a, true, false, new hh3(j, ph3Var, 2))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((jy2) next).c.b != lx2.a);
        jy2 jy2Var = (jy2) next;
        if (jy2Var != null) {
            return a(jy2Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object k(long j, nx2 nx2Var, nq4 nq4Var) {
        gre greVar;
        long j2;
        nx2 nx2Var2;
        if (nq4Var instanceof gre) {
            greVar = (gre) nq4Var;
            int i = greVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                greVar.h = i - Integer.MIN_VALUE;
            } else {
                greVar = new gre(this, nq4Var);
            }
        } else {
            greVar = new gre(this, nq4Var);
        }
        Object objH = greVar.f;
        int i2 = greVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objH);
            gh3 gh3VarE = e();
            ConcurrentHashMap concurrentHashMapF = f();
            greVar.e = nx2Var;
            greVar.d = j;
            greVar.h = 1;
            ph3 ph3Var = (ph3) gh3VarE;
            objH = ch3.H(greVar, new oh3(ph3Var, j, nx2Var, concurrentHashMapF, null), ph3Var.a);
            if (objH != hu4Var) {
                j2 = j;
                nx2Var2 = nx2Var;
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objH);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = greVar.d;
        nx2Var2 = greVar.e;
        ch3.d0(objH);
        long jLongValue = ((Number) objH).longValue();
        ny8 ny8Var = this.d;
        if (nx2Var2.e(((l7f) ny8Var.getValue()).a())) {
            p0f p0fVarG = g();
            long jA = ((l7f) ny8Var.getValue()).a();
            greVar.e = null;
            greVar.d = j2;
            greVar.h = 2;
            Object objI = ch3.I(greVar, p0fVarG.a, false, true, new x14(12, jA, jLongValue));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    public final void l(long j, nx2 nx2Var) {
        gh3 gh3VarE = e();
        ph3 ph3Var = (ph3) gh3VarE;
        long jLongValue = ((Number) ch3.G(ph3Var.a, false, true, new ih3(ph3Var, j, nx2Var, f()))).longValue();
        ny8 ny8Var = this.d;
        if (nx2Var.e(((l7f) ny8Var.getValue()).a())) {
            ch3.G(g().a, false, true, new o0f(((l7f) ny8Var.getValue()).a(), jLongValue));
        }
    }
}
