package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp0 extends aq implements qih, btc {
    public static final List g = xw3.P0(ctc.TYPE_ASSETS_ADD, ctc.TYPE_ASSETS_REMOVE, ctc.TYPE_ASSETS_MOVE, ctc.TYPE_ASSETS_LIST_MODIFY);
    public final int f;

    public zp0(long j, int i) {
        super(j);
        this.f = i;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        xkh xkhVarB = bqVar.k().c().b();
        xkhVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks where type in (");
        List list = g;
        if (((Number) ch3.G(xkhVarB.a, true, false, new tj1(10, xkhVarB, nbh.x(")", sb, list), list))).longValue() > 1) {
            bq bqVar2 = this.e;
            ((wzj) (bqVar2 != null ? bqVar2 : null).g.getValue()).b();
        }
        w(kihVar);
    }

    @Override // defpackage.btc
    public final void d() {
        int i = this.f;
        int iD = qt4.D(i);
        if (iD == 3) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            ((um6) bqVar.q.getValue()).m();
        } else if (iD != 4) {
            gm0.Y(getClass().getName(), "unsuspporeted type ".concat(qt4.E(i)));
        } else {
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            ((ldh) bqVar2.r.getValue()).r();
        }
        bq bqVar3 = this.e;
        (bqVar3 != null ? bqVar3 : null).k().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (p90.C(yhhVar.b)) {
            return;
        }
        d();
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.b().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final atc j() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        List listK = bqVar.k().k(g);
        Iterator it = listK.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            long j = this.a;
            if (!zHasNext) {
                return ((tjh) listK.get(0)).a != j ? atc.b : atc.a;
            }
            tjh tjhVar = (tjh) it.next();
            if (tjhVar.a == j && (tjhVar.f instanceof oy)) {
                return atc.c;
            }
        }
    }

    @Override // defpackage.btc
    public final int l() {
        return 10;
    }

    public abstract void w(kih kihVar);

    public final void x(long j) {
        int i = this.f;
        if (i != 4) {
            if (i == 5) {
                bq bqVar = this.e;
                ((ldh) (bqVar != null ? bqVar : null).r.getValue()).t(j);
                return;
            }
            return;
        }
        bq bqVar2 = this.e;
        um6 um6Var = (um6) (bqVar2 != null ? bqVar2 : null).q.getValue();
        gm0.m(um6Var.a, "setSectionUpdateTime: %d", Long.valueOf(j));
        s7f s7fVar = (s7f) ((et3) um6Var.d.getValue());
        s7fVar.T.B(s7fVar, s7f.j0[42], Long.valueOf(j));
    }
}
