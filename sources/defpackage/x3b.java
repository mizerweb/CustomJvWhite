package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class x3b {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public x3b(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    public final void a(q3b q3bVar, long j, long[] jArr, long j2) {
        rt2 rt2VarK;
        hm4<gda> hm4Var = q3bVar.d;
        m8b m8bVar = new m8b(hm4Var.size());
        ArrayList arrayList = new ArrayList();
        for (gda gdaVar : hm4Var) {
            if (gdaVar.e != xja.c) {
                arrayList.add(gdaVar);
                m8bVar.a(gdaVar.a);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ny8 ny8Var = this.b;
        if (zIsEmpty) {
            rt2VarK = null;
        } else {
            rt2VarK = ((qw2) this.c.getValue()).K(q3bVar.c);
            if (rt2VarK != null) {
                ny8 ny8Var2 = this.d;
                long jF = ((s7f) ((et3) ny8Var2.getValue())).f();
                qfa qfaVar = (qfa) ny8Var.getValue();
                long j3 = rt2VarK.a;
                long jT = ((s7f) ((et3) ny8Var2.getValue())).t();
                Long lValueOf = Long.valueOf(jF);
                ose oseVar = (ose) qfaVar.b.c();
                oseVar.e().a(new zre(hm4Var, lValueOf, oseVar, j3, jT, false));
            }
        }
        ny8 ny8Var3 = this.a;
        ((t51) ny8Var3.getValue()).c(new t3b(j2, j, rx8.g0(m8bVar), hm4Var, jArr));
        if (rt2VarK != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sfa sfaVarF = ((qfa) ny8Var.getValue()).f(rt2VarK.a, ((gda) it.next()).a);
                if (sfaVarF != null) {
                    ((t51) ny8Var3.getValue()).c(new kfi(rt2VarK.a, sfaVarF.a, false));
                }
            }
        }
        ((wzj) this.e.getValue()).b();
    }
}
