package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yq3 implements xye, vhf, w99, z99 {
    public final int a;
    public final int[] b;
    public final b87[] c;
    public final boolean[] d;
    public final e15 e;
    public final r15 f;
    public final ed7 g;
    public final l6m h;
    public final dc9 i;
    public final n11 j;
    public final ArrayList k;
    public final List l;
    public final wye m;
    public final wye[] n;
    public final uvc o;
    public uq3 p;
    public b87 q;
    public r15 r;
    public long s;
    public long t;
    public int u;
    public qr0 v;
    public boolean w;
    public boolean x;
    public boolean y;

    public yq3(int i, int[] iArr, b87[] b87VarArr, e15 e15Var, r15 r15Var, qf qfVar, long j, ev5 ev5Var, av5 av5Var, l6m l6mVar, ed7 ed7Var, boolean z, she sheVar) {
        this.a = i;
        this.b = iArr;
        this.c = b87VarArr;
        this.e = e15Var;
        this.f = r15Var;
        this.g = ed7Var;
        this.h = l6mVar;
        this.w = z;
        this.i = sheVar != null ? new dc9(sheVar) : new dc9("ChunkSampleStream", 1);
        this.j = new n11(4);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new wye[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        wye[] wyeVarArr = new wye[i2];
        ev5Var.getClass();
        wye wyeVar = new wye(qfVar, ev5Var, av5Var);
        this.m = wyeVar;
        int i3 = 0;
        iArr2[0] = i;
        wyeVarArr[0] = wyeVar;
        while (i3 < length) {
            wye wyeVar2 = new wye(qfVar, null, null);
            this.n[i3] = wyeVar2;
            int i4 = i3 + 1;
            wyeVarArr[i4] = wyeVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.o = new uvc(iArr2, 5, wyeVarArr);
        this.s = j;
        this.t = j;
    }

    public final boolean A() {
        return this.s != -9223372036854775807L;
    }

    public final void B() {
        int iC = C(this.m.t(), this.u - 1);
        while (true) {
            int i = this.u;
            if (i > iC) {
                return;
            }
            this.u = i + 1;
            qr0 qr0Var = (qr0) this.k.get(i);
            b87 b87Var = qr0Var.d;
            if (!b87Var.equals(this.q)) {
                this.g.E(this.a, b87Var, qr0Var.e, qr0Var.f, qr0Var.g);
            }
            this.q = b87Var;
        }
    }

    public final int C(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((qr0) arrayList.get(i2)).c(0) <= i);
        return i2 - 1;
    }

    public final void D(r15 r15Var) {
        this.r = r15Var;
        wye wyeVar = this.m;
        wyeVar.k();
        xu5 xu5Var = wyeVar.h;
        if (xu5Var != null) {
            xu5Var.f(wyeVar.e);
            wyeVar.h = null;
            wyeVar.g = null;
        }
        for (wye wyeVar2 : this.n) {
            wyeVar2.k();
            xu5 xu5Var2 = wyeVar2.h;
            if (xu5Var2 != null) {
                xu5Var2.f(wyeVar2.e);
                wyeVar2.h = null;
                wyeVar2.g = null;
            }
        }
        this.i.L(this);
    }

    @Override // defpackage.xye
    public final void b() throws IOException {
        dc9 dc9Var = this.i;
        dc9Var.b();
        this.m.z();
        if (dc9Var.J()) {
            return;
        }
        this.e.b();
    }

    @Override // defpackage.w99
    public final void d(y99 y99Var, long j, long j2, boolean z) {
        uq3 uq3Var = (uq3) y99Var;
        this.p = null;
        this.v = null;
        long j3 = uq3Var.a;
        a35 a35Var = uq3Var.b;
        lkg lkgVar = uq3Var.i;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.h.getClass();
        this.g.N(t99Var, uq3Var.c, this.a, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h);
        if (z) {
            return;
        }
        if (A()) {
            this.m.D(false);
            for (wye wyeVar : this.n) {
                wyeVar.D(false);
            }
        } else if (uq3Var instanceof qr0) {
            ArrayList arrayList = this.k;
            q(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f.q(this);
    }

    @Override // defpackage.vhf
    public final long e() {
        if (A()) {
            return this.s;
        }
        if (this.y) {
            return Long.MIN_VALUE;
        }
        return r().h;
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        if (A()) {
            return -3;
        }
        qr0 qr0Var = this.v;
        wye wyeVar = this.m;
        if (qr0Var != null && qr0Var.c(0) <= wyeVar.t()) {
            return -3;
        }
        B();
        return wyeVar.C(v2aVar, u55Var, i, this.y);
    }

    @Override // defpackage.w99
    public final void h(y99 y99Var, long j, long j2) {
        uq3 uq3Var = (uq3) y99Var;
        this.p = null;
        this.e.e(uq3Var);
        long j3 = uq3Var.a;
        a35 a35Var = uq3Var.b;
        lkg lkgVar = uq3Var.i;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        this.h.getClass();
        this.g.O(t99Var, uq3Var.c, this.a, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h);
        this.f.q(this);
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.i.J();
    }

    @Override // defpackage.z99
    public final void l() {
        wye wyeVar = this.m;
        wyeVar.D(true);
        xu5 xu5Var = wyeVar.h;
        if (xu5Var != null) {
            xu5Var.f(wyeVar.e);
            wyeVar.h = null;
            wyeVar.g = null;
        }
        for (wye wyeVar2 : this.n) {
            wyeVar2.D(true);
            xu5 xu5Var2 = wyeVar2.h;
            if (xu5Var2 != null) {
                xu5Var2.f(wyeVar2.e);
                wyeVar2.h = null;
                wyeVar2.g = null;
            }
        }
        this.e.release();
        r15 r15Var = this.r;
        if (r15Var != null) {
            synchronized (r15Var) {
                w3d w3dVar = (w3d) r15Var.n.remove(this);
                if (w3dVar != null) {
                    wye wyeVar3 = w3dVar.a;
                    wyeVar3.D(true);
                    xu5 xu5Var3 = wyeVar3.h;
                    if (xu5Var3 != null) {
                        xu5Var3.f(wyeVar3.e);
                        wyeVar3.h = null;
                        wyeVar3.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.xye
    public final boolean m() {
        return !A() && this.m.x(this.y);
    }

    @Override // defpackage.xye
    public final int o(long j) throws Throwable {
        if (A()) {
            return 0;
        }
        boolean z = this.y;
        wye wyeVar = this.m;
        int iV = wyeVar.v(j, z);
        qr0 qr0Var = this.v;
        if (qr0Var != null) {
            iV = Math.min(iV, qr0Var.c(0) - wyeVar.t());
        }
        wyeVar.G(iV);
        B();
        return iV;
    }

    @Override // defpackage.w99
    public final void p(y99 y99Var, long j, long j2, int i) {
        t99 t99Var;
        uq3 uq3Var = (uq3) y99Var;
        if (i == 0) {
            long j3 = uq3Var.a;
            t99Var = new t99(j, uq3Var.b);
        } else {
            long j4 = uq3Var.a;
            a35 a35Var = uq3Var.b;
            lkg lkgVar = uq3Var.i;
            t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        }
        this.g.R(t99Var, uq3Var.c, this.a, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h, i);
    }

    public final qr0 q(int i) {
        ArrayList arrayList = this.k;
        qr0 qr0Var = (qr0) arrayList.get(i);
        vqi.f0(i, arrayList.size(), arrayList);
        this.u = Math.max(this.u, arrayList.size());
        int i2 = 0;
        this.m.n(qr0Var.c(0));
        while (true) {
            wye[] wyeVarArr = this.n;
            if (i2 >= wyeVarArr.length) {
                return qr0Var;
            }
            wye wyeVar = wyeVarArr[i2];
            i2++;
            wyeVar.n(qr0Var.c(i2));
        }
    }

    public final qr0 r() {
        return (qr0) qv1.f(1, this.k);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        long j;
        List list;
        if (!this.y) {
            dc9 dc9Var = this.i;
            if (!dc9Var.J() && !dc9Var.I()) {
                boolean zA = A();
                if (zA) {
                    list = Collections.EMPTY_LIST;
                    j = this.s;
                } else {
                    j = r().h;
                    list = this.l;
                }
                this.e.d(fa9Var, j, list, this.j);
                n11 n11Var = this.j;
                boolean z = n11Var.b;
                uq3 uq3Var = (uq3) n11Var.c;
                n11Var.c = null;
                n11Var.b = false;
                if (z) {
                    this.s = -9223372036854775807L;
                    this.y = true;
                    return true;
                }
                if (uq3Var != null) {
                    this.p = uq3Var;
                    boolean z2 = uq3Var instanceof qr0;
                    uvc uvcVar = this.o;
                    if (z2) {
                        qr0 qr0Var = (qr0) uq3Var;
                        if (zA) {
                            long j2 = qr0Var.g;
                            long j3 = this.s;
                            if (j2 < j3) {
                                this.m.t = j3;
                                for (wye wyeVar : this.n) {
                                    wyeVar.t = this.s;
                                }
                                if (this.w) {
                                    b87 b87Var = qr0Var.d;
                                    this.x = !uya.a(b87Var.n, b87Var.k);
                                }
                            }
                            this.w = false;
                            this.s = -9223372036854775807L;
                        }
                        qr0Var.m = uvcVar;
                        wye[] wyeVarArr = (wye[]) uvcVar.c;
                        int[] iArr = new int[wyeVarArr.length];
                        for (int i = 0; i < wyeVarArr.length; i++) {
                            wye wyeVar2 = wyeVarArr[i];
                            iArr[i] = wyeVar2.q + wyeVar2.p;
                        }
                        qr0Var.n = iArr;
                        this.k.add(qr0Var);
                    } else if (uq3Var instanceof dg8) {
                        ((dg8) uq3Var).k = uvcVar;
                    }
                    dc9Var.N(uq3Var, this, this.h.o(uq3Var.c));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vhf
    public final long v() {
        if (this.y) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.s;
        }
        long jMax = this.t;
        qr0 qr0VarR = r();
        if (!qr0VarR.b()) {
            ArrayList arrayList = this.k;
            qr0VarR = arrayList.size() > 1 ? (qr0) qv1.f(2, arrayList) : null;
        }
        if (qr0VarR != null) {
            jMax = Math.max(jMax, qr0VarR.h);
        }
        return Math.max(jMax, this.m.q());
    }

    @Override // defpackage.w99
    public final dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        dc1 dc1Var;
        uq3 uq3Var = (uq3) y99Var;
        long j3 = uq3Var.i.b;
        boolean z = uq3Var instanceof qr0;
        ArrayList arrayList = this.k;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && z(size)) ? false : true;
        a35 a35Var = uq3Var.b;
        lkg lkgVar = uq3Var.i;
        boolean z3 = z2;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, j3);
        vqi.p0(uq3Var.g);
        vqi.p0(uq3Var.h);
        mf mfVar = new mf(iOException, i, 7);
        e15 e15Var = this.e;
        l6m l6mVar = this.h;
        if (!e15Var.j(uq3Var, z3, mfVar, l6mVar)) {
            dc1Var = null;
        } else if (z3) {
            if (z) {
                lvb.b0(q(size) == uq3Var);
                if (arrayList.isEmpty()) {
                    this.s = this.t;
                }
            }
            dc1Var = dc9.f;
        } else {
            lvb.G0("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            dc1Var = null;
        }
        if (dc1Var == null) {
            long jQ = l6mVar.q(mfVar);
            dc1Var = jQ != -9223372036854775807L ? new dc1(0, jQ, false) : dc9.g;
        }
        boolean zF = dc1Var.f();
        this.g.P(t99Var, uq3Var.c, this.a, uq3Var.d, uq3Var.e, uq3Var.f, uq3Var.g, uq3Var.h, iOException, !zF);
        if (!zF) {
            this.p = null;
            l6mVar.getClass();
            this.f.q(this);
        }
        return dc1Var;
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        dc9 dc9Var = this.i;
        if (dc9Var.I() || A()) {
            return;
        }
        boolean zJ = dc9Var.J();
        List list = this.l;
        e15 e15Var = this.e;
        ArrayList arrayList = this.k;
        if (zJ) {
            uq3 uq3Var = this.p;
            uq3Var.getClass();
            boolean z = uq3Var instanceof qr0;
            if (!(z && z(arrayList.size() - 1)) && e15Var.f(j, uq3Var, list)) {
                dc9Var.A();
                if (z) {
                    this.v = (qr0) uq3Var;
                    return;
                }
                return;
            }
            return;
        }
        int i = e15Var.i(j, list);
        if (i < arrayList.size()) {
            lvb.b0(!dc9Var.J());
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (!z(i)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            long j2 = r().h;
            qr0 qr0VarQ = q(i);
            if (arrayList.isEmpty()) {
                this.s = this.t;
            }
            this.y = false;
            this.g.W(this.a, qr0VarQ.g, j2);
        }
    }

    public final boolean z(int i) {
        int iT;
        qr0 qr0Var = (qr0) this.k.get(i);
        if (this.m.t() > qr0Var.c(0)) {
            return true;
        }
        int i2 = 0;
        do {
            wye[] wyeVarArr = this.n;
            if (i2 >= wyeVarArr.length) {
                return false;
            }
            iT = wyeVarArr[i2].t();
            i2++;
        } while (iT <= qr0Var.c(i2));
        return true;
    }
}
