package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cli {
    public cmi f;
    public cmi g;
    public HashSet h;
    public cmi i;
    public yi0 j;
    public cmi k;
    public Rect l;
    public pf2 n;
    public pf2 o;
    public xxi p;
    public boolean a = false;
    public final HashSet b = new HashSet();
    public final Object c = new Object();
    public final Object d = new Object();
    public int e = 2;
    public Matrix m = new Matrix();
    public oue q = null;
    public final vuf r = new vuf(24, this);
    public lmf s = lmf.a();
    public lmf t = lmf.a();

    public cli(cmi cmiVar) {
        this.g = cmiVar;
        this.i = cmiVar;
    }

    public yi0 A(t94 t94Var) {
        yi0 yi0Var = this.j;
        if (yi0Var == null) {
            c.i("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        tw5 tw5VarB = yi0Var.b();
        tw5VarB.f = t94Var;
        return tw5VarB.j();
    }

    public abstract yi0 B(yi0 yi0Var, yi0 yi0Var2);

    public void C() {
    }

    public void D(Matrix matrix) {
        this.m = new Matrix(matrix);
    }

    public final boolean E(int i) {
        Size size;
        int iY = ((v68) this.i).y(-1);
        if (iY != -1 && iY == i) {
            return false;
        }
        bmi bmiVarN = n(this.g);
        v68 v68Var = (v68) bmiVarN.q();
        int iY2 = v68Var.y(-1);
        if (iY2 == -1 || iY2 != i) {
            r48 r48Var = (r48) bmiVarN;
            switch (r48Var.a) {
                case 0:
                    r48Var.b.m(v68.w0, Integer.valueOf(i));
                    break;
                case 1:
                    r48Var.b.m(v68.w0, Integer.valueOf(i));
                    break;
                case 2:
                    w8b w8bVar = r48Var.b;
                    w8bVar.m(v68.w0, Integer.valueOf(i));
                    w8bVar.m(v68.x0, Integer.valueOf(i));
                    break;
                default:
                    r48Var.b.m(v68.w0, Integer.valueOf(i));
                    break;
            }
        }
        if (iY2 != -1 && i != -1 && iY2 != i) {
            if (Math.abs(njl.c(i) - njl.c(iY2)) % 180 == 90 && (size = (Size) v68Var.b(v68.z0, null)) != null) {
                r48 r48Var2 = (r48) bmiVarN;
                Size size2 = new Size(size.getHeight(), size.getWidth());
                switch (r48Var2.a) {
                    case 0:
                        r48Var2.b.m(v68.z0, size2);
                        break;
                    case 1:
                        r48Var2.b.m(v68.z0, size2);
                        break;
                    case 2:
                        r48Var2.b.m(v68.z0, size2);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.g = bmiVarN.q();
        pf2 pf2VarE = e();
        if (pf2VarE == null) {
            this.i = this.g;
            return true;
        }
        this.i = r(pf2VarE.j(), this.f, this.k);
        return true;
    }

    public void F(Rect rect) {
        this.l = rect;
    }

    public final void G(pf2 pf2Var) {
        C();
        synchronized (this.c) {
            try {
                pf2 pf2Var2 = this.n;
                if (pf2Var == pf2Var2) {
                    this.b.remove(pf2Var2);
                    this.n = null;
                }
                pf2 pf2Var3 = this.o;
                if (pf2Var == pf2Var3) {
                    this.b.remove(pf2Var3);
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            try {
                oue oueVar = this.q;
                if (oueVar != null) {
                    oueVar.b(this.r);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.j = null;
        this.l = null;
        this.i = this.g;
        this.f = null;
        this.k = null;
    }

    public final void H(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.s = (lmf) list.get(0);
        if (list.size() > 1) {
            this.t = (lmf) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (wf5 wf5Var : ((lmf) it.next()).b()) {
                if (wf5Var.j == null) {
                    wf5Var.j = getClass();
                }
            }
        }
    }

    public final void I(yi0 yi0Var, yi0 yi0Var2) {
        this.j = B(yi0Var, yi0Var2);
    }

    public final void a(hmf hmfVar, yi0 yi0Var) {
        Range range = yi0.h;
        if (!range.equals(yi0Var.e)) {
            Range range2 = yi0Var.e;
            j28 j28Var = hmfVar.b;
            j28Var.getClass();
            ((w8b) j28Var.d).m(hl2.h, range2);
            return;
        }
        synchronized (this.c) {
            try {
                pf2 pf2Var = this.n;
                pf2Var.getClass();
                ArrayList arrayListC = pf2Var.j().p().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListC.size() > 1) {
                    z = false;
                }
                qyj.h("There should not have more than one AeFpsRangeQuirk.", z);
                if (!arrayListC.isEmpty()) {
                    Range range3 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListC.get(0))).a.getValue();
                    if (range3 != null) {
                        range = range3;
                    }
                    j28 j28Var2 = hmfVar.b;
                    j28Var2.getClass();
                    ((w8b) j28Var2.d).m(hl2.h, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(pf2 pf2Var, pf2 pf2Var2, cmi cmiVar, cmi cmiVar2) {
        synchronized (this.c) {
            this.n = pf2Var;
            this.o = pf2Var2;
            this.b.add(pf2Var);
            if (pf2Var2 != null) {
                this.b.add(pf2Var2);
            }
        }
        this.f = cmiVar;
        this.k = cmiVar2;
        this.i = r(pf2Var.j(), this.f, this.k);
        synchronized (this.d) {
            try {
                oue oueVar = this.q;
                if (oueVar != null) {
                    oueVar.a(zjl.d(), this.r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u();
    }

    public final int c() {
        return ((Integer) ((v68) this.i).b(v68.x0, -1)).intValue();
    }

    public final Size d() {
        yi0 yi0Var = this.j;
        if (yi0Var != null) {
            return yi0Var.a;
        }
        return null;
    }

    public final pf2 e() {
        pf2 pf2Var;
        synchronized (this.c) {
            pf2Var = this.n;
        }
        return pf2Var;
    }

    public final be2 f() {
        synchronized (this.c) {
            try {
                pf2 pf2Var = this.n;
                if (pf2Var == null) {
                    return be2.a;
                }
                return pf2Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        pf2 pf2VarE = e();
        qyj.k(pf2VarE, "No camera attached to use case: " + this);
        return pf2VarE.j().g();
    }

    public abstract cmi h(boolean z, fmi fmiVar);

    public final String i() {
        String str = (String) this.i.b(wih.S0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int j(pf2 pf2Var, boolean z) {
        int iD = pf2Var.j().D(m());
        return (pf2Var.p() || !z) ? iD : y1i.k(-iD);
    }

    public final pf2 k() {
        pf2 pf2Var;
        synchronized (this.c) {
            pf2Var = this.o;
        }
        return pf2Var;
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public final int m() {
        return ((v68) this.i).y(0);
    }

    public abstract bmi n(t94 t94Var);

    public boolean o() {
        return this instanceof u48;
    }

    public final boolean p(int i) {
        Iterator it = l().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean q(pf2 pf2Var) {
        int iIntValue = ((Integer) ((v68) this.i).b(v68.y0, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return pf2Var.k();
        }
        c.e(zo5.h(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final cmi r(nf2 nf2Var, cmi cmiVar, cmi cmiVar2) {
        w8b w8bVarE;
        if (cmiVar2 != null) {
            w8bVarE = w8b.h(cmiVar2);
            w8bVarE.o(wih.S0);
        } else {
            w8bVarE = w8b.e();
        }
        TreeMap treeMap = w8bVarE.a;
        if (this.g.f(v68.v0) || this.g.f(v68.z0)) {
            bh0 bh0Var = v68.D0;
            if (treeMap.containsKey(bh0Var)) {
                w8bVarE.o(bh0Var);
            }
        }
        cmi cmiVar3 = this.g;
        bh0 bh0Var2 = v68.D0;
        if (cmiVar3.f(bh0Var2)) {
            bh0 bh0Var3 = v68.B0;
            if (treeMap.containsKey(bh0Var3) && ((dne) this.g.i(bh0Var2)).b != null) {
                w8bVarE.o(bh0Var3);
            }
        }
        Iterator it = this.g.c().iterator();
        while (it.hasNext()) {
            t94.n(w8bVarE, w8bVarE, this.g, (bh0) it.next());
        }
        if (cmiVar != null) {
            for (bh0 bh0Var4 : cmiVar.c()) {
                if (!bh0Var4.a.equals(wih.S0.a)) {
                    t94.n(w8bVarE, w8bVarE, cmiVar, bh0Var4);
                }
            }
        }
        if (treeMap.containsKey(v68.z0)) {
            bh0 bh0Var5 = v68.v0;
            if (treeMap.containsKey(bh0Var5)) {
                w8bVarE.o(bh0Var5);
            }
        }
        bh0 bh0Var6 = v68.D0;
        if (treeMap.containsKey(bh0Var6)) {
            ((dne) w8bVarE.i(bh0Var6)).getClass();
        }
        tvj.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.h + ", this = " + this);
        HashSet<kr7> hashSet = this.h;
        if (hashSet != null) {
            int i = hx5.a;
            Range range = yi0.h;
            int i2 = o4j.a;
            for (kr7 kr7Var : hashSet) {
                if (kr7Var instanceof hx5) {
                    throw null;
                }
                if (kr7Var instanceof qa7) {
                    throw null;
                }
            }
            if ((this instanceof igd) || c2m.c(this)) {
                w8bVarE.m(n68.u0, fx5.d);
            }
            w8bVarE.m(cmi.b1, range);
            w8bVarE.m(cmi.h1, 1);
            w8bVarE.m(cmi.i1, 1);
        }
        return w(nf2Var, n(w8bVarE));
    }

    public final void s() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bli) it.next()).c(this);
        }
    }

    public final void t() {
        int iD = qt4.D(this.e);
        HashSet hashSet = this.b;
        if (iD == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((bli) it.next()).i(this);
            }
        } else {
            if (iD != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((bli) it2.next()).r(this);
            }
        }
    }

    public void u() {
    }

    public void v() {
    }

    public cmi w(nf2 nf2Var, bmi bmiVar) {
        return bmiVar.q();
    }

    public void x(int i) {
        E(i);
    }

    public void y() {
        this.a = true;
    }

    public void z() {
        this.a = false;
    }
}
