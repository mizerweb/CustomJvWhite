package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class igd extends cli {
    public static final ggd C = new ggd();
    public static final us7 D = zjl.d();
    public xde A;
    public imf B;
    public hgd u;
    public Executor v;
    public hmf w;
    public wf5 x;
    public zbh y;
    public ich z;

    @Override // defpackage.cli
    public final yi0 A(t94 t94Var) {
        this.w.a(t94Var);
        Object[] objArr = {this.w.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
        tw5 tw5VarB = this.j.b();
        tw5VarB.f = t94Var;
        return tw5VarB.j();
    }

    @Override // defpackage.cli
    public final yi0 B(yi0 yi0Var, yi0 yi0Var2) {
        tvj.a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yi0Var + ", secondaryStreamSpec " + yi0Var2);
        L((ugd) this.i, yi0Var);
        return yi0Var;
    }

    @Override // defpackage.cli
    public final void C() {
        J();
    }

    @Override // defpackage.cli
    public final void F(Rect rect) {
        this.l = rect;
        pf2 pf2VarE = e();
        zbh zbhVar = this.y;
        if (pf2VarE == null || zbhVar == null) {
            return;
        }
        wxl.d(new q31(zbhVar, j(pf2VarE, q(pf2VarE)), c(), 6));
    }

    public final void J() {
        imf imfVar = this.B;
        if (imfVar != null) {
            imfVar.b();
            this.B = null;
        }
        wf5 wf5Var = this.x;
        if (wf5Var != null) {
            wf5Var.a();
            this.x = null;
        }
        xde xdeVar = this.A;
        if (xdeVar != null) {
            xdeVar.P();
            this.A = null;
        }
        zbh zbhVar = this.y;
        if (zbhVar != null) {
            zbhVar.c();
            this.y = null;
        }
        ich ichVar = this.z;
        if (ichVar != null) {
            ichVar.a();
        }
        this.z = null;
    }

    public final void K(hgd hgdVar) {
        wxl.a();
        if (hgdVar == null) {
            this.u = null;
            this.e = 2;
            t();
            return;
        }
        this.u = hgdVar;
        this.v = D;
        if (d() != null) {
            L((ugd) this.i, this.j);
            s();
        }
        this.e = 1;
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(ugd ugdVar, yi0 yi0Var) {
        wxl.a();
        pf2 pf2VarE = e();
        Objects.requireNonNull(pf2VarE);
        J();
        qyj.l(null, this.y == null);
        Matrix matrix = this.m;
        boolean zP = pf2VarE.p();
        Size size = yi0Var.a;
        Rect rect = this.l;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        zbh zbhVar = new zbh(1, 34, yi0Var, matrix, zP, rect, j(pf2VarE, q(pf2VarE)), c(), pf2VarE.p() && q(pf2VarE));
        this.y = zbhVar;
        xxi xxiVar = this.p;
        if (xxiVar != null) {
            this.A = new xde(pf2VarE, new euc(xxiVar), "Preview");
            this.y.a(new h7b(10, this));
            zbh zbhVar2 = this.y;
            int i = zbhVar2.f;
            int i2 = zbhVar2.a;
            Rect rect2 = zbhVar2.d;
            ei0 ei0Var = new ei0(UUID.randomUUID(), i, i2, rect2, y1i.h(zbhVar2.i, y1i.f(rect2)), zbhVar2.i, zbhVar2.e, false);
            zbh zbhVar3 = (zbh) this.A.T(new bj0(this.y, Collections.singletonList(ei0Var))).get(ei0Var);
            Objects.requireNonNull(zbhVar3);
            zbhVar3.a(new i7b(this, 17, pf2VarE));
            this.z = zbhVar3.d(pf2VarE, true);
            zbh zbhVar4 = this.y;
            zbhVar4.getClass();
            wxl.a();
            zbhVar4.b();
            qyj.l("Consumer can only be linked once.", !zbhVar4.j);
            zbhVar4.j = true;
            this.x = zbhVar4.l;
        } else {
            zbhVar.a(new h7b(10, this));
            ich ichVarD = this.y.d(pf2VarE, true);
            this.z = ichVarD;
            this.x = ichVarD.m;
        }
        if (this.u != null) {
            pf2 pf2VarE2 = e();
            zbh zbhVar5 = this.y;
            if (pf2VarE2 != null && zbhVar5 != null) {
                wxl.d(new q31(zbhVar5, j(pf2VarE2, q(pf2VarE2)), c(), 6));
            }
            hgd hgdVar = this.u;
            hgdVar.getClass();
            ich ichVar = this.z;
            ichVar.getClass();
            this.v.execute(new i7b(hgdVar, 18, ichVar));
        }
        hmf hmfVarD = hmf.d(ugdVar, yi0Var.a);
        j28 j28Var = hmfVarD.b;
        hmfVarD.h = yi0Var.d;
        a(hmfVarD, yi0Var);
        int iU = ugdVar.u();
        if (iU != 0) {
            j28Var.getClass();
            if (iU != 0) {
                ((w8b) j28Var.d).m(cmi.h1, Integer.valueOf(iU));
            }
        }
        t94 t94Var = yi0Var.f;
        if (t94Var != null) {
            j28Var.o(t94Var);
        }
        if (this.u != null) {
            hmfVarD.b(this.x, yi0Var.c, ((Integer) ((v68) this.i).b(v68.y0, -1)).intValue());
        }
        imf imfVar = this.B;
        if (imfVar != null) {
            imfVar.b();
        }
        imf imfVar2 = new imf(new v58(1, this));
        this.B = imfVar2;
        hmfVarD.f = imfVar2;
        this.w = hmfVarD;
        Object[] objArr = {hmfVarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        H(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.cli
    public final cmi h(boolean z, fmi fmiVar) {
        C.getClass();
        ugd ugdVar = ggd.a;
        t94 t94VarA = fmiVar.a(ugdVar.L(), 1);
        if (z) {
            t94VarA = t94.I(t94VarA, ugdVar);
        }
        if (t94VarA == null) {
            return null;
        }
        return new ugd(dhc.a(((r48) n(t94VarA)).b));
    }

    @Override // defpackage.cli
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.cli
    public final bmi n(t94 t94Var) {
        return new r48(w8b.h(t94Var), 2);
    }

    public final String toString() {
        return "Preview:".concat(i());
    }

    @Override // defpackage.cli
    public final cmi w(nf2 nf2Var, bmi bmiVar) {
        bmiVar.g().m(n68.s0, 34);
        return bmiVar.q();
    }
}
